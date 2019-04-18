package exams.LeetCode.task1_Two_Sum;

public class RUn {
    public static void main(String[] args) {
int[] g=twoSum(new int[]{1,3,4},5);
        for (int i = 0; i <g.length; i++) {
            System.out.println(g[i]);
        }
    }

        public static int[] twoSum(int[] nums,int target){
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j <nums.length ; j++) {
                    if (nums[i]+nums[j]==target&&nums[i]!=nums[j])return new int[]{i,j};

                }
            }
            return new int[]{};
        }

}
