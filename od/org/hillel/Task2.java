package od.org.hillel;

// Найти среди 3х чисел максимальное и минимальное
public class Task2 {

    public static void main(String[] args) {


        int x = 134;
        int y = 13;
        int z = 133;

        if (x < y && x < z && y > z) {
            System.out.println("Минимальное число Х = " + x + " " + "Максимальное число Y = " + y);
        } else if (x < y && x < z && z > y) {
            System.out.println("Минимальное число Х = " + x + " " + "Максимальное число Z = " + z);
        } else if (y < x && y < z && x > z) {
            System.out.println("Минимальное число Y = " + y + " " + "Максимальное число X = " + x);
        } else if (y < x && y < z && z > x) {
            System.out.println("Минимальное число Y = " + y + " " + "Максимальное число Z = " + z);
        } else if (z < x && z < y && x > y) {
            System.out.println("Минимальное число Z = " + z + " " + "Максимальное число X = " + x);
        } else if (z < x && z < y && y > x) {
            System.out.println("Минимальное число Z = " + z + " " + "Максимальное число Y = " + y);
        } else {
            System.out.println("Error-001: 2 или больше значения равны ");
        }

    }
}
