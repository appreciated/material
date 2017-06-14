/*
 * Copyright 2000-2016 Vaadin Ltd.
 *
 * Modifications Copyright 2017 appreciated
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.uitest;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.*;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.themes.ValoTheme;

public class Panels extends VerticalLayout implements View {
    public Panels() {
        setSpacing(false);

        Label h1 = new Label("Panels & Layout panels");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);

        HorizontalLayout row = new HorizontalLayout();
        row.addStyleName(ValoTheme.LAYOUT_HORIZONTAL_WRAPPING);
        addComponent(row);
        TestIcon testIcon = new TestIcon(60);

        Panel panel = new Panel("default");
        panel.setIcon(testIcon.get());
        panel.setContent(panelContent(true));
        panel.setWidth(250, Unit.PIXELS);
        panel.setHeight(250, Unit.PIXELS);
        row.addComponent(panel);

        panel = new Panel(ValoTheme.PANEL_BORDERLESS);
        panel.setIcon(testIcon.get());
        panel.addStyleName(ValoTheme.PANEL_BORDERLESS);
        panel.setContent(panelContent(false));
        panel.setWidth(250, Unit.PIXELS);
        panel.setHeight(250, Unit.PIXELS);
        row.addComponent(panel);

        panel = new Panel("Borderless + scroll divider");
        panel.setIcon(testIcon.get());
        panel.addStyleName(ValoTheme.PANEL_BORDERLESS);
        panel.addStyleName(ValoTheme.PANEL_SCROLL_INDICATOR);
        panel.setContent(panelContentScroll());
        panel.setWidth(250, Unit.PIXELS);
        panel.setHeight(250, Unit.PIXELS);
        row.addComponent(panel);

        panel = new Panel(ValoTheme.PANEL_WELL);
        panel.setIcon(testIcon.get());
        panel.addStyleName(ValoTheme.PANEL_WELL);
        panel.setContent(panelContent(false));
        panel.setWidth(250, Unit.PIXELS);
        panel.setHeight(250, Unit.PIXELS);
        row.addComponent(panel);

        CssLayout layout = new CssLayout();
        layout.setIcon(testIcon.get());
        layout.setCaption(ValoTheme.LAYOUT_CARD);
        layout.addStyleName(ValoTheme.LAYOUT_CARD);
        layout.addComponent(panelContent(true));
        layout.setWidth(250, Unit.PIXELS);
        layout.setHeight(250, Unit.PIXELS);
        row.addComponent(layout);

        layout = new CssLayout();
        layout.setCaption(ValoTheme.LAYOUT_CARD);
        layout.addStyleName(ValoTheme.LAYOUT_CARD);
        layout.setWidth(250, Unit.PIXELS);
        layout.setHeight(250, Unit.PIXELS);
        row.addComponent(layout);

        HorizontalLayout panelCaption = new HorizontalLayout();
        panelCaption.setSpacing(false);
        panelCaption.addStyleName("v-panel-caption");
        panelCaption.setWidth("100%");
        // panelCaption.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        Label label = new Label("Some Text");
        panelCaption.addComponent(label);
        panelCaption.setExpandRatio(label, 1.0f);

        MenuBar dropdown = new MenuBar();
        dropdown.addStyleName(ValoTheme.MENUBAR_BORDERLESS);
        dropdown.addStyleName(ValoTheme.MENUBAR_SMALL);
        dropdown.addStyleName("no-indicator");
        MenuItem addItem = dropdown.addItem("", VaadinIcons.ELLIPSIS_DOTS_V, null);
        addItem.addItem("Settings", null);
        addItem.addItem("Preferences", null);
        addItem.addSeparator();
        addItem.addItem("Sign Out", null);
        panelCaption.addComponent(dropdown);

        layout.addComponent(panelCaption);
        Component content = panelContent(true);
        content.setHeightUndefined();
        layout.addComponent(content);

        layout = new CssLayout();
        layout.setWidth(250, Unit.PIXELS);
        layout.setHeight(250, Unit.PIXELS);
        layout.setIcon(testIcon.get());
        layout.setCaption(ValoTheme.LAYOUT_WELL);
        layout.addStyleName(ValoTheme.LAYOUT_WELL);
        layout.addComponent(panelContent(false));
        row.addComponent(layout);
    }

    Component panelContent(boolean borderless) {
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.setMargin(true);
        Label content = new Label(
                "Suspendisse dictum feugiat nisl ut dapibus. Mauris iaculis porttitor posuere. Praesent id metus massa, ut blandit odio.");
        content.setWidth(100, Unit.PERCENTAGE);
        layout.addComponent(content);
        layout.setExpandRatio(content, 1.0f);
        Button button = new Button("Button");
        button.addStyleName(borderless ? "borderless" : "");
        button.setWidth(100, Unit.PERCENTAGE);
        layout.addComponent(button);
        return layout;
    }

    Component panelContentScroll() {
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        Label content = new Label(
                "Suspendisse dictum feugiat nisl ut dapibus. Mauris iaculis porttitor posuere. Praesent id metus massa, ut blandit odio. Suspendisse dictum feugiat nisl ut dapibus. Mauris iaculis porttitor posuere. Praesent id metus massa, ut blandit odio.");
        content.setWidth(100, Unit.PERCENTAGE);
        layout.addComponent(content);
        layout.setExpandRatio(content, 1.0f);
        Button button = new Button("Button");
        button.setWidth(100, Unit.PERCENTAGE);
        layout.addComponent(button);
        return layout;
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // TODO Auto-generated method stub

    }

}
