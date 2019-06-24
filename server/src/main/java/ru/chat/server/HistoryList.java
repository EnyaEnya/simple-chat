package ru.chat.server;

import java.util.ArrayList;
import java.util.List;

public class HistoryList {

    private List<HistoryRecord> records = new ArrayList<>();

    public List<HistoryRecord> getRecords() {
        return records;
    }

    public void setRecords(List<HistoryRecord> records) {
        this.records = records;
    }
}
