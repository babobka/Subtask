package ru.babobka.subtask.model;

import java.io.Serializable;
import java.util.Map;

import ru.babobka.nodeserials.NodeRequest;

/**
 * Created by dolgopolov.a on 08.12.15.
 */
public interface SubTask {

	public ExecutionResult execute(NodeRequest request);

	public void stopTask();

	public ValidationResult validateRequest(NodeRequest request);

	public boolean isRequestDataTooSmall(Map<String, Serializable> addition);

	public RequestDistributor getDistributor();

	public boolean isRaceStyle();

	public Reducer getReducer();

	public String getTaskName();

	public String getDescription();

}
