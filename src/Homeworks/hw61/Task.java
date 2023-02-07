package Homeworks.hw61;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects;

public class Task {
    private static int counter = 0;
    private final int num;
    private final String title;
    private Priority type;

    public Task(String title, Priority type) {
        this.num = ++counter;
        this.title = title;
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public String getTitle() {
        return title;
    }

    public Priority getType() {
        return type;
    }

    public void setType(Priority type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "{Task #" + num + ", " + title + ", " + type + '}';
    }
}

enum Priority {
    TBSU(2),
    HIGH(1),
    LOW(0);

    private final int pVal;
    Priority(int pVal) {
        this.pVal = pVal;
    }

    public int getPVal() {
        return pVal;
    }
}

class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return Integer.compare(o2.getType().getPVal(), o1.getType().getPVal());
    }
}
