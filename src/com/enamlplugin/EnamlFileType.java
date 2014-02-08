package com.enamlplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.enamlplugin.EnamlIcons;
import com.enamlplugin.EnamlLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class EnamlFileType extends LanguageFileType {
    public static final EnamlFileType INSTANCE = new EnamlFileType();

    private EnamlFileType() {
        super(EnamlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Enaml file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Enaml language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "enaml";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return EnamlIcons.FILE;
    }
}