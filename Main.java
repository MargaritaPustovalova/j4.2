public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        double height = 1.67;
        double weight = 51.0;
        double bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}