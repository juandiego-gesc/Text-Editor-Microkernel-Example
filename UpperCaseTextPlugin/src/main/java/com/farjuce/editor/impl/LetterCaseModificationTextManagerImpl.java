package com.farjuce.editor.impl;

import com.farjuce.editor.api.TextManager;

import java.util.HashMap;

public class LetterCaseModificationTextManagerImpl implements TextManager{

    // Create hashmap replacing vowels with numbers
    HashMap<String, String> vocalReplacement = new HashMap<String, String>();

    @Override
    public String formatText(String text) {

        // Return uppercase text
        return text.toUpperCase();
    }
}
