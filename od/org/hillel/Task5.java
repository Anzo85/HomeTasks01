package od.org.hillel;

// Даны 2 числа, определить делится ли первое число на второе без остатка
public class Task5 {

    public static void main(String[] args) {

        int x = 10;
        int y = 6;
        int z = x % y;

        if (x % y == 0) {
            System.out.println(" X делится нв Y без остатка ");
        } else {
            System.out.println(" X делится на Y с октатком " + z);
        }
    }
}
