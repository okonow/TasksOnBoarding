package org.tasks.exceptions;

import java.util.concurrent.ExecutionException;

public class WrongCountOfCubesException extends Exception {
    public WrongCountOfCubesException(String message) {
        super(message);
    }
}
