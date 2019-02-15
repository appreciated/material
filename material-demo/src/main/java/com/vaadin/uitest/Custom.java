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
import java.util.function.Consumer;

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


        setSpacing(false);
        h1 = new Label("Uploads Flat with Icon");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);
        addComponent(getIconUploadsButtonsWithStyle(""));
        addComponent(getIconUploadsButtonsWithStyle(MaterialTheme.UPLOAD_FLOATING_ACTION));
        addComponent(getIconUploadsButtonsWithStyle(MaterialTheme.UPLOAD_ROUND));
        addComponent(getIconUploadsButtonsWithStyle(MaterialTheme.UPLOAD_BORDER));
        addComponent(getIconUploadsButtonsWithStyle(MaterialTheme.UPLOAD_BORDERLESS));

        h1 = new Label("Uploads Flat with Icon");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);
        addComponent(getIconUploadsButtonsWithStyle(MaterialTheme.UPLOAD_FLAT));
        addComponent(getIconUploadsButtonsWithStyle(MaterialTheme.UPLOAD_FLOATING_ACTION, MaterialTheme.BUTTON_FLAT));
        addComponent(getIconUploadsButtonsWithStyle(MaterialTheme.UPLOAD_ROUND, MaterialTheme.BUTTON_FLAT));
        addComponent(getIconUploadsButtonsWithStyle(MaterialTheme.UPLOAD_BORDER, MaterialTheme.BUTTON_FLAT));
        addComponent(getIconUploadsButtonsWithStyle(MaterialTheme.UPLOAD_BORDERLESS, MaterialTheme.BUTTON_FLAT));
        setSpacing(true);

        h1 = new Label("Non-immediate Uploads Flat with Icon");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);
        addComponent(getUploadsButtonsWithStyle(upload -> upload.setImmediateMode(false), false, MaterialTheme.UPLOAD_FLAT));
        setSpacing(true);
    }

    public HorizontalLayout getUploadsButtonsWithStyle(String... styles) {
        return getUploadsButtonsWithStyle(styles, false);
    }

    public HorizontalLayout getIconUploadsButtonsWithStyle(String... styles) {
        return getUploadsButtonsWithStyle(styles, true);
    }

    public HorizontalLayout getUploadsButtonsWithStyle(String[] styles, boolean withIcon) {
        return getUploadsButtonsWithStyle(null, withIcon, styles);
    }

    public HorizontalLayout getUploadsButtonsWithStyle(Consumer<Upload> supplier, boolean withIcon, String... styles) {
        String style = Arrays.stream(styles).reduce((s, s2) -> s + " " + s2).orElse("");
        HorizontalLayout layout = new HorizontalLayout();
        Arrays.asList("", ValoTheme.BUTTON_PRIMARY, ValoTheme.BUTTON_FRIENDLY, ValoTheme.BUTTON_DANGER, MaterialTheme.BUTTON_CUSTOM)
                .stream()
                .forEach(s -> {
                    Upload upload = new Upload(style.contains(MaterialTheme.BUTTON_FLOATING_ACTION) ? "" : "Click Me!", (Upload.Receiver) (s12, s1) -> null);
                    if (style.contains(MaterialTheme.BUTTON_FLOATING_ACTION)) {
                        upload.setIcon(VaadinIcons.PLUS);
                    } else if (withIcon) {
                        upload.setIcon(VaadinIcons.UPLOAD);
                        upload.addStyleName(MaterialTheme.UPLOAD_INLINE_ICON);
                    }
                    upload.addStyleName(style + " " + s);
                    if (supplier != null) {
                        supplier.accept(upload);
                    }
                    layout.addComponent(upload);
                });
        Upload upload = new Upload(style.contains(MaterialTheme.BUTTON_FLOATING_ACTION) ? "" : "Click Me!", (Upload.Receiver) (s12, s1) -> null);
        if (style.contains(MaterialTheme.BUTTON_FLOATING_ACTION)) {
            upload.setIcon(VaadinIcons.PLUS);
        } else if (withIcon) {
            upload.setIcon(VaadinIcons.UPLOAD);
            upload.addStyleName(MaterialTheme.UPLOAD_INLINE_ICON);
        }
        upload.addStyleName(style);
        upload.setEnabled(false);
        layout.addComponent(upload);
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
