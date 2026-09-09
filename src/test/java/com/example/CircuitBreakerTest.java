package example;

import com.example.CircuitBreaker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircuitBreakerTest {

    @Test
    public void startsInClosedState() {
        CircuitBreaker cb = new CircuitBreaker(3, 60);
        assertEquals(cb.getState(),CircuitBreaker.State.CLOSED);
    }

}
