package OOP1;

import java.util.concurrent.TimeUnit;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
        endTime = -1;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (endTime == -1) {
            return -1;
        }
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        int sum = 0;
        for (int i = 0; i < 500000000; i++) {
            sum += i;
        }
        stopwatch.stop();
        long elapsedMillis = stopwatch.getElapsedTime();
        System.out.println("Elapsed time: " + elapsedMillis + " milliseconds");
    }
}