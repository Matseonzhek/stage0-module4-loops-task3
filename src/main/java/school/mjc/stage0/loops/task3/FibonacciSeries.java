package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        switch (lastFibonacci) {
            case (0) -> System.out.println(0);
            case (1) -> System.out.println("""
                    0
                    1""");
            default -> {
                System.out.println("""
                        0
                        1""");
                int fibonacciDigit;
                int fibonacciDigitPrev = 0;
                int fibonacciDigitPost = 1;
                for (int i = 2; i <lastFibonacci; i++) {
                    fibonacciDigit = fibonacciDigitPrev + fibonacciDigitPost;
                    fibonacciDigitPrev = fibonacciDigitPost;
                    fibonacciDigitPost = fibonacciDigit;
                    System.out.println(fibonacciDigitPost);
                }
            }
        }

    }
}
