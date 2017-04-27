package com.github.appreciated.demo;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class NonDraggableWindow extends AbstractTestUI {
    @Override
    protected void setup(VaadinRequest request) {
        Window window = new Window("Non-draggable window", new Label());
        window.setDraggable(false);

        addWindow(window);
    }
}
