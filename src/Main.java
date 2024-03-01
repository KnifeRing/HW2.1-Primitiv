public class Main {
    public static void main(String[] args) {

        int x = 100; // Остаток на счёте
        int y = 1000; // Пополнение
        int z = 0; // Бонусы на счёте

        int bonus;
        int outcome;
        if (y >= 1000) {
            bonus = y / 100; // Расчёт бонуса с пополнения
            outcome = x + y + bonus; // Общая сумма
            System.out.println("Итоговая сумма на счету: " + outcome);
            System.out.printf("Из них бонусов: " + bonus);
        } else {

            bonus = 0;
            outcome = x + y + bonus; // Общая сумма

            System.out.println("Итоговая сумма на счету: " + outcome);
            System.out.printf("Из них бонусов: " + z);
        }
    }
}