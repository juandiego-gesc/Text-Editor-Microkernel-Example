package com.farjuce.editor;

import com.farjuce.editor.api.TextManager;

import java.util.HashMap;
import java.util.Map;

public class VocalModificationTextManagerImpl implements TextManager {

    HashMap<String, String> vocalReplacement = new HashMap<String, String>();

    @Override
    public String formatText(String text) {
        vocalReplacement.put("a", "4");
        vocalReplacement.put("e", "3");
        vocalReplacement.put("i", "1");
        vocalReplacement.put("o", "0");
        vocalReplacement.put("u", "2");


        // Replace vowels with numbers
        for (String key : vocalReplacement.keySet()) {
            text = text.replaceAll(key, vocalReplacement.get(key));
        }

        return text;
    }


}
