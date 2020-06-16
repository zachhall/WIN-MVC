## MVC

Is a Design Pattern
MVC = Model-View-Controller

1. Model: Object that contains data (optionally has logic to update if data changes)
2. View: Represents the visualization of the data the model contains
3. Controller: acts on both the Model and View; controls data flow into the model and updates the view whenever data changes. **Keeps Model and View separate**

## POJO - Plain Old Java Object

Definition: an ordinary Java object that is not bound by any special restrictions
POJOs should not have to:

1. Extend prespecified class: `public class Foo extends Bar`
2. Implements presepecified interface: `public class Foo implements Bar`
3. Contain prespecified annotations

### JavaBean

A JavaBean is a POJO that is serializable, has a no-argument constructor, and allows access to properties using getter and setter methods.

JavaBeans techincally breaks POJO protocol by implementing the Serializable interface, but we forgive it.

## The Spring Family/Ecosystem

Spring is a family/ecosystem of Java tools, libraries, and a framework
Framework = has custom created its own libraries that makes it easier for developers to start and build robust, enterprise level Java applications

### Spring Boot

Spring Boot is a convention-over-configuration RAD tool built on top of the Spring framework.

Convention-over-configuration

- Spring Boot takes an opiniated view of how to create Spring applications and quickly creates apps with those chosen defaults
- Prioritizes letting the developer get started immeadiately building a project without having to make a ton of choices out of the box.

RAD - Rapid Application Development

## Maven

Yiddish - "accumulator of knowledge"

A tool that handles our project's dependcies and it builds our application into an exectuable when its done.

Fairly universal - how one Maven project is built is how they're all built, so once you learn, its easy to see its similarities in other projects that use it.

POM.xml

- Project-Object-Model
- this is the file that defines our project and all of its dependencies

### Maven UIDs (Unique Identifiers)

groupID = Group or organization that the project belongs, offen expressed as a inverted domain name, ex: com.win

artifactID = name for the project, will be the name given to its library artifact (.JAR or .WAR file)

version = version of the project being built (0.0.1)

package = either JAR or WAR

### JAR and WAR

Simply zipped/compressed files after your program has been compiled.
Difference in package depends on what purpose your program is fulfilling

**JAR** = contains libraries, resources and accessories for an application
**WAR** = contains the web application that can be deployed to a server. Contains JSP, HTML, JS, etc. for the development of web applications.

### Adding a Manifest for your JAR file

We have to give the built-in maven-jar plugin in our `pom.xml` some configuration information so that it knows where your program's main() is for it to exectute.

Inside of the `<plugins>` section, find the `mavin-jar-plugin` and add the following under its artifactID and version:

```
...
<configuration>
    <archive>
        <manifest>
        // replace myPackage with the name of your own package
        <mainClass>com.myPackage.App</mainClass>
        </manifest>
    </archive>
</configuration>
```
