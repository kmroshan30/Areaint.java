import java.util.Scanner;

public class Areaint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length: ");
        int breadth=sc.nextInt();
        System.out.println("Enter Width: ");
        int length=sc.nextInt();
        sc.close();
        System.out.println("Area of Rectangle:"+(breadth*length));
       
    }
}
