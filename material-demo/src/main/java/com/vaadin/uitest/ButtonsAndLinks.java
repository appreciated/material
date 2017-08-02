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
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import java.util.Arrays;

/**
 * @author Vaadin Ltd
 */
public class ButtonsAndLinks extends VerticalLayout implements View {
    /**
     *
     */
    public ButtonsAndLinks() {
        setSpacing(false);

        Label h1 = new Label("Buttons");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);

        HorizontalLayout row = new HorizontalLayout();
        row.addStyleName(ValoTheme.LAYOUT_HORIZONTAL_WRAPPING);
        addComponent(row);

        Button button = new Button("Normal");
        row.addComponent(button);

        button = new Button("Disabled");
        button.setEnabled(false);
        row.addComponent(button);

        button = new Button("Primary");
        button.addStyleName(ValoTheme.BUTTON_PRIMARY);
        row.addComponent(button);

        button = new Button("Friendly");
        button.addStyleName(ValoTheme.BUTTON_FRIENDLY);
        row.addComponent(button);

        button = new Button("Danger");
        button.addStyleName(ValoTheme.BUTTON_DANGER);
        row.addComponent(button);

        TestIcon testIcon = new TestIcon(10);
        button = new Button("Small");
        button.addStyleName(ValoTheme.BUTTON_SMALL);
        button.setIcon(testIcon.get());
        row.addComponent(button);

        button = new Button("Large");
        button.addStyleName(ValoTheme.BUTTON_LARGE);
        button.setIcon(testIcon.get());
        row.addComponent(button);

        button = new Button("Top");
        button.addStyleName(ValoTheme.BUTTON_ICON_ALIGN_TOP);
        button.setIcon(testIcon.get());
        row.addComponent(button);

        button = new Button("Image icon");
        button.setIcon(testIcon.get(true, 16));
        row.addComponent(button);

        button = new Button("Image icon");
        button.addStyleName(ValoTheme.BUTTON_ICON_ALIGN_RIGHT);
        button.setIcon(testIcon.get(true));
        row.addComponent(button);

        button = new Button("Photos");
        button.setIcon(testIcon.get());
        row.addComponent(button);

        button = new Button();
        button.setIcon(testIcon.get());
        button.addStyleName(ValoTheme.BUTTON_ICON_ONLY);
        row.addComponent(button);

        button = new Button("Borderless");
        button.setIcon(testIcon.get());
        button.addStyleName(ValoTheme.BUTTON_BORDERLESS);
        row.addComponent(button);

        button = new Button("Borderless, colored");
        button.setIcon(testIcon.get());
        button.addStyleName(ValoTheme.BUTTON_BORDERLESS_COLORED);
        row.addComponent(button);

        button = new Button("Quiet");
        button.setIcon(testIcon.get());
        button.addStyleName(ValoTheme.BUTTON_QUIET);
        row.addComponent(button);

        button = new Button("Link style");
        button.setIcon(testIcon.get());
        button.addStyleName(ValoTheme.BUTTON_LINK);
        row.addComponent(button);

        button = new Button("Icon on right");
        button.setIcon(testIcon.get());
        button.addStyleName(ValoTheme.BUTTON_ICON_ALIGN_RIGHT);
        row.addComponent(button);


        button = new Button("Tiny");
        button.addStyleName(ValoTheme.BUTTON_TINY);
        row.addComponent(button);

        button = new Button("Huge");
        button.addStyleName(ValoTheme.BUTTON_HUGE);
        row.addComponent(button);

        NativeButton nbutton = new NativeButton("Native");
        row.addComponent(nbutton);

        h1 = new Label("Links");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);

        row = new HorizontalLayout();
        row.addStyleName(ValoTheme.LAYOUT_HORIZONTAL_WRAPPING);
        addComponent(row);

        Link link = new Link("vaadin.com",
                new ExternalResource("https://vaadin.com"));
        row.addComponent(link);

        link = new Link("Link with icon",
                new ExternalResource("https://vaadin.com"));
        link.addStyleName("color3");
        link.setIcon(testIcon.get());
        row.addComponent(link);

        link = new Link("Small", new ExternalResource("https://vaadin.com"));
        link.addStyleName(ValoTheme.LINK_SMALL);
        row.addComponent(link);

        link = new Link("Large", new ExternalResource("https://vaadin.com"));
        link.addStyleName(ValoTheme.LINK_LARGE);
        row.addComponent(link);

        link = new Link(null, new ExternalResource("https://vaadin.com"));
        link.setIcon(testIcon.get());
        link.addStyleName(ValoTheme.LINK_LARGE);
        row.addComponent(link);

        link = new Link("Disabled", new ExternalResource("https://vaadin.com"));
        link.setIcon(testIcon.get());
        link.setEnabled(false);
        row.addComponent(link);

        h1 = new Label("Material");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);
        addComponent(getButtonsWithStyle(""));
        addComponent(getButtonsWithStyle(MaterialTheme.BUTTON_FLOATING_ACTION));
        addComponent(getButtonsWithStyle(MaterialTheme.BUTTON_ROUND));
        addComponent(getButtonsWithStyle(MaterialTheme.BUTTON_BORDER));
        addComponent(getButtonsWithStyle(ValoTheme.BUTTON_BORDERLESS));

        h1 = new Label("Flat");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);
        addComponent(getButtonsWithStyle(MaterialTheme.BUTTON_FLAT));
        addComponent(getButtonsWithStyle(MaterialTheme.BUTTON_FLOATING_ACTION + " " + MaterialTheme.BUTTON_FLAT));
        addComponent(getButtonsWithStyle(MaterialTheme.BUTTON_ROUND + " " + MaterialTheme.BUTTON_FLAT));
        addComponent(getButtonsWithStyle(MaterialTheme.BUTTON_BORDER + " " + MaterialTheme.BUTTON_FLAT));
        addComponent(getButtonsWithStyle(ValoTheme.BUTTON_BORDERLESS + " " + MaterialTheme.BUTTON_FLAT));
        setSpacing(true);

        h1 = new Label("Component Groups");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);
        row = new HorizontalLayout();
        row.addStyleName(ValoTheme.LAYOUT_HORIZONTAL_WRAPPING);
        addComponent(row);
        row.addComponent(getGroupWithStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP));
        row.addComponent(getGroupWithStyleName(MaterialTheme.LAYOUT_COMPONENT_GROUP_FLAT));
        row.addComponent(getGroupWithStyleName(MaterialTheme.LAYOUT_COMPONENT_GROUP_MATERIAL));
    }

    private CssLayout getGroupWithStyleName(String style) {
        CssLayout group = new CssLayout();
        group.addStyleName(style);
        Button button = new Button("One");
        group.addComponent(button);
        button = new Button("Two");
        group.addComponent(button);
        button = new Button("Three");
        group.addComponent(button);
        return group;
    }

    public HorizontalLayout getButtonsWithStyle(String style) {
        HorizontalLayout layout = new HorizontalLayout();
        Arrays.asList("", ValoTheme.BUTTON_PRIMARY, ValoTheme.BUTTON_FRIENDLY, ValoTheme.BUTTON_DANGER, MaterialTheme.BUTTON_CUSTOM)
                .stream()
                .forEach(s -> {
                    Button button = style.contains(MaterialTheme.BUTTON_FLOATING_ACTION) ? new Button(VaadinIcons.PLUS) : new Button(style + " " + s);
                    if (s.length() == 0 && style.length() == 0) {
                        button.setCaption("none");
                    }
                    button.addStyleName(style + " " + s);
                    layout.addComponent(button);
                });
        Button button = style.contains(MaterialTheme.BUTTON_FLOATING_ACTION) ? new Button(VaadinIcons.PLUS) : new Button(style + " " + "disabled");
        button.addStyleName(style);
        button.setEnabled(false);
        layout.addComponent(button);
        return layout;
    }


    @Override
    public void enter(ViewChangeEvent event) {
        // TODO Auto-generated method stub

    }

}
