package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        if (t < 0) {
            t = -t;
        }
        String s = t + "";
        int result = 0;
        int digit;
        for (int i = 0; i < s.length(); i++) {
            digit = t % 10;
            result = result + digit;
            t = t / 10;
        }
        System.out.println(result);
    }
}
