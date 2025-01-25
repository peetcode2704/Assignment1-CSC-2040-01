public class RemoveElement {
    public static void main(String[] args) {
        int val = 3;
        int []array= {3,2,2,3};
        System.out.println(removeElement(array,val));
    }

    public static int removeElement(int[]nums, int val) {
        //Create the count index to keep track of the element in the array
        int countIndex = 0;
        //For loop to go to every element in the nums array.
        for(int i = 0; i < nums.length;i++) {
            //For this step, check if the number at i index equal to the val, if it does,
            // we skip to the next number in the array
            // If not equal, we move the number to the next available spot and increment countIndex
            if(nums[i] != val) {
                nums[countIndex] = nums[i];
                countIndex++;
            }
        }
        //CountIndex holds the value of how many
        return countIndex;
    }
}
