class Solution {
    public int findDuplicate(int[] nums) {
        boolean visited[] = new boolean[nums.length + 1];
        for (int value: nums)
        {
            if (visited[value]) {
                return value;
            }
            visited[value] = true;
        }
        return -1;
    }
}