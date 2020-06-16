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
