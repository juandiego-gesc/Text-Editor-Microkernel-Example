package com.farjuce.editor;

import com.farjuce.editor.api.TextManager;

import java.util.HashMap;
import java.util.Map;

public class JavaSyntaxColorsTextManagerImpl implements TextManager{

    private static final Map<String, String> KEYWORD_STYLES;
    static {
        KEYWORD_STYLES = new HashMap<>();
        KEYWORD_STYLES.put("if", "\u001B[31m");  // Red color for "if"
        KEYWORD_STYLES.put("else", "\u001B[31m");  // Red color for "else"
        // Add more keywords and their respective styles as needed
    }

    @Override
    public String formatText(String input) {
        String[] words = input.split("\\s+");  // Split the input into words

        StringBuilder formattedCode = new StringBuilder();

        for (String word : words) {
            // Check if the word is a keyword
            String style = KEYWORD_STYLES.getOrDefault(word, "");  // Get the style for the word

            // Append the styled word to the formatted code
            formattedCode.append(style).append(word).append(" \u001B[0m");  // Reset color after each word
        }

        return formattedCode.toString();
    }
}
