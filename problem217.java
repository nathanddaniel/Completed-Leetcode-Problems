public class problem217 {

    public boolean containsDuplicate(int[] nums) {

        int size = nums.length;

        for (int i = 0; i < size; i++){
            for (int j = i+1; j < size; j++){
                if (nums[i] == nums[j]) {
                    System.out.println("true");
                    return true;
                }
            }
        }
        System.out.println("false");
        return false;
    }
}
