package applePractice;

public class TokenBucketRateLimiter {

    private final int capacity;
    private final int refillRatePerSecond;
    private int tokens;
    private long lastRefillTimestamp;

    public TokenBucketRateLimiter(int capacity, int refillRatePerSecond) {
        this.capacity = capacity;
        this.refillRatePerSecond = refillRatePerSecond;
        this.tokens = capacity;
        this.lastRefillTimestamp = System.currentTimeMillis();
    }

    public synchronized boolean allowRequest() {
        refill();

        if (tokens > 0) {
            tokens--;
            return true;
        }
        return false;
    }

    private void refill() {
        long now = System.currentTimeMillis();
        long seconds = (now - lastRefillTimestamp) / 1000;

        if (seconds > 0) {
            int refillTokens = (int) seconds * refillRatePerSecond;
            tokens = Math.min(capacity, tokens + refillTokens);
            lastRefillTimestamp = now;
        }
    }

    static void main() {
        TokenBucketRateLimiter tokenBucketRateLimiter = new TokenBucketRateLimiter(3,1);
        for (int i=0;i<5;i++){
            boolean b = tokenBucketRateLimiter.allowRequest();
            System.out.println(b);

        }
    }
}
