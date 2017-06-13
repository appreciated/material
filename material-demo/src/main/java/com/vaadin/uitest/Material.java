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
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by Appreciated on 02.05.2017.
 */
public class Material extends VerticalLayout implements View {

    public Material() {
        Label h1 = new Label("Elevation");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);
        CssLayout layout = new CssLayout();
        layout.addComponent(getLayoutWithStyle(MaterialTheme.CARD_0));
        layout.addComponent(getLayoutWithStyle(MaterialTheme.CARD_1));
        layout.addComponent(getLayoutWithStyle(MaterialTheme.CARD_1_5));
        layout.addComponent(getLayoutWithStyle(MaterialTheme.CARD_2));
        layout.addComponent(getLayoutWithStyle(MaterialTheme.CARD_3));
        layout.addComponent(getLayoutWithStyle(MaterialTheme.CARD_4));
        layout.addComponent(getLayoutWithStyle(MaterialTheme.CARD_5));
        addComponent(layout);

        h1 = new Label("Hoverable");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);

        addComponent(getLayoutWithStyle(MaterialTheme.CARD_HOVERABLE));
    }

    private VerticalLayout getLayoutWithStyle(String name) {
        HorizontalLayout layout = new HorizontalLayout();
        layout.addStyleName(name);
        layout.setCaption(name);
        layout.setWidth("150px");
        layout.setHeight("150px");
        layout.setMargin(true);
        VerticalLayout wrapper = new VerticalLayout(layout);
        wrapper.setWidthUndefined();
        return wrapper;
    }


    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

    }
}
