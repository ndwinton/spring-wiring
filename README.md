# Spring Bean Wiring

This small example application demonstrates some of the ways in which
Spring beans are automatically wired into a Spring Boot application.

### Running the application

You can run the application by invoking the following command:

```bash
./gradlew bootRun
```

It will start up and print out the values of different wirings.
That's all that it does -- just stop it with a CTRL-C!

### What it does

The application demonstrates bean wiring selection using the following
mechanisms:

* Matching on there only being a single bean of the required type
* Matching the constructor parameter name to the bean name
* Selecting among candidates based on `@Qualifier` annotations
* Selecting among candidates based on the `@Primary` annotation
* Supplying a list of all matching beans of a given type, maybe
  filtered by qualifier
* Explicitly selecting a bean that returns a `List` type
* Selecting a bean based on an `@ConditionalOn...` annotation
* Implcitly wiring in a bean provided by the Spring Boot runtime

