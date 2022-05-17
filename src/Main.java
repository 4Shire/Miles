public class Main {
    public static void main(String[] args) {

        int ticketPrice = 9000;                 // Цена билета
        int ruble1Mile = 20;                    // Количество рублей на 1 бонусную милю

        int bonus = ticketPrice / ruble1Mile;   // Расчет

        System.out.println("Вам начислено " + (bonus) + " бонусных миль");
    }
}
