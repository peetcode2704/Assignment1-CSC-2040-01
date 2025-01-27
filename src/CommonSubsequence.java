//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CommonSubsequence {
    public static void main(String[] args) {
        String text1 = "almanacs";
        String text2 = "albatross";
        System.out.println(checkCommonSub(text1,text2));
    }

    public static int checkCommonSub(String text1, String text2) {
        // Create an array to store  substring lengths for text2
        int [] textArray = new int[text2.length()];
        // Variable to store the maximum length of the common substring
        int count = 0;
        //Loop through every character of text1
        for (int i = 0; i < text1.length(); i++){
            // Variable to track the longest common substring ending
            int count2 = 0;
            for (int j = 0; j < textArray.length; j++) {
                // Update count2 to store the maximum value seen in textArray at that point
                if(count2 < textArray[j])
                {
                    count2 = textArray[j];
                    //If matched
                } else if (text1.charAt(i) == text2.charAt(j)){
                    // Update the count of the common substring length
                    count = count2 + 1;
                    // Update the array with the new count
                    textArray[j] = count;
                }
            }
        }
        return count;
    }
}