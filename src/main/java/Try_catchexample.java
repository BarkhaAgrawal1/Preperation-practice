public class Try_catchexample {
    public static void main(String[] args) {

        try {
            int af = 20 / 0;}
        catch (Exception e){
            System.out.println(e);}

            try {
                int a[] = new int[3];
                a[0] = 1;
                a[1] = 2;
                a[2] = 3;
                a[3] = 4;
            } catch (ArrayIndexOutOfBoundsException g) {
                System.out.println(g);
            }finally {
                System.out.println("all good");
            }



        }
    }


