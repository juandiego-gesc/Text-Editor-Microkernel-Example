package com.farjuce.editor;

import com.farjuce.editor.api.TextManager;
import com.farjuce.editor.spi.TextEditorPlugin;


public class MorseCodePlugin implements TextEditorPlugin {

    @Override
    public TextManager create() {
        return new MorseCodePluginImpl();
    }

}


