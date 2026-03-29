package OutputBasedTrickyQuestion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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

    Queue<Integer> buffer = new LinkedList<>();

    int capacity = 5;
    Lock lk = new ReentrantLock();
    Condition notfull = lk.newCondition();
    Condition notEmpty = lk.newCondition();

    void produce(int value) {
        try {
            while (true) {
                lk.lock();

                if (buffer.size() == capacity) {
                    notEmpty.await();
                }
                buffer.add(value);
                notEmpty.signal();

            }
        } catch (
                InterruptedException e) {
            System.out.println(e.getCause());
        } finally {
            lk.unlock();
        }
    }

    void consume() {
        try {
            lk.lock();
            while(buffer.isEmpty()){
                notfull.await();
            }
            buffer.poll();
            notfull.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lk.unlock();
        }

    }

}
