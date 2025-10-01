import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 사다리 수
        int M = sc.nextInt(); // 뱀의 수

        // 1. 게임판 준비
        int[] board = new int[101]; // 1~100 칸
        for (int i = 1; i <= 100; i++) {
            board[i] = i; // 뱀과 사다리가 없으면 자기 자신으로 이동
        }

        // 사다리 정보
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            board[x] = y; // x에 도착하면 y로 이동
        }

        // 뱀 정보
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            board[u] = v; // u에 도착하면 v로 이동
        }

        // BFS 알고리즘 구현
        int[] visited = new int[101]; // 각 칸까지의 주사위 굴린 횟수
        for (int i = 0; i <= 100; i++) {
            visited[i] = -1; // -1로 초기화
        }

        Queue<Integer> q = new LinkedList<>(); // 큐 생성

        // 시작점 설정
        q.add(1);
        visited[1] = 0; // 1번 칸은 0번 굴렸으므로 0

        while (!q.isEmpty()) {
            // 방문한 노드를 큐에서 출력
            int current = q.poll();

            // 큐가 100번 칸에 도착하면 종료
            if (current == 100) {
                System.out.println(visited[100]);   // 100번 칸에 도착하기 위한 최소 주사위 굴린 횟수
                return;
            }

            // 주사위의 눈은 1~6
            for (int i = 1; i <= 6; i++) {
                int next = current + i;

                // 주사위를 던졌을 때 100을 넘으면 안됨
                if (next > 100) {
                    continue;
                }

                int lastPosition = board[next];

                if (visited[lastPosition] == -1) {  // 방문하지 않은 노드(칸)라면 표시하고 큐에 삽입
                    visited[lastPosition] = visited[current] + 1;
                    q.add(lastPosition);
                }
            }
        }
    }
}