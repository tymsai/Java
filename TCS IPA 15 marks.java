// finding number of words and spaces in string

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        // String strOpt=str.trim();
        // System.out.println(strOpt);
        
        String[] strArray=str.split(" ");
        System.out.println(strArray.length);
        System.out.println();
        System.out.println(strArray.length-1);
    }
}
