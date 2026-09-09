# circuit-breaker-kata
 
Practic: a thread-safe Circuit Breaker in Java (Maven, JUnit 5).
 
## Run
 
```
mvn test
```
 
## Features
 
* States: CLOSED → OPEN (after N consecutive failures) → HALF_OPEN (after timeout) → CLOSED/OPEN
* Thread-safe via AtomicReference/AtomicInteger/AtomicLong, CAS transition OPEN → HALF_OPEN
* Injectable clock (LongSupplier) — timeout logic is unit-tested without real sleeps
* Custom exception: CircuitBreakerOpenException
 
