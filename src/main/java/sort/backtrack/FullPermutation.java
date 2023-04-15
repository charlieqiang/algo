package sort.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author charlie
 * @date 4/15/2023 10:19 AM
 **/
public class FullPermutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(nums, path, res, new boolean[nums.length]);
        return res;
    }

    private void backtrack(int[] nums, List<Integer> path, List<List<Integer>> res, boolean[] used) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            backtrack(nums, path, res, used);
            path.remove(path.size()-1);
            used[i] = false;
        }
    }
}
