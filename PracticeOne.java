public class PracticeOne {
    
    static double income = 3500;
    static double witholdings;

    public static void main(String[] args) {

        if (income <= 500.00) {
            double taxRate = .1;
            witholdings = income *taxRate;
        }
        else if (income >= 500.01 && income <= 1500.00) {
            double taxRate = .15;
            witholdings = income *taxRate;
        }
        else if (income >= 1500.01 && income <= 2500.00) {
            double taxRate = .2;
            witholdings = income *taxRate;
        }
        else if (income >= 2500.00) {
            double taxRate = .25;
            witholdings = income *taxRate;
        }
        System.out.println(witholdings);
    }
}
