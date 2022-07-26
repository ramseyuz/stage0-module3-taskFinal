package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int rem1 = number % 10;
        int rem2 = (number / 10) % 10;
        int rem3 = number / 100;
        System.out.println(rem1 * 100 + rem2 * 10 + rem3);

    }
}
