package com.farjuce.editor;

import com.farjuce.editor.api.TextManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WordMixerManagerImpl implements TextManager {
    @Override
    public String formatText(String input) {
        String[] words = input.split("[\\s\\.]");

        List<String> wordList = Arrays.asList(words);

        long seed = System.nanoTime();
        Collections.shuffle(wordList, new Random(seed));

        StringBuilder newRandomText = new StringBuilder();
        for (String word : wordList) {
            newRandomText.append(word).append(" ");
        }
        return ("\n"+newRandomText.toString());
    }
}
