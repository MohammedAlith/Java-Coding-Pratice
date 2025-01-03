// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String str = "I Love Java";
        //String rev="";
        for (int i = str.length()-1; i >= 0; i--) {
            //rev+=str.charAt(i);
            System.out.print(str.charAt(i));
        }

    }
}