public class Main {
    public static void main(String[] args) {
        String a = "abcde";
        char[] b = new char[a.length()];
        for (int i=0;i<a.length();i++) {
            b[i] = a.charAt(i);
        }

        for (char oneChar : b) {
            System.out.println(oneChar);
        }
    }
}
