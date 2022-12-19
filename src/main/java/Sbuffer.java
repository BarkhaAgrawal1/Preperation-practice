public class Sbuffer {
    public static void main(String[] args) {
        //StringBuffer sb = new StringBuffer("Hello");
        //sb.append("Test");//append combines both the strings
        //System.out.println(sb);

        StringBuffer sb = new StringBuffer("Barkha");
        sb.replace(1,2 ,"Agrawal");
        //it will start from the first place and removes the second character and replace the new string
        System.out.println(sb);

        //StringBuffer sb = new StringBuffer("barkha");
        //sb.insert(1,"goyal");
        //System.out.println(sb);
        //it will insert from 1 index value the new string

       // StringBuffer sb = new StringBuffer("abcdefg");
        //sb.delete(1,5);
        //System.out.println(sb);
        //removes from the first till 5th index value. string value starts with 0
    }
}
