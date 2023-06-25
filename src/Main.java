public class Main {
    public static void main(String[] args) {
        int initial_account_balance = 200; //начальная сумма на счету
        int replenishment_amount = 1400; //сумма пополнения
        int bonus_amount = 0; // сумма бонуса

        if (replenishment_amount > 1000) {
            bonus_amount = (replenishment_amount / 100) * 1; // итоговый бонус
        }

        int final_score = initial_account_balance + replenishment_amount + bonus_amount; // итоговый счет

        System.out.println(" Итоговый счет: " + final_score);
        System.out.println(" Бонусные рубли: " + bonus_amount);


    }
}
