package com.farjuce.editor.impl;

import com.farjuce.editor.api.TextManager;

public class LetterCaseModificationTextManagerImpl implements TextManager{

    @Override
    public String formatText(String text) {

        // Return uppercase text
        return text.toUpperCase();
    }
}
