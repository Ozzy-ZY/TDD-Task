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
    @Test
    void givenStopWatch_whenRecord60Minutes_thenIncreaseHours(){
        // Arrange
        StopWatch stopWatch = new StopWatch();

        // Act
        stopWatch.record(125);

        // Assert
        int minutes = stopWatch.getMinutes();
        int hours = stopWatch.getHours();
        assertEquals(5, minutes);
        assertEquals(2, hours);
    }
    @Test
    void givenStopWatch_whenRecord24Hours_thenShouldIncreaseDays(){
        // Arrange
        StopWatch stopWatch = new StopWatch();

        // Act
        stopWatch.record(2945); // 2 days 1 hour 5 mins

        // Assert
        int days = stopWatch.getDays();
        int minutes = stopWatch.getMinutes();
        int hours = stopWatch.getHours();
        assertEquals(2, days);
        assertEquals(5, minutes);
        assertEquals(1, hours);
    }
}
