package com.company.samplesociallogin;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.IconFactory;

import java.util.Locale;

@JsModule("./src/app-icons/app-icons.js")
public enum AppIcons implements IconFactory {
    GOOGLE,
    GITHUB,
    FACEBOOK,
    DISCORD;

    @Override
    public Icon create() {
        String iconName = this.name().toLowerCase(Locale.ENGLISH).replace('_', '-').replaceAll("^-", "");
        return new Icon("app-icons", iconName);
    }
}
