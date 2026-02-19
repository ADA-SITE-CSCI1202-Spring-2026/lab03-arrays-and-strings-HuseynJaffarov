import java.util.Arrays;

public class StringUtils {

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length() - 1; i>=0; i--){
            char c = s.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }

    public static String explode(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.substring(0, i + 1));
        }
        return sb.toString();
    }

     public static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);   
        return new String(chars);         
    }

    public static boolean anagram(String s1, String s2){
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(reverse(s1));
        String s2 = "Baku";
        System.out.println(explode(s2));
        System.out.println(sortString(s2));
        System.out.println(anagram(s1, s2));
    }
}
