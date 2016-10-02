package ru.babobka.subtask.model;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by dolgopolov.a on 29.09.15.
 */
public class ExecutionResult{

    private final boolean stopped;

    private final Map<String, Serializable> serializableHashMap;


    public ExecutionResult(boolean stopped, Map<String, Serializable> serializableHashMap) {
        this.stopped = stopped;
        this.serializableHashMap = serializableHashMap;
    }

    public boolean isStopped() {
        return stopped;
    }

    public Map<String, Serializable> getSerializableHashMap() {
        return serializableHashMap;
    }
}
