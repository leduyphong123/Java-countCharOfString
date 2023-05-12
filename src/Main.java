import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String a="Tien be de khong co cu";
        char[] b= new char[a.length()];
        int count=0;

        System.out.println("input char = ");
        char value=input.next().charAt(0);
        for(int i=0;i<a.length();i++){
            b[i]=a.charAt(i);
        }
        for(int i = 0;i<b.length;i++){
            if(b[i]==value){
                count+=1;
            }
        }

        System.out.println("char : " +value + " count =" +count);
    }
}