package com.farjuce.editor.impl;

import com.farjuce.editor.api.TextManager;
import com.farjuce.editor.spi.TextEditorPlugin;

//@AutoService(TextEditorPlugin.class)
public class LetterCaseModificationPlugin implements TextEditorPlugin {

    @Override
    public TextManager create() {
        return new LetterCaseModificationTextManagerImpl();
    }

}
