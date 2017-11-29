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
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

public class CheckBoxes extends VerticalLayout implements View {
    public CheckBoxes() {
        setSpacing(false);

        Label h1 = new Label("Check Boxes");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);

        HorizontalLayout row = new HorizontalLayout();
        row.addStyleName(ValoTheme.LAYOUT_HORIZONTAL_WRAPPING);
        addComponent(row);

        CheckBox check = new CheckBox("Checked", true);
        row.addComponent(check);

        check = new CheckBox(
                "Checked, explicit width, so that the caption should wrap",
                true);
        row.addComponent(check);
        check.setWidth("150px");

        check = new CheckBox("Not checked");
        row.addComponent(check);

        check = new CheckBox(null, true);
        check.setDescription("No caption");
        row.addComponent(check);

        check = new CheckBox("Custom color", true);
        check.addStyleName("color1");
        row.addComponent(check);

        TestIcon testIcon = new TestIcon(30);
        check = new CheckBox("Custom color", true);
        check.addStyleName("color2");
        check.setIcon(testIcon.get());
        row.addComponent(check);

        check = new CheckBox("With Icon", true);
        check.setIcon(testIcon.get());
        row.addComponent(check);

        check = new CheckBox();
        check.setIcon(testIcon.get(true));
        row.addComponent(check);

        check = new CheckBox("Small", true);
        check.addStyleName(ValoTheme.CHECKBOX_SMALL);
        row.addComponent(check);

        check = new CheckBox("Large", true);
        check.addStyleName(ValoTheme.CHECKBOX_LARGE);
        row.addComponent(check);

        check = new CheckBox("Disabled", true);
        check.setEnabled(false);
        check.setIcon(testIcon.get());
        row.addComponent(check);

        check = new CheckBox("Readonly", true);
        check.setReadOnly(true);
        check.setIcon(testIcon.get());
        row.addComponent(check);

        h1 = new Label("Option Groups");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);

        row = new HorizontalLayout();
        row.addStyleName(ValoTheme.LAYOUT_HORIZONTAL_WRAPPING);
        addComponent(row);

        RadioButtonGroup<String> rGroup = new RadioButtonGroup("Choose one, explicit width");
        rGroup.setWidth("200px");
        rGroup.setItems("Option One",
                "Option Two, with a longer caption that should wrap when the components width is explicitly set."
                , "Option Three");
        rGroup.setValue("Option One");
        row.addComponent(rGroup);

        CheckBoxGroup<String> cGroup = new CheckBoxGroup("Choose many, explicit width");
        cGroup.setWidth("200px");
        cGroup.setItems("Option One",
                "Option Two, with a longer caption that should wrap when the components width is explicitly set."
                , "Option Three");
        //cGroup.setValue("Option One");
        row.addComponent(cGroup);

        rGroup = new RadioButtonGroup("Choose one, small");
        rGroup.addStyleName(ValoTheme.OPTIONGROUP_SMALL);
        rGroup.setItems("Option One",
                "Option Two, with a longer caption that should wrap when the components width is explicitly set."
                , "Option Three");
        rGroup.setValue("Option One");
        row.addComponent(rGroup);

        cGroup = new CheckBoxGroup("Choose many, small");
        cGroup.addStyleName(ValoTheme.OPTIONGROUP_SMALL);
        cGroup.setItems("Option One",
                "Option Two, with a longer caption that should wrap when the components width is explicitly set."
                , "Option Three");
        //cGroup.setValue("Option One");
        row.addComponent(cGroup);

        rGroup = new RadioButtonGroup("Choose one, large");
        rGroup.addStyleName(ValoTheme.OPTIONGROUP_LARGE);
        rGroup.setItems("Option One",
                "Option Two, with a longer caption that should wrap when the components width is explicitly set."
                , "Option Three");
        rGroup.setValue("Option One");
        row.addComponent(rGroup);

        cGroup = new CheckBoxGroup("Choose many, large");
        cGroup.addStyleName(ValoTheme.OPTIONGROUP_LARGE);
        cGroup.setItems("Option One",
                "Option Two, with a longer caption that should wrap when the components width is explicitly set."
                , "Option Three");
        //cGroup.setValue("Option One");
        row.addComponent(cGroup);

        rGroup = new RadioButtonGroup("Horizontal items");
        rGroup.addStyleName(ValoTheme.OPTIONGROUP_HORIZONTAL);
        rGroup.setItems("Option One",
                "Option Two, with a longer caption that should wrap when the components width is explicitly set."
                , "Option Three");
        rGroup.setValue("Option One");
        row.addComponent(rGroup);

        cGroup = new CheckBoxGroup("Horizontal items, explicit width");
        cGroup.addStyleName(ValoTheme.OPTIONGROUP_HORIZONTAL);
        cGroup.setWidth(500, Unit.PIXELS);
        cGroup.setItems("Option One",
                "Option Two, with a longer caption that should wrap when the components width is explicitly set."
                , "Option Three");
        //cGroup.setValue("Option One");
        row.addComponent(cGroup);

        rGroup = new RadioButtonGroup("Disabled items");
        rGroup.setEnabled(false);
        rGroup.addStyleName(ValoTheme.OPTIONGROUP_HORIZONTAL);
        rGroup.setItems("Option One",
                "Option Two, with a longer caption that should wrap when the components width is explicitly set."
                , "Option Three");
        rGroup.setValue("Option One");
        row.addComponent(rGroup);
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // TODO Auto-generated method stub

    }

}
