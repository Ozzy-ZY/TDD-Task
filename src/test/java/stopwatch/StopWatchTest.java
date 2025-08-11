package stopwatch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StopWatchTest {

    @Test
    void givenStopWatch_whenRecord_thenMinutesAreCorrect() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(14);
        int minutes = stopWatch.getMinutes();
        assertEquals(14, minutes);
    }

    @Test
    void givenStopWatch_whenRecordNegative_thenIgnore() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(-5);
        int minutes = stopWatch.getMinutes();
        assertEquals(0, minutes);
    }

}
