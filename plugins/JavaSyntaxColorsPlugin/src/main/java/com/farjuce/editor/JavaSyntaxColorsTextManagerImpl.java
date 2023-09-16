package com.farjuce.editor;

import com.farjuce.editor.api.TextManager;

import java.util.HashMap;
import java.util.Map;

public class JavaSyntaxColorsTextManagerImpl implements TextManager {

    // Define color constants
    private static final String RED = "\u001B[31m";
    private static final String BLUE = "\u001B[34m";
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    private static final Map<String, String> KEYWORD_STYLES;

    static {
        KEYWORD_STYLES = new HashMap<>();
        KEYWORD_STYLES.put("if", RED);
        KEYWORD_STYLES.put("else", RED);
        KEYWORD_STYLES.put("for", RED);
        KEYWORD_STYLES.put("while", RED);
        KEYWORD_STYLES.put("do", RED);
        KEYWORD_STYLES.put("switch", RED);
        KEYWORD_STYLES.put("case", RED);
        KEYWORD_STYLES.put("break", RED);
        KEYWORD_STYLES.put("continue", RED);
        KEYWORD_STYLES.put("return", RED);
        KEYWORD_STYLES.put("class", BLUE);
        KEYWORD_STYLES.put("public", BLUE);
        KEYWORD_STYLES.put("private", BLUE);
        KEYWORD_STYLES.put("protected", BLUE);
        KEYWORD_STYLES.put("static", BLUE);
        KEYWORD_STYLES.put("void", BLUE);
        KEYWORD_STYLES.put("int", BLUE);
        KEYWORD_STYLES.put("double", BLUE);
        KEYWORD_STYLES.put("float", BLUE);
        KEYWORD_STYLES.put("long", BLUE);
        KEYWORD_STYLES.put("char", BLUE);
        KEYWORD_STYLES.put("boolean", BLUE);
        KEYWORD_STYLES.put("true", BLUE);
        KEYWORD_STYLES.put("false", RED);
        KEYWORD_STYLES.put("null", GREEN);
        // Add more keywords and their respective styles as needed
    }

    @Override
    public String formatText(String input) {
        // Split the input into words while preserving spaces
        String[] words = input.split("(?=[(){}\\[\\];\\s])|(?<=[(){}\\[\\];\\s])");

        StringBuilder formattedCode = new StringBuilder();

        for (String word : words) {
            // Check if the word is a keyword
            String style = KEYWORD_STYLES.getOrDefault(word.trim(), "");  // Get the style for the word

            // Append the styled word to the formatted code
            formattedCode.append(style).append(word).append(RESET);  // Reset color after each word
        }

        return formattedCode.toString();
    }
}
