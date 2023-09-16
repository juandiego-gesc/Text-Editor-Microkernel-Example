package com.farjuce.editor.app;

import com.farjuce.editor.TextEditor;
import com.farjuce.editor.spi.TextEditorPlugin;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class MainApp {
    public static void main(String[] args) {
        String text = "if (true) { System.out.println(\"Hello world!\")} else { System.out.println(\"Hello world!\")}" ;
//        String texto =

        List<TextEditorPlugin> plugins = TextEditor.plugins();

        for (TextEditorPlugin plugin : plugins) {
            System.out.println("Retreiving plugin: " + plugin);
            text = (plugin.create().formatText(text));
            System.out.println("Formatted text: " + text);
        }



//        String text2 = TextEditor.plugin("com.farjuce.editor.VocalModificationPlugin").create().formatText("aaaaaaaa");
//        System.out.println(text2);


    }
}
