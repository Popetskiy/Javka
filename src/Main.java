public class Main {
    public static void main(String[] args) {
        float balance = 200F; //остаток на счете
        float added = 2000F; // пополнение счета
        int bonus = 100;
        float newBalance = 0;
        if (added >= 1000) {
            bonus = (int) added / 100 ;
            newBalance = balance + added + bonus;
            System.out.println("Вам начислено " + bonus + " бонусных рублей.");
            System.out.println("На вашем балансе " + newBalance + " рублей.");
        } else {
            newBalance = balance + added;
            System.out.println("На вашем балансе " + newBalance + " рублей.");


        }
    }
}