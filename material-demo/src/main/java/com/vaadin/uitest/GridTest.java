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
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class GridTest extends VerticalLayout implements View {

    List<Person> people = new ArrayList<>();


    public GridTest() {
        setSizeFull();
        Random random = new Random();
        for (int i = 0; i < 300; i++) {
            people.add(new Person(UUID.randomUUID().toString(), random.nextInt(), i));
        }
        setMargin(true);
        setSpacing(true);

        Grid<Person> grid = getGrid();
        grid.setSizeFull();
        grid.setCaption("Compact");
        grid.setSelectionMode(com.vaadin.ui.Grid.SelectionMode.SINGLE);
        grid.getEditor().setEnabled(true);
        grid.setStyleName(MaterialTheme.TABLE_COMPACT);
        addComponent(grid);
        setExpandRatio(grid, 1.0f);
    }


    private Grid<Person> getGrid() {
        return getGrid(people.size());
    }

    private Grid<Person> getGrid(int size) {
        com.vaadin.ui.Grid<Person> grid = new com.vaadin.ui.Grid<>();
        grid.setItems(people.subList(0, size));
        grid.addColumn(Person::getName).setCaption("Name 1");
        grid.addColumn(Person::getName).setCaption("Name 2");
        grid.addColumn(Person::getName).setCaption("Name 3");
        grid.getColumns().forEach(personColumn -> personColumn.setExpandRatio(1));
        return grid;
    }


    @Override
    public void enter(ViewChangeEvent event) {
    }

    class Person {
        private final String name;
        private final int id;
        private final int year;

        public Person(String name, int year, int id) {
            this.name = name;
            this.year = year;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getBirthYear() {
            return year;
        }

        public int getID() {
            return id;
        }
    }

}
