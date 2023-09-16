package com.farjuce.editor.spi;

import com.farjuce.editor.api.TextManager;

public interface TextEditorPlugin {
    TextManager create();
}