class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> l = new ArrayList<>();

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    l.add(1);
                } else {
                    List<Integer> prev = result.get(i - 2);
                    l.add(prev.get(j - 2) + prev.get(j - 1));
                }
            }

            result.add(l);
        }

        return result;
    }
}