package com.farjuce.editor.app;

import com.farjuce.editor.TextEditor;
import com.farjuce.editor.spi.TextEditorPlugin;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        String text = "\nif (true) { System.out.println(\"Hello world!\")} \nelse if (false) { System.out.println(\"Hello world!\")}" ;

        List<TextEditorPlugin> plugins = TextEditor.plugins();

        for (TextEditorPlugin plugin : plugins) {
            System.out.println("Retreiving plugin: " + plugin);
            text = (plugin.create().formatText(text));
            System.out.println("Formatted text: " + text + "\n");
        }

        System.out.println("\n\nEnd Result:" + text);
    }
}
