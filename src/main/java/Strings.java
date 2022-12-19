public class Strings {
    public static <Char> void main(String[] args) {
String s3 = new String ("agrawal  ");
        String s1 = "barkha";
        String s2 = "goyal";
        char a[] =  {'a','g','r','a','w','a','l'};
        StringBuffer sb = new StringBuffer("hello");
        sb.replace(0,5,"aggrp");
        System.out.println(s1+s2+s3);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(4));
        System.out.println(s1.compareTo(s2));
        System.out.println(s3.trim());
        System.out.println(s1.indexOf(s3));
        System.out.println(s1.contains("a"));
    }
}
