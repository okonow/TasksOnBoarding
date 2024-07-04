package org.tasks.task6;

import org.tasks.exceptions.EmptyLineException;

import java.util.Objects;

public class FindSubstringRewriteOthers {
    StringBuilder line;
    String subLine, selectedWord;

    public FindSubstringRewriteOthers(StringBuilder line, String subLine, String selectedWord) throws EmptyLineException {
        if (line.isEmpty()) {
            throw new EmptyLineException("Line is empty");

        }
        this.line = line;
        if (Objects.equals(subLine, "")) {
            throw new EmptyLineException("Subline is empty");
        }
        this.subLine = subLine;
        this.selectedWord = selectedWord;

    }


    public StringBuilder replace() {

        int lineLength = line.length();
        int subLineLength = subLine.length();
        for (int symbolIndex = 0; symbolIndex < lineLength - subLineLength; symbolIndex++) {
            String lineSubLine = line.substring(symbolIndex, symbolIndex + subLineLength);
            if (lineSubLine.equals(subLine)) {
                line.replace(symbolIndex, symbolIndex + subLineLength, selectedWord);
            }
        }
        return line;
    }


}
