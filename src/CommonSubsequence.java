//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CommonSubsequence {
    public static void main(String[] args) {
        String text1 = "almanac";
        String text2 = "albatross";
        System.out.println(checkCommonSub(text1,text2));
    }

    public static int checkCommonSub(String text1, String text2) {
        int count = 0;
        for (int i = 0; i < text1.length(); i++){
            for (int j = 0; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j))
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}