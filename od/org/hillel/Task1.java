package od.org.hillel;

// Найти минимальное из 3х чисел

public class Task1 {

    public static void main(String [] args){


        int x = 3 ;
        int y = 134 ;
        int z = 15;

        if ( x < y && x < z){
            System.out.println("Минимальное число X : " +x);
        }

        if ( y < x && y < z){
            System.out.println("Минимальное число Y : " +y);
        }

        if ( z < x && z < y){
            System.out.println("Минимальное число Z : "+ z );
        }

    }
}
