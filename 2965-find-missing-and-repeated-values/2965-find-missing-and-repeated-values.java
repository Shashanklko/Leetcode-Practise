
import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> l = new ArrayList<>();

        int size = grid.length * grid.length;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                map.put(grid[i][j],
                    map.getOrDefault(grid[i][j], 0) + 1);
            }
        }

        map.forEach((key, value) -> {
            if (value > 1) {
                l.add(key);
            }
        });

        int sum = size * (size + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                actualSum += grid[i][j];
            }
        }

        int repeated = l.get(0);
        int missing = sum - (actualSum - repeated);

        l.add(missing);

        int[] arr = new int[l.size()];

        for (int i = 0; i < l.size(); i++) {
            arr[i] = l.get(i);
        }

        return arr;
    }
}
