package OutputBasedTrickyQuestion;

public class ProducerConsumer {
    static void main() {

    }

        /*
                    synchronized (lock) {
                    if (queue.isEmpty()) {
                    lock.wait();
                    }
                    item = queue.remove();
                    }

                    Problem: Spurious wakeups may break logic.

                    correct should be

                    while (queue.isEmpty()) {
                        lock.wait();
                    }

        * */


}
