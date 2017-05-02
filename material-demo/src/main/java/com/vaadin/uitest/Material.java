package com.vaadin.uitest;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by Johannes on 02.05.2017.
 */
public class Material extends VerticalLayout implements View {

    public Material() {
        Label h1 = new Label("Elevation");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);
        CssLayout layout = new CssLayout();
        layout.addComponent(getLayoutWithStyle("card-0"));
        layout.addComponent(getLayoutWithStyle("card-1"));
        layout.addComponent(getLayoutWithStyle("card-2"));
        layout.addComponent(getLayoutWithStyle("card-3"));
        layout.addComponent(getLayoutWithStyle("card-4"));
        layout.addComponent(getLayoutWithStyle("card-5"));

        addComponent(layout);

        h1 = new Label("Hoverable");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);

        addComponent(getLayoutWithStyle("card-hoverable"));
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
