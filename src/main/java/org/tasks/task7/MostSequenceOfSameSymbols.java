package org.tasks.Task7;

public class MostSequenceOfSameSymbols {
    String line;

    public MostSequenceOfSameSymbols(String line) {
        this.line = line;
    }

    public int lengthSequence() {
        int seqLength = 0, maxSeqLength = 0, lineLength = line.length();

        for (int currentSymbol = 0; currentSymbol < lineLength; currentSymbol++) {

            char cur = line.charAt(currentSymbol), next = line.charAt(currentSymbol + 1);

            if ((cur == next) && (seqLength != 0)) {
                seqLength++;
            } else if ((cur == next) && (seqLength == 0)) {
                seqLength = 2;
            } else {
                if (seqLength > maxSeqLength) {
                    maxSeqLength = seqLength;
                }
                seqLength = 0;
            }
        }
        return maxSeqLength;
    }
}
