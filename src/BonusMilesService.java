public class BonusMilesService {

    public int calculate(int price) {
        int calculate;
        if (price > 0) {
            calculate = (price / 20);
        } else {
            calculate = 0;
        }
        return calculate;
    }
}