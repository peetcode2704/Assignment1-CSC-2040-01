//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CommonSubsequence {
    public static void main(String[] args) {
        String text1 = "almanacs";
        String text2 = "albatross";
        System.out.println(checkCommonSub(text1,text2));
    }

    public static int checkCommonSub(String text1, String text2) {
        int [] textArray = new int[text2.length()];
        int count = 0;
        for (int i = 0; i < text1.length(); i++){
            int count2 = 0;
            for (int j = 0; j < textArray.length; j++) {
                if(count2 < textArray[j])
                {
                    count2 = textArray[j];
                } else if (text1.charAt(i) == text2.charAt(j)){
                    count = count2 + 1;
                    textArray[j] = count;
                }
            }
        }
        return count;
    }
}