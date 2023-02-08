package Homeworks.hw61;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class TaskTest {
    Task t1 = new Task("Task01", Priority.LOW); // 7
    Task t2 = new Task("Task02", Priority.HIGH); // 4
    Task t3 = new Task("Task03", Priority.HIGH); // 5
    Task t4 = new Task("Task04", Priority.LOW); // 8
    Task t5 = new Task("Task05", Priority.HIGH); // 6
    Task t6 = new Task("Task06", Priority.TBSU); // 1
    Task t7 = new Task("Task07", Priority.TBSU); // 2
    Task t8 = new Task("Task08", Priority.TBSU); // 3

    @Test
    void testPriorityQueue() {
        PriorityQueue<Task> input = new PriorityQueue<>(
                Task.getPriorityComparator().thenComparing(Task.getNumComparator())
        );
        input.offer(t1);
        input.offer(t2);
        input.offer(t3);
        input.offer(t4);
        input.offer(t5);
        input.offer(t6);
        input.offer(t7);
        input.offer(t8);

        List<Task> inpList = new ArrayList<>(input.size());
        while (input.peek() != null) {
            inpList.add(input.poll());
        }
        List<Task> expList = List.of(t6, t7, t8, t2, t3, t5, t1, t4);

        Assertions.assertEquals(expList, inpList);
    }
}