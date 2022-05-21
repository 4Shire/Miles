public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 9_000;
        int ruble1Mile = service.calculate(ticketPrice);
        System.out.println("Вам начислено " + (ruble1Mile) + " бонусных миль");
    }
}
