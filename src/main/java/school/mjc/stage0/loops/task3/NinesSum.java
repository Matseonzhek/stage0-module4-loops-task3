package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        double result = 0;
        for (int i = 1; i < lengthOfLastNumber + 1; i++) {
            result = result + Math.pow(10, i) - 1;
        }
        System.out.println((int) result);
    }
}
