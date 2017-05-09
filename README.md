# MyComponent Add-on for Vaadin 8

Material is a Theme for Vaadin 8.

## Online demo

//TODO



## Download release

Official releases of this add-on are available at Vaadin Directory. For Maven instructions, download and reviews, go to https://vaadin.com/directory#!addon/material

## Building and running demo

````
git clone git@github.com:appreciated/material-design.git
mvn clean install
cd demo
mvn jetty:run
````
To see the demo, navigate to http://localhost:8080/

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are welcome. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:
- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## Roadmap to 1.0

- improve scss abstraction
- introduce theme variables to allow customizablity
- include community feedback 

## Working with the Vaadin Designer 1/2

The Designer won't be able to successfully compile the SCSS because as long as it doesn't have access to the the theme files. 
To fix this you will either need to copy the files manually to `src/main/webapp/VAADIN/themes` or you could use a maven plugin that does the job for you.  
If you plan to have a copy of the theme in your `./webapp/VAADIN/themes` directory you might want to add `src/main/webapp/VAADIN/themes/material/` to your .gitignore 
````
  <plugin>
    <artifactId>maven-dependency-plugin</artifactId>
    <executions>
        <execution>
            <id>unpack-one</id>
            <phase>generate-resources</phase>
            <goals>
                <goal>unpack-dependencies</goal>
            </goals>
            <configuration>
                <includeGroupIds>com.github.appreciated</includeGroupIds>
                <includeArtifactIds>material</includeArtifactIds>
                <type>zip</type>
                <excludes>*</excludes>
                <includes>VAADIN/themes/**</includes>
                <outputDirectory>src/main/webapp/</outputDirectory>
            </configuration>
        </execution>
    </executions>
  </plugin>
````

## Licenses & Authors

The Theme (material-addon) is mostly written by Appreciated and is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

A [small part](https://github.com/appreciated/material/blob/master/material-addon/src/main/webapp/VAADIN/themes/material/materialize/globals.scss) in the material-addon has been taken from the [Materialize Project](https://github.com/Dogfalo/materialize) which has been Licensed under the MIT License see MIT-LICENSE.txt. 

Most of the code in the Demo (material-demo) has been written by the Vaadin Team and has been taken from [here](https://github.com/vaadin/framework/tree/master/uitest/src/main/java/com/vaadin/tests/themes/valo) for the developement of the theme but is not included in the addon itself and is distributed under Apache License 2.0.
