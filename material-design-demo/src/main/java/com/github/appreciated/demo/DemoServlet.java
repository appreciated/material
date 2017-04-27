package com.github.appreciated.demo;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import javax.servlet.annotation.WebServlet;

/**
 * Created by Johannes on 27.04.2017.
 */

@WebServlet(urlPatterns = "/*", name = "GurpsUIServlet", asyncSupported = true)
@VaadinServletConfiguration(ui = ValoThemeUI.class, productionMode = false)
public class DemoServlet extends VaadinServlet {
}