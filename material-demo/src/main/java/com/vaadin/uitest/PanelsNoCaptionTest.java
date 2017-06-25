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

import com.github.appreciated.material.MaterialTheme;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.*;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.themes.ValoTheme;

public class PanelsNoCaptionTest extends VerticalLayout implements View {
    public PanelsNoCaptionTest() {
        setSpacing(false);

        Label h1 = new Label("Panels & Layout panels");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);

        HorizontalLayout row = new HorizontalLayout();
        row.addStyleName(ValoTheme.LAYOUT_HORIZONTAL_WRAPPING);
        addComponent(row);

        Panel panel = new Panel();
        panel.setContent(panelContent(true));
        row.addComponent(panel);

        panel = new Panel();
        panel.setWidth("10em");
        panel.setHeight("250px");
        panel.setContent(panelContent(true));
        row.addComponent(panel);

        panel = new Panel();
        panel.addStyleName(ValoTheme.PANEL_BORDERLESS);
        panel.setContent(panelContent(false));
        row.addComponent(panel);

        panel = new Panel();
        panel.addStyleName(ValoTheme.PANEL_BORDERLESS);
        panel.addStyleName(ValoTheme.PANEL_SCROLL_INDICATOR);
        panel.setContent(panelContentScroll(false));
        panel.setHeight("17em");
        row.addComponent(panel);

        panel = new Panel();
        panel.addStyleName(ValoTheme.PANEL_WELL);
        panel.setContent(panelContent(false));
        row.addComponent(panel);

        CssLayout layout = new CssLayout();
        layout.addStyleName(ValoTheme.LAYOUT_CARD);
        layout.addComponent(panelContent(true));
        row.addComponent(layout);

        layout = new CssLayout();
        layout.addStyleName(ValoTheme.LAYOUT_CARD);
        row.addComponent(layout);
        HorizontalLayout panelCaption = new HorizontalLayout();
        panelCaption.setSpacing(false);
        panelCaption.addStyleName("v-panel-caption");
        panelCaption.setWidth("100%");
        // panelCaption.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        Label label = new Label("Panel style layout");
        panelCaption.addComponent(label);
        panelCaption.setExpandRatio(label, 1);

        Button action = new Button();
        action.setIcon(VaadinIcons.PENCIL);
        action.addStyleName(ValoTheme.BUTTON_BORDERLESS_COLORED);
        action.addStyleName(ValoTheme.BUTTON_SMALL);
        action.addStyleName(ValoTheme.BUTTON_ICON_ONLY);
        panelCaption.addComponent(action);
        MenuBar dropdown = new MenuBar();
        dropdown.addStyleName(ValoTheme.MENUBAR_BORDERLESS);
        dropdown.addStyleName(ValoTheme.MENUBAR_SMALL);
        MenuItem addItem = dropdown.addItem("", VaadinIcons.CHEVRON_DOWN, null);
        addItem.setStyleName("icon-only");
        addItem.addItem("Settings", null);
        addItem.addItem("Preferences", null);
        addItem.addSeparator();
        addItem.addItem("Sign Out", null);
        panelCaption.addComponent(dropdown);

        layout.addComponent(panelCaption);
        layout.addComponent(panelContent(true));
        layout.setWidth("14em");

        layout = new CssLayout();
        layout.addStyleName(ValoTheme.LAYOUT_WELL);
        layout.addComponent(panelContent(false));
        row.addComponent(layout);
    }

    Component panelContent(boolean borderless) {
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        Label content = new Label(
                "Suspendisse dictum feugiat nisl ut dapibus. Mauris iaculis porttitor posuere. Praesent id metus massa, ut blandit odio.");
        content.setWidth("10em");
        layout.addComponent(content);
        Button button = new Button("Button");
        button.addStyleName(borderless ? MaterialTheme.BUTTON_BORDERLESS : "");
        button.setSizeFull();
        layout.addComponent(button);
        return layout;
    }

    Component panelContentScroll(boolean borderless) {
        VerticalLayout layout = new VerticalLayout();
        Label content = new Label(
                "Suspendisse dictum feugiat nisl ut dapibus. Mauris iaculis porttitor posuere. Praesent id metus massa, ut blandit odio. Suspendisse dictum feugiat nisl ut dapibus. Mauris iaculis porttitor posuere. Praesent id metus massa, ut blandit odio.");
        content.setWidth("10em");
        layout.addComponent(content);
        Button button = new Button("Button");
        button.addStyleName(borderless ? MaterialTheme.BUTTON_BORDERLESS : "");
        layout.addComponent(button);
        return layout;
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // TODO Auto-generated method stub

    }

}
