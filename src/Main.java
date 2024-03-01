public class Main {
    public static void main(String[] args) {

        int remains = 100; // Остаток на счёте
        int refill = 1000; // Пополнение
        int z = 0; // Бонусы на счёте

        int bonus;
        int outcome;
        if (refill >= 1000) {
            bonus = refill / 100; // Расчёт бонуса с пополнения
            outcome = remains + refill + bonus; // Общая сумма
            System.out.println("Итоговая сумма на счету: " + outcome);
            System.out.printf("Из них бонусов: " + bonus);
        } else {

            bonus = 0;
            outcome = remains + refill + bonus; // Общая сумма

            System.out.println("Итоговая сумма на счету: " + outcome);
            System.out.printf("Из них бонусов: " + z);
        }
    }
}