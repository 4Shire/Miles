public class BonusMilesService {

    public int calculate(int ticketPrice) {
        int ruble1Mile = ticketPrice / 20;
        return ruble1Mile;
    }
}