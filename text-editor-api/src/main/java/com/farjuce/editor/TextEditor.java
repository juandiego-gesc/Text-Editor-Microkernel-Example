package com.farjuce.editor;

import com.farjuce.editor.exception.PluginNotFoundException;
import com.farjuce.editor.spi.TextEditorPlugin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;



public final class TextEditor {

    private static final String DEFAULT_PLUGIN = "com.farjuce.editor.spi.VocalModificationPlugin";

    //All plugins
    public static List<TextEditorPlugin> plugins() {
        List<TextEditorPlugin> services = new ArrayList<>();
        ServiceLoader<TextEditorPlugin> loader = ServiceLoader.load(TextEditorPlugin.class);
        loader.forEach(services::add);
        return services;
    }

    //Default plugin
    public static TextEditorPlugin plugin() {
        return plugin(DEFAULT_PLUGIN);
    }

    //plugin by name
    public static TextEditorPlugin plugin(String pluginName) {
        ServiceLoader<TextEditorPlugin> loader = ServiceLoader.load(TextEditorPlugin.class);
        Iterator<TextEditorPlugin> it = loader.iterator();
        while (it.hasNext()) {
            TextEditorPlugin plugin = it.next();
            if (pluginName.equals(plugin.getClass().getName())) {
                return plugin;
            }
        }
        throw new PluginNotFoundException("Plugin " + pluginName + " not found");
    }
}
