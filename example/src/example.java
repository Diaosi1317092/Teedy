import java.util.Scanner;

public class example {
    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt(),b=cin.nextInt();
        System.out.println(add(a,b));
    }
}
