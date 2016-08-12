package od.org.hillel;
import java.lang.Math;

// Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11

public class Task6 {

    public static void main(String[] args){

       int x = 14;
       int y = 9;


        if ( Math.abs(10 - x) < Math.abs (10 - y)) {

            System.out.println("Ближайшее к 10-ти бедет число : " + x);

        }

        else {
            System.out.println("Ближайшее к 10-ти бедет число : "+ y);
        }

    }
}
