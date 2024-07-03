package org.tasks.Task5;

import org.tasks.Task4.FindWordByIndex;

public class FindLongestWord {
    FindWordByIndex string;

    public FindLongestWord(String line) {
        string = new FindWordByIndex(line);
    }

    public String maxLength() {

        int maxIndexWords = string.indexedWords.length;
        String maxWord = string.indexedWords[0];
        for (int wordIndex = 1; wordIndex < maxIndexWords; wordIndex++) {
            if (string.indexedWords[wordIndex].length() > maxWord.length()) {
                maxWord = string.indexedWords[wordIndex];
            }
        }
        return maxWord;
    }
}
