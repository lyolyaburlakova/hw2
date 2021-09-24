package hw.vec;
import java.util.Objects;
public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    double length(){
        double c = x*x + y*y + z*z;
        return Math.sqrt(c);
    }
    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector){
        double c = x* vector.x + y* vector.y+z* vector.z;
        return c;
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        return new Vector (y* vector.z - z* vector.y, z* vector.x-x* vector.z, x* vector.y-y* vector.x);
        //return (Vector);

    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        return ((scalarProduct(vector))/(length()*vector.length()));
    }

    // Сумма двух векторов
    Vector add(Vector vector){
        return new Vector(x+ vector.x, y+ vector.y, z+ vector.z);

    }

    // Разность двух веторов
    Vector subtract(Vector vector){
        return new Vector(x- vector.x, y- vector.y, z- vector.z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        //сонаправлены и равна длина
        return this.cos(vector)==1.0 && this.length() == vector.length();
    }

    @Override
    public int hashCode() {
        int res = 17;

        long dx = Double.doubleToLongBits(this.x);
        long dy = Double.doubleToLongBits(this.y);
        long dz = Double.doubleToLongBits(this.z);

        int rx = (int) (dx ^ (dx >>> 32));
        int ry = (int) (dy ^ (dy >>> 32));
        int rz = (int) (dz ^ (dz >>> 32));

        res = 31 * res + rx;
        res = 31 * res + ry;
        res = 31 * res + rz;

        return res;
    }

    void describekoord(){
        System.out.println (x + " " + y + " " + z);
    }
    public double getx() {
        return x;
    }
    public void setx(double x) {
        this.x = x;
    }
    public double gety() {
        return y;
    }
    public void sety(double y) {
        this.y = y;
    }
    public double getz() {
        return z;
    }
    public void setz(double z) {
        this.z = z;
    }

}