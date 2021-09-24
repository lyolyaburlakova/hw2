package hw.vec;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double z1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double z2 = sc.nextDouble();

        Vector vector1 = new Vector(x1, y1, z1);
        Vector vector2 = new Vector(x2, y2, z2);

        sc.close();
        System.out.println("Длина первого вектора: ");
        System.out.println(vector1.length());

        System.out.println("Длина второго вектора: ");
        System.out.println(vector2.length());

        System.out.println("Скалярное произведение: ");
        System.out.println(vector1.scalarProduct(vector2));

        System.out.println("Косинус угла между векторами: ");
        System.out.println(vector1.cos(vector2));

        System.out.println("Координаты суммы двух векторов: ");
        //(vector1.add(vector2)).describekoord();
        System.out.println((vector1.add(vector2)).getx() + " " + (vector1.add(vector2)).gety() + " " + (vector1.add(vector2)).getz());

        System.out.println("Координаты разности двух векторов: ");
        //(vector1.subtract(vector2)).describekoord();
        System.out.println((vector1.subtract(vector2)).getx() + " " + (vector1.subtract(vector2)).gety() + " " + (vector1.subtract(vector2)).getz());

    }
}
