public class Main {
    public static void main(String[] args) {

        int currentBalance = 100; //переменная для начальной суммы
        int topUpAmount = 1200; //переменная пополнения
        int bonus = 0; //перемнная для кол-ва бонусов к начислению
        if (topUpAmount > 1000) {
            bonus = (topUpAmount / 100);
        }
        int finalBalance = currentBalance + topUpAmount + bonus;
        System.out.println("Итоговый баланс: " + finalBalance);
        System.out.println("Бонусные рубли: " + bonus);
    }
}
//конечный баланс = начальный баланс + сумма поплнения + бонусы от пополнения