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

## License & Author

The Theme (material-addon) is mostly written by Appreciated and is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

A [small part](https://github.com/appreciated/material/blob/master/material-addon/src/main/webapp/VAADIN/themes/material/materialize/globals.scss) in the material-addon has been taken from the [Materialize Project](https://github.com/Dogfalo/materialize) which has been Licensed under the MIT License for the License File see MIT-LICENSE.txt. 

Most of the code in the Demo (material-demo) has been written by the Vaadin Team and has been taken from [here](https://github.com/vaadin/framework/tree/master/uitest/src/main/java/com/vaadin/tests/themes/valo) and is also distributed under Apache License 2.0.
