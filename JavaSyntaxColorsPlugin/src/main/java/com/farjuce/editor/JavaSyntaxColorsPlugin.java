package com.farjuce.editor;

import com.farjuce.editor.api.TextManager;
import com.farjuce.editor.spi.TextEditorPlugin;

//@AutoService(TextEditorPlugin.class)
public class JavaSyntaxColorsPlugin implements TextEditorPlugin {

    @Override
    public TextManager create() {
        return new JavaSyntaxColorsTextManagerImpl();
    }

}
