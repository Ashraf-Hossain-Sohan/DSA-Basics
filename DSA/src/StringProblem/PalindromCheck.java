package StringProblem;

public class PalindromCheck {
    static boolean IsPalindrom(String word){
        char[] CharArr = word.toCharArray();
        int start = 0;
        int end = CharArr.length - 1;
        while(start < end){
            if (CharArr[start] != CharArr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){

        if (IsPalindrom("madam")){
            System.out.println("True");
        }else{
            System.out.println("Not True");
        }

    }
}
