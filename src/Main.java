public class Main {
    public static void main(String[] args) {

        int balance = 100;

        int payment = 5000;

        int bonus = payment/100;

        if (payment < 1000) {
            bonus = 0;
        }

        int total = payment + bonus + balance;

        System.out.println("Итоговая сумма = " + total);

        System.out.println("Из них начисленно бонусами = " + bonus);


    }
}