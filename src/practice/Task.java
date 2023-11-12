package practice;

import java.time.LocalDate;

class Task implements Comparable<Task> {
    private LocalDate date;
    private String task;

    public Task(LocalDate date, String task) {
        this.date = date;
        this.task = task;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTask() {
        return task;
    }
    // 日付の順序を比較
    @Override
    public int compareTo(Task date) {
        return this.date.compareTo(date.getDate());
    }
    
    @Override
    public String toString() {
        return date.toString() + "：" + task;
    }
}