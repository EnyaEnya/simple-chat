package ru.chat.server;

import java.util.Date;

public class HistoryRecord {

    private String user;

    private String message;

    private Date date;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "HistoryRecord{" +
                "user='" + user + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
