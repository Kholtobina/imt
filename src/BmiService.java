public class BmiService {
    public int calculate (int weight, double height) {
        double powheight = Math.pow(height, 2);
        int bmi = (int) (weight / powheight);
        return bmi;
    }

}

