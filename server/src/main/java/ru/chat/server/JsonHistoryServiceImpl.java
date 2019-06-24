package ru.chat.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonHistoryServiceImpl extends AbstractHistoryService {


    private ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    @Override
    public void log(String user, String message) {
        File file = new File("records.json");
        try {
            FileUtils.touch(file);
            mapper.writeValue(file, prepareHistoryList(user, message));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<HistoryRecord> getHistory() {
        return getHistoryList().getRecords();
    }

    @Override
    protected HistoryList getHistoryList() {
        File file = new File("records.json");
        if (file.exists() && file.length() > 0) {
            try {
                return mapper.readValue(file, HistoryList.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return new HistoryList();
    }
}
