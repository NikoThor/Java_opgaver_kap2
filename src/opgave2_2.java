import java.util.Scanner;
public class opgave2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area;
        double height;
        double side;

        System.out.println("enter the length of a side of the base triangle");
        side = input.nextDouble();
        System.out.println("enter the height of the prism");
        height = input.nextDouble();
        area = ((Math.sqrt(3))/4)*(Math.pow(side,2));
        System.out.println("area is: " + area);
        System.out.println("Volume of the triangular prism: " + area * height);
    }
}
