package org.tasks.Task6;

public class FindSubstringRewriteOthers {
    StringBuilder line;
    String subLine, selectedWord;

    public FindSubstringRewriteOthers(StringBuilder line, String subLine, String selectedWord) {
        this.line = line;
        this.subLine = subLine;
        this.selectedWord = selectedWord;

    }


    void findSubLine() {

        int lineLength = line.length();
        int subLineLength = subLine.length() - 1;
        for (int symbolIndex = 0; symbolIndex < lineLength - subLineLength; symbolIndex++) {
            String lineSubLine = line.substring(symbolIndex, symbolIndex + subLineLength);
            if (lineSubLine.equals(subLine)) {
                line.replace(symbolIndex, symbolIndex + subLineLength, selectedWord);
            }
        }

    }


}
