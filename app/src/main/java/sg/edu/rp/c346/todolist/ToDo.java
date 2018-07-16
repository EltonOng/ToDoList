package sg.edu.rp.c346.todolist;

import java.util.Calendar;

/**
 * Created by 16043971 on 16/7/2018.
 */

public class ToDo {
    private String todo;
    private Calendar date;

    public ToDo(String todo, Calendar date) {
        this.todo = todo;
        this.date = date;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDateString() {
        String strDate = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return strDate;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "ToDo{" +
                "todo='" + todo + '\'' +
                ", date=" + date +
                '}';
    }
}
