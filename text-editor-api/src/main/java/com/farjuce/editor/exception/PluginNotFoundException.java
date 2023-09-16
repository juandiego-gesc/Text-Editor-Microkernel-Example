package com.farjuce.editor.exception;
public class PluginNotFoundException extends RuntimeException {

    public PluginNotFoundException() {
        super();
    }

    public PluginNotFoundException(String message) {
        super(message);
    }

}
