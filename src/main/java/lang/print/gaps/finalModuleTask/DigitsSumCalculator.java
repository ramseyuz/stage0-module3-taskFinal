package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int rem1 = number % 10;
        int rem2 = (number / 10) % 10;

        int rem3 = ((number/ 100))%10;

        int rem4 = number / 1000;

        System.out.println(rem1+rem2+rem3+rem4);
    }
}
