public class Utils {

    public String backwards(String s) {
        String reversed = "";
        int len = s.length();
        int i;
        for (i = 0; i < len; i++) {
            reversed += s.charAt(len-1-i);
        }
        return reversed;
    }

    public boolean palindrome(String s) {
        s = s.trim().toLowerCase();
        return s.equals(backwards(s));
    }

    public boolean pat(String s) {
        s = s.trim().toLowerCase();
        return s.matches("[aeiouy]");
    }

    public int countVowels(String s) {
        int i;
        int counter = 0;
        String[] arr = s.split("");

        for (i = 0; i < arr.length; i++){
            if (pat(arr[i])) {
                counter += 1;
            }
        }
        return counter;
    }
}
