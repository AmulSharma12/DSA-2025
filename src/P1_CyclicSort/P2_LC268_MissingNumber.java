package P1_CyclicSort;

public class P2_LC268_MissingNumber {

     public static void main(String[] args){
        System.out.println("call from here..");
     }

     //Approach 1 - naive approach
    public static int missingNumber1(int[] nums) {
        int n = nums.length;
        boolean[] isElementExist = new boolean[n+1];

        //marking true if element exist
        for(int element: nums){
            isElementExist[element] = true;
        }

        int missingNumber = -1;
        //scanning boolean array if contains false then that will be my missing number
        for(int i = 0; i<=n; i++){
            if(isElementExist[i] == false){
                missingNumber = i;
                break;
            }
        }


        return missingNumber;
    }


    //Approach 2 - using cyclic sort
    public static int missingNumber2(int[] nums) {
        int n = nums.length;
        int missingNumber = n;
        int i = 0;
        while(i<n){
            int correctIndex = nums[i];
            if(correctIndex < n && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }


        for(int ind = 0; ind<n; ind++){
            if(nums[ind] != ind){
                missingNumber = ind;
                break;
            }
        }

        return missingNumber;
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
