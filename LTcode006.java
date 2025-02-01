class LTcode006 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int x : nums){
            if(k == 0 || x != nums[k-1]){
                nums[k++] = x;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        LTcode006 LTcode006 = new LTcode006();
        
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; 
        int k = LTcode006.removeDuplicates(nums);
        
        System.out.println("Number of unique elements: " + k);
        System.out.print("Array with unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
      }
   }
}