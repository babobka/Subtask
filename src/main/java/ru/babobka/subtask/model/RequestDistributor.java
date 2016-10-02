package ru.babobka.subtask.model;

import java.util.Map;

import ru.babobka.nodeserials.NodeRequest;

/**
 * Created by dolgopolov.a on 31.07.15.
 */
public interface RequestDistributor {

	public NodeRequest[] distribute(Map<String, String> arguments,
			int nodes, long id);

	public boolean isValidArguments(Map<String, String> arguments);

}
