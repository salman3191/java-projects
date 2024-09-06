import java.util.Scanner;

class firstclass{
    public static void main(String[] args) {
        try(Scanner SC=new Scanner(System.in)){

       
        int a=SC.nextInt();
        int b=SC.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
    }
}