package ru.chat.server;

import java.util.Date;

public abstract class AbstractHistoryService implements HistoryService {

    protected HistoryList prepareHistoryList(String user, String message) {
        HistoryRecord record = new HistoryRecord();
        HistoryList list = getHistoryList();
        list.getRecords().add(record);
        record.setUser(user);
        record.setMessage(message);
        record.setDate(new Date());
        return list;
    }

    protected abstract HistoryList getHistoryList();

}
