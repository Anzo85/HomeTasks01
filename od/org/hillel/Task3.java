package od.org.hillel;

// Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа

public class Task3 {

    public static void main(String[] args) {


        int x = 13;
        int y = 13;
        int z = 12;

        if (x > y && x > z) {
            System.out.println("Максимальное число X : " + x);
        } else if (x == y && x > z) {
            System.out.println("Максимальное число X : " + x);
            System.out.println("Максимальное число Y : " + y);
        } else if (y > x && y > z) {
            System.out.println("Максимальное число Y : " + y);
        } else if (y == z && y > x) {
            System.out.println("Максимальное число Y : " + y);
            System.out.println("Максимальное число Z : " + z);
        } else if (z > x && z > y) {
            System.out.println("Максимальное число Z : " + z);
        } else if (z == x && z > y) {
            System.out.println("Максимальное число Z : " + z);
            System.out.println("Максимальное число X : " + x);
        } else {
            System.out.println("Все числа равны : " + x);
        }


    }
}
