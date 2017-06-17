package com.vaadin.uitest;

import com.github.appreciated.material.MaterialTheme;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Upload;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

import java.util.Arrays;

/**
 * Created by Johannes on 17.06.2017.
 */
public class Custom extends VerticalLayout implements View {
    public Custom() {
        setSpacing(false);
        Label h1 = new Label("Uploads Flat");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);
        addComponent(getUploadsButtonsWithStyle(""));
        addComponent(getUploadsButtonsWithStyle(MaterialTheme.UPLOAD_FLOATING_ACTION));
        addComponent(getUploadsButtonsWithStyle(MaterialTheme.UPLOAD_ROUND));
        addComponent(getUploadsButtonsWithStyle(MaterialTheme.UPLOAD_BORDER));
        addComponent(getUploadsButtonsWithStyle(MaterialTheme.UPLOAD_BORDERLESS));

        h1 = new Label("Uploads Flat");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);
        addComponent(getUploadsButtonsWithStyle(MaterialTheme.UPLOAD_FLAT));
        addComponent(getUploadsButtonsWithStyle(MaterialTheme.UPLOAD_FLOATING_ACTION, MaterialTheme.BUTTON_FLAT));
        addComponent(getUploadsButtonsWithStyle(MaterialTheme.UPLOAD_ROUND, MaterialTheme.BUTTON_FLAT));
        addComponent(getUploadsButtonsWithStyle(MaterialTheme.UPLOAD_BORDER, MaterialTheme.BUTTON_FLAT));
        addComponent(getUploadsButtonsWithStyle(MaterialTheme.UPLOAD_BORDERLESS, MaterialTheme.BUTTON_FLAT));
        setSpacing(true);
    }

    public HorizontalLayout getUploadsButtonsWithStyle(String... styles) {
        String style = Arrays.stream(styles).reduce((s, s2) -> s + " " + s2).orElse("");
        HorizontalLayout layout = new HorizontalLayout();
        Arrays.asList("", ValoTheme.BUTTON_PRIMARY, ValoTheme.BUTTON_FRIENDLY, ValoTheme.BUTTON_DANGER, MaterialTheme.BUTTON_CUSTOM)
                .stream()
                .forEach(s -> {
                    Upload upload = new Upload(style.contains(MaterialTheme.BUTTON_FLOATING_ACTION) ? "" : "Click Me!", (Upload.Receiver) (s12, s1) -> null);
                    upload.setIcon(style.contains(MaterialTheme.BUTTON_FLOATING_ACTION) ? VaadinIcons.PLUS : null);
                    upload.addStyleName(style + " " + s);
                    layout.addComponent(upload);
                });
        return layout;
    }


    private void addUploadWithStyle(String style) {
        Upload upload = new Upload("Labels", (Upload.Receiver) (s, s1) -> null);
        addComponent(upload);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }
}
