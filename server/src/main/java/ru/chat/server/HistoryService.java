package ru.chat.server;

import java.util.List;


public interface HistoryService {

    void log(String user, String message);

    List<HistoryRecord> getHistory();
}
