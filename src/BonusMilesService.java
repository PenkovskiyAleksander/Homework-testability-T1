public class BonusMilesService {
    public int calculate(int price) {
        if (price < 20) {
            return 0;
        }

        return price / 20;
    }
}
