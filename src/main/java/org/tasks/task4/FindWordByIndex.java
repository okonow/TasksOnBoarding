package org.tasks.task4;

public class FindWordByIndex {
    String line;
    public String[] indexedWords;

    public FindWordByIndex(String line) {
        this.line = line;
        indexedWords = line.split("\\h");
    }

    public String find(int i) {
        return indexedWords[i];
    }


}
