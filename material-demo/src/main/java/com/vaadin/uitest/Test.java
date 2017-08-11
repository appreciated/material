package com.vaadin.uitest;

import com.github.appreciated.material.MaterialTheme;
import com.vaadin.ui.*;

class MyFormView extends VerticalLayout {
    MyFormView() {
        addStyleName(MaterialTheme.CARD_1);
        setSizeUndefined();
        setMargin(true);

        Label label = new Label("Test Form");
        label.addStyleName(MaterialTheme.LABEL_H3);

        FormLayout form = new FormLayout();
        form.setSizeUndefined();

        TextField textField = new TextField();
        textField.setCaption("TextField");

        DateField dateField = new DateField();
        dateField.setCaption("DateField");

        ComboBox<String> comboBox = new ComboBox<>("ComboBox");
        comboBox.setItems("Valo", "Blueprint", "Dark", "Facebook", "Flat dark", "Flat", "Light", "Metro", "Migrate Reindeer", "Material");

        Button button = new Button("Click Me");
        button.addStyleName(MaterialTheme.BUTTON_BORDERLESS);

        form.addComponents(textField, dateField, comboBox);

        addComponents(label, form, button);
        setComponentAlignment(button, Alignment.TOP_RIGHT);
    }
}
