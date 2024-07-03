package org.tasks.task5;

import org.tasks.exceptions.EmptyLineException;
import org.tasks.task4.FindWordByIndex;

public class FindLongestWord extends FindWordByIndex{

    public FindLongestWord(String line) throws EmptyLineException {
        super(line);
    }

    public String maxLength() {

        int maxIndexWords = indexedWords.length;
        String maxWord = indexedWords[0];
        for (int wordIndex = 1; wordIndex < maxIndexWords; wordIndex++) {
            if (indexedWords[wordIndex].length() > maxWord.length()) {
                maxWord = indexedWords[wordIndex];
            }
        }
        return maxWord;
    }
}
