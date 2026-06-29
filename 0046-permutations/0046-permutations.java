class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        fun(nums, new ArrayList<>(), 0);

        return ans;
    }

    void fun(int[] nums, List<Integer> list, int idx) {

        if (idx == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (list.contains(nums[i]))
                continue;

            list.add(nums[i]);

            fun(nums, list, idx + 1);

            list.remove(list.size() - 1);
        }
    }
}