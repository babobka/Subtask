package ru.babobka.subtask.model;

/**
 * Created by dolgopolov.a on 08.07.15.
 */
public class ValidationResult {

    private final String message;

    private final boolean valid;

    public String getMessage() {
        return message;
    }

    public boolean isValid() {
        return valid;
    }

    public ValidationResult(String message, boolean valid) {
        this.message = message;
        this.valid = valid;
    }
}
