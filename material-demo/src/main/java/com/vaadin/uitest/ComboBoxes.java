/*
 * Copyright 2000-2013 Vaadin Ltd.
 *
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
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.UserError;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

public class ComboBoxes extends VerticalLayout implements View {
    public ComboBoxes() {
        setSpacing(false);

        Label h1 = new Label("Combo Boxes");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);

        HorizontalLayout row = new HorizontalLayout();
        row.addStyleName(ValoTheme.LAYOUT_HORIZONTAL_WRAPPING);
        addComponent(row);

        ComboBox<String> combo = new ComboBox("Normal");
        combo.setPlaceholder("You can type here");
        combo.setItems("First", "Second", "Third");
        combo.setEmptySelectionAllowed(false);
        combo.setValue("First");
        combo.setIcon(new ThemeResource("../runo/icons/16/document.png"));
        row.addComponent(combo);

        row.addComponent(getComboBoxWithStyle(ValoTheme.LAYOUT_COMPONENT_GROUP));
        row.addComponent(getComboBoxWithStyle(MaterialTheme.LAYOUT_COMPONENT_GROUP_FLAT));
        row.addComponent(getComboBoxWithStyle(MaterialTheme.LAYOUT_COMPONENT_GROUP_MATERIAL));

        combo = new ComboBox("Explicit size");
        combo.setPlaceholder("You can type here");
        combo.setItems("First", "Second", "Third");
        combo.setWidth("260px");
        combo.setHeight("60px");
        row.addComponent(combo);

        combo = new ComboBox("No text input allowed");
        combo.setPlaceholder("You can click here");
        combo.setItems("First", "Second", "Third");
        combo.setTextInputAllowed(false);
        combo.setEmptySelectionAllowed(false);
        combo.setValue("First");
        row.addComponent(combo);

        combo = new ComboBox("Error");
        combo.setPlaceholder("You can type here");
        combo.setItems("First", "Second", "Third");
        combo.setEmptySelectionAllowed(false);
        combo.setValue("First");
        combo.setComponentError(new UserError("Fix it, now!"));
        row.addComponent(combo);

        combo = new ComboBox("Error, borderless");
        combo.setPlaceholder("You can type here");
        combo.setItems("First", "Second", "Third");
        combo.setEmptySelectionAllowed(false);
        combo.setValue("First");
        combo.setComponentError(new UserError("Fix it, now!"));
        combo.addStyleName(ValoTheme.COMBOBOX_BORDERLESS);
        row.addComponent(combo);

        combo = new ComboBox("Disabled");
        combo.setPlaceholder("You can't type here");
        combo.setItems("First", "Second", "Third");
        combo.setEnabled(false);
        row.addComponent(combo);

        combo = new ComboBox("Custom color");
        combo.setPlaceholder("You can type here");
        combo.setItems("First", "Second", "Third");
        combo.addStyleName("color1");
        row.addComponent(combo);

        combo = new ComboBox("Custom color");
        combo.setPlaceholder("You can type here");
        combo.setItems("First", "Second", "Third");
        combo.addStyleName("color2");
        row.addComponent(combo);

        combo = new ComboBox("Custom color");
        combo.setPlaceholder("You can type here");
        combo.setItems("First", "Second", "Third");
        combo.addStyleName("color3");
        row.addComponent(combo);

        combo = new ComboBox("Small");
        combo.setPlaceholder("You can type here");
        combo.setItems("First", "Second", "Third");
        combo.addStyleName(ValoTheme.COMBOBOX_SMALL);
        row.addComponent(combo);

        combo = new ComboBox("Large");
        combo.setPlaceholder("You can type here");
        combo.setItems("First", "Second", "Third");
        combo.addStyleName(ValoTheme.COMBOBOX_LARGE);
        row.addComponent(combo);

        combo = new ComboBox("Borderless");
        combo.setPlaceholder("You can type here");
        combo.setItems("First", "Second", "Third");
        combo.addStyleName(ValoTheme.COMBOBOX_BORDERLESS);
        row.addComponent(combo);

        combo = new ComboBox("Tiny");
        combo.setPlaceholder("You can type here");
        combo.setItems("First", "Second", "Third");
        combo.addStyleName(ValoTheme.COMBOBOX_TINY);
        row.addComponent(combo);

        combo = new ComboBox("Huge");
        combo.setPlaceholder("You can type here");
        combo.setItems("First", "Second", "Third");
        combo.addStyleName(ValoTheme.COMBOBOX_HUGE);
        row.addComponent(combo);

        combo = new ComboBox("Floating");
        combo.setPlaceholder("You can type here");
        combo.setItems("First", "Second", "Third");
        combo.addStyleName(MaterialTheme.COMBOBOX_FLOATING);
        row.addComponent(combo);

        combo = new ComboBox("Custom");
        combo.setPlaceholder("You can type here");
        combo.setItems("First", "Second", "Third");
        combo.addStyleName(MaterialTheme.COMBOBOX_CUSTOM);
        row.addComponent(combo);
    }

    private Component getComboBoxWithStyle(String style) {
        CssLayout group = new CssLayout();
        group.setCaption(style);
        group.addStyleName(style);

        ComboBox combo = new ComboBox();
        combo.setPlaceholder("You can type here");

        combo.setEmptySelectionAllowed(false);
        combo.setItems("First", "Second", "Third");
        combo.setValue("First");
        combo.setWidth("240px");
        group.addComponent(combo);
        Button today = new Button("Do It");
        group.addComponent(today);
        return group;
    }

    @Override
    public void enter(ViewChangeEvent event) {
    }
}
