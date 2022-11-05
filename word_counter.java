import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter A String");
        System.out.println("Enter String is :-"+str);
        int count=1;
        boolean isSpace=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        if(count==0){
            System.out.println("In The String Total Word is:- 1");
        }
        System.out.println("In The String Total Words are:- "+count);
    }
}