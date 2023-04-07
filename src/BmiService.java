public class BmiService {
    public int calculate (int weightKg, double heightM) {
        double index = weightKg / Math.pow(heightM, 2);
        int bmi = (int) index;
        return bmi;
    }
}
