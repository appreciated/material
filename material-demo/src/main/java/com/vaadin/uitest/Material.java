/*
 * Copyright 2017 appreciated
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
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import static com.github.appreciated.material.MaterialTheme.*;

/**
 * Created by Appreciated on 02.05.2017.
 */
public class Material extends VerticalLayout implements View {

    private Component label;

    public Material() {
        Label h1 = new Label("Cards");
        h1.addStyleName(ValoTheme.LABEL_H2);
        addComponent(h1);
        CssLayout layout = new CssLayout();
        layout.addComponent(getLayoutWithStyle(CARD_0));
        layout.addComponent(getLayoutWithStyle(CARD_1));
        layout.addComponent(getLayoutWithStyle(CARD_1_5));
        layout.addComponent(getLayoutWithStyle(CARD_2));
        layout.addComponent(getLayoutWithStyle(CARD_3));
        layout.addComponent(getLayoutWithStyle(CARD_4));
        layout.addComponent(getLayoutWithStyle(CARD_5));
        addComponent(layout);

        h1 = new Label("Hoverable Card");
        h1.addStyleName(ValoTheme.LABEL_H2);
        addComponent(h1);
        addComponent(getLayoutWithStyle(MaterialTheme.CARD_HOVERABLE));

        h1 = new Label("Cards without Padding");
        h1.addStyleName(ValoTheme.LABEL_H2);
        addComponent(h1);
        layout = new CssLayout();
        layout.addComponent(getLayoutWithStyle(CARD_1 + " " + CARD_NO_PADDING, getLabel(), false));
        layout.addComponent(getLayoutWithStyle(CARD_1_5 + " " + CARD_NO_PADDING, getLabel(), false));
        layout.addComponent(getLayoutWithStyle(CARD_2 + " " + CARD_NO_PADDING, getLabel(), false));
        layout.addComponent(getLayoutWithStyle(CARD_3 + " " + CARD_NO_PADDING, getLabel(), false));
        layout.addComponent(getLayoutWithStyle(CARD_4 + " " + CARD_NO_PADDING, getLabel(), false));
        layout.addComponent(getLayoutWithStyle(CARD_5 + " " + CARD_NO_PADDING, getLabel(), false));
        layout.addComponent(getLayoutWithStyle(CARD_HOVERABLE + " " + CARD_NO_PADDING, getLabel(), false));
        addComponent(layout);
    }

    private VerticalLayout getLayoutWithStyle(String name) {
        return getLayoutWithStyle(name, null, true);
    }


    private VerticalLayout getLayoutWithStyle(String name, Component component, boolean height) {
        HorizontalLayout layout = new HorizontalLayout();
        layout.addStyleName(name);
        layout.setCaption(name);
        if (height) {
            layout.setWidth("150px");
            layout.setHeight("150px");
        }
        if (component != null) {
            layout.addComponent(component);
        }
        layout.setMargin(false);
        VerticalLayout wrapper = new VerticalLayout(layout);
        wrapper.setWidthUndefined();
        return wrapper;
    }


    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

    }

    public Component getLabel() {
        Label testlabel = new Label("test");
        testlabel.setHeight(30, Unit.PIXELS);
        testlabel.setWidth(50, Unit.PIXELS);
        return testlabel;
    }
}
