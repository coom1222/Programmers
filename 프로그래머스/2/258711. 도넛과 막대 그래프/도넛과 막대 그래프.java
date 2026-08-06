class Solution {
    public int[] solution(int[][] edges) {
        int[] in = new int[1000001];
        int[] out = new int[1000001];

        int maxNode = 0;

        for (int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];

            out[from]++;
            in[to]++;

            maxNode = Math.max(maxNode, Math.max(from, to));
        }

        int created = 0;
        int bar = 0;
        int eight = 0;

        for (int i = 1; i <= maxNode; i++) {
            // 생성한 정점
            if (in[i] == 0 && out[i] >= 2) {
                created = i;
            }

            // 막대 그래프의 끝점
            if (in[i] > 0 && out[i] == 0) {
                bar++;
            }

            // 8자 그래프의 중심 정점
            if (in[i] >= 2 && out[i] == 2) {
                eight++;
            }
        }

        int totalGraph = out[created];
        int donut = totalGraph - bar - eight;

        return new int[]{created, donut, bar, eight};
    }
}