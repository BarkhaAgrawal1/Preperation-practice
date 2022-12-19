public class RevrseStrng {
    public static void main(String[] args) {
        String name  = "Barkha";
       int len = name.length();
       String rev = "";//use to store the reverse string
       for(int i=len-1; i>=0; --i){//initiation, condition,decrement
       rev =  rev+ name.charAt(i);//reverse one one element and start with the loop again to iterate
        }
       System.out.println( " the reverse of " +" " + name + " "+ "is"+ rev);

    }


        }



// reverse string will print the string in reverse order