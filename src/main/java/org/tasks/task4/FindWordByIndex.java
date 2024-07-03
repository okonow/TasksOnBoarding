package org.tasks.task4;

import org.tasks.exceptions.EmptyLineException;
import org.tasks.exceptions.EmptyMatrixException;
import org.tasks.exceptions.IndexNotExistException;

import java.util.Objects;

public class FindWordByIndex {
    protected String[] indexedWords;

    public FindWordByIndex(String line) throws EmptyLineException {
        if (Objects.equals(line, "")) {
            throw new EmptyLineException("Line is empty");
        }
        indexedWords = line.split("[, ?.@!]+");
    }

    public String find(int i) throws IndexNotExistException {
        if (i > indexedWords.length-1 || i < 0) {
            throw new IndexNotExistException("There is no word with this index");
        }
        return indexedWords[i];
    }


}
