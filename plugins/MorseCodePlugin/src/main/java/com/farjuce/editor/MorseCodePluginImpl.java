package com.farjuce.editor;

import com.farjuce.editor.api.TextManager;

public class MorseCodePluginImpl implements TextManager {
    @Override
    public String formatText(String text) {
        // Turn text into morse code
        text = text.toLowerCase();
        text = text.replace("a", ".-");
        text = text.replace("b", "-...");
        text = text.replace("c", "-.-.");
        text = text.replace("d", "-..");
        text = text.replace("e", ".");
        text = text.replace("f", "..-.");
        text = text.replace("g", "--.");
        text = text.replace("h", "....");
        text = text.replace("i", "..");
        text = text.replace("j", ".---");
        text = text.replace("k", "-.-");
        text = text.replace("l", ".-..");
        text = text.replace("m", "--");
        text = text.replace("n", "-.");
        text = text.replace("o", "---");
        text = text.replace("p", ".--.");
        text = text.replace("q", "--.-");
        text = text.replace("r", ".-.");
        text = text.replace("s", "...");
        text = text.replace("t", "-");
        text = text.replace("u", "..-");
        text = text.replace("v", "...-");
        text = text.replace("w", ".--");
        text = text.replace("x", "-..-");
        text = text.replace("y", "-.--");
        text = text.replace("z", "--..");

        return text;
    }
}
