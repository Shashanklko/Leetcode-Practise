class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> l = new ArrayList<>();

        int[] first = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] second = intervals[i];

            if (first[1] >= second[0]) {
                first[1] = Math.max(first[1], second[1]);
            } else {
                l.add(first);
                first = second;
            }
        }

        l.add(first);

        int[][] result = new int[l.size()][2];

        for (int i = 0; i < l.size(); i++) {
            result[i] = l.get(i);
        }

        return result;
    }
}
