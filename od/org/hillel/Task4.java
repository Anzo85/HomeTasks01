package od.org.hillel;

import com.sun.org.apache.xpath.internal.SourceTree;

// Написать программу, которая проверит, является ли число четным или нечетным
public class Task4 {


    public static void main(String[] args) {

        int x = 101;

        if (x % 2 == 0) {
            System.out.println("Число " + x + " четное");
        } else {
            System.out.println("Число " + x + " не четное");
        }
    }
}
