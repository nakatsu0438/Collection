package practice; 

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;

public class Chapter5 {
    public static void main(String[] args) {
        LinkedList<Task> tasks = new LinkedList<Task>();

        tasks.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う"));
        tasks.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接"));
        tasks.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う"));
        tasks.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く"));
        tasks.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く"));

        Collections.sort(tasks);// タスクを時系列に並び替え

        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}