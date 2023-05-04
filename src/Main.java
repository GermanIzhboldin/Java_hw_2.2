public class Main {
    public static void main(String[] args) {

        int balance = 100;

        int payment = 1100;

        boolean event = true;

        int bonus = event ? 1 : 0;

        if (payment < 1000) {
            bonus = 0;
        }

        int total = payment * bonus / 100;


        int new_balance = balance + payment;

        System.out.println("Баланс = " + new_balance);

        System.out.println("Количество бонусов = " + total);


    }
}