
// this is for practising reverse string
public class revstrng {
    public static void main(String[] args) {
        String name = "Barkha";
        String rev = "";
        int len = name.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(" the reverse of barkha is " + rev);
    }
}