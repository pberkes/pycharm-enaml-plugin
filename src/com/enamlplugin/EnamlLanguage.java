package com.enamlplugin;

import com.intellij.lang.Language;

public class EnamlLanguage extends Language {
    public static final EnamlLanguage INSTANCE = new EnamlLanguage();

    private EnamlLanguage() {
        super("Enaml");
    }
}
