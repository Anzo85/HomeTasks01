package od.org.hillel;

/*
Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно, что за 1 день ее стоимость 40 грн.
Причем, если съемщик прожил в ней больше 5 дней, он получит скидку 20 грн, а если больше 7 дней, то скидка составит 50 грн.
*/

public class Task7 {

    public static void main(String[] args) {

        final int price = 40;
        int days = 6 ;
        int discont20 = 20;
        int discont50 = 50;

        int bill = price * days;

        if (days > 7) {
            bill -= discont50;
            System.out.println(" Ваш счет за проживание составляет : " + bill + " грн " + " вы экономите " + discont50 + " грн ");
        } else if (days > 5) {
            bill -= discont20;
            System.out.println(" Ваш счет за проживание составляет : " + bill + " грн " + " вы экономите " + discont20 + " грн ");
        } else {

            System.out.println(" Ваш счет за проживание составляет : " + bill + " грн " );
        }
    }
}
