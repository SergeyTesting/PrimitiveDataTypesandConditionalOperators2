public class Main {
    public static void main(String[] args) {
        int initialAccountBalance = 200; //начальная сумма на счету
        int replenishmentAmount = 1400; //сумма пополнения
        int bonusAmount = 0; // сумма бонуса

        if (replenishmentAmount > 1000) {
            bonusAmount = (replenishmentAmount / 100) * 1; // итоговый бонус
        }

        int finalScore = initialAccountBalance + replenishmentAmount + bonusAmount; // итоговый счет

        System.out.println(" Итоговый счет: " + finalScore);
        System.out.println(" Бонусные рубли: " + bonusAmount);


    }
}
