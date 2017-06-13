/*
 * Copyright 2000-2013 Vaadin Ltd.
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

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.shared.ui.colorpicker.Color;
import com.vaadin.ui.AbstractColorPicker.PopupStyle;
import com.vaadin.ui.ColorPicker;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class ColorPickers extends VerticalLayout implements View {
    public ColorPickers() {
        setSpacing(false);

        Label h1 = new Label("Color Pickers");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);

        HorizontalLayout row = new HorizontalLayout();
        row.addStyleName(ValoTheme.LAYOUT_HORIZONTAL_WRAPPING);
        addComponent(row);

        TestIcon testIcon = new TestIcon(40);


        HorizontalLayout layout = new HorizontalLayout();

        layout.setCaption("default");
        ColorPicker cp = new ColorPicker();
        cp.setDefaultCaptionEnabled(true);
        cp.setIcon(testIcon.get());
        cp.setValue(new Color(138, 73, 115));
        layout.addComponent(cp);

        cp = new ColorPicker();
        cp.setPopupStyle(PopupStyle.POPUP_SIMPLE);
        cp.setTextfieldVisibility(true);
        layout.addComponent(cp);

        row.addComponent(layout);

        layout = new HorizontalLayout();
        layout.setCaption("flat");
        cp = new ColorPicker();
        cp.addStyleName("flat");
        cp.setDefaultCaptionEnabled(true);
        cp.setIcon(testIcon.get());
        cp.setValue(new Color(138, 73, 115));
        layout.addComponent(cp);

        cp = new ColorPicker();
        cp.addStyleName("flat");
        cp.setPopupStyle(PopupStyle.POPUP_SIMPLE);
        cp.setTextfieldVisibility(true);
        layout.addComponent(cp);

        row.addComponent(layout);

        layout = new HorizontalLayout();

        layout.setCaption("borderless");
        cp = new ColorPicker();
        cp.setDefaultCaptionEnabled(true);
        cp.addStyleName("borderless");
        cp.setIcon(testIcon.get());
        cp.setValue(new Color(138, 73, 115));
        layout.addComponent(cp);

        cp = new ColorPicker();
        cp.addStyleName("borderless");
        cp.setPopupStyle(PopupStyle.POPUP_SIMPLE);
        cp.setTextfieldVisibility(true);
        layout.addComponent(cp);

        row.addComponent(layout);
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // TODO Auto-generated method stub

    }

}
