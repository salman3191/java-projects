import java.util.Scanner;

class firstclass{
    public static void main(String[] args) {
        try(Scanner SC=new Scanner(System.in)){

       
        // int a=SC.nextInt();
        // int b=SC.nextInt();
        int a=3,b=9;
        // int sum=a+b;
        // addidtion
        System.out.println("a+b =" + (a+b));

        // subtraction
        System.out.println("a-b =" + (a-b));

        // multiplication
        System.out.println("a*b =" + (a*b));

        // modulator operator
        System.out.println("a%b =" + (a%b));

        // divison
        System.out.println("a/b =" + (a/b));
        
        // incement operator
        System.out.println("a++ =" + (a++));

        // += operator
        System.out.println("a+=b =" + (a+=b));

        //  -= operaotr
        System.out.println("a-=b =" + (a-=b));

        // decrement operator

        System.out.println("a-- =" + (a--));

    }
    }
}