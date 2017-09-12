---
subtitle: '[]{#_qy0ehwns5zow .anchor}Prepared by Yash Sharma'
title: '[]{#_nj23sjpj5u97 .anchor}JAVA 8 Features'
---

Overview & Purpose
==================

Understanding advances of Java 8 with code examples.

New Features in Java language
=============================

1.  Functional Interfaces and Lambdas
    ---------------------------------

    a.  #### Understanding Lambdas

        i.  **Why Lambdas ?**

            1.  Enables Functional Programming

            2.  Readable and concise code

            3.  Easier to use APIs and libraries

            4.  Enables support for parallel processing

        ii. **OOP v/s Functional Programming**

            1.  Everything is an object

            2.  All code is associated with classes and objects

        iii. **Why do we need Lambda Expression ?**

            1.  Reduced Lines of Code

            2.  Sequential and Parallel Execution Support

        iv. **CODE EXAMPLE**

            1.  Greeter.java

    b.  #### Lambda Expression

        i.  Sugar for an anonymous class with one method.

        ii. Lambda expressions are meant to create anonymous classes of
            > functional interfaces easily.

        iii. A new package **java.util.function** has been added with
            > bunch of functional interfaces to provide target types for
            > lambda expressions and method references

        iv. **Syntax**

            1.  () -&gt; body

            2.  parameter -&gt; body

            3.  (parameters) -&gt; body

        v.  **CODE Example**

            1.  LambdaExample.java

            2.  RunnableExample.java

            3.  TypeInferenceExample.java,

            4.  Unit1Exercise\*.java

    c.  #### Functional Interfaces 

        i.  *An interface with exactly one abstract method becomes
            > Functional Interface.*

        ii. Functional interfaces are also known as **Single Abstract
            > Method Interfaces (SAM Interfaces)**.

        iii. **@FunctionalInterface** annotation to avoid accidental
            > addition of abstract methods in the functional interfaces.

        iv. **CODE EXAMPLE -** Unit2

            1.  StandardFunctionalInterfacesExample.java

            2.  FunctionalInterfacesExample.java

    d.  #### [*Method references*](https://www.codementor.io/eh3rrera/using-java-8-method-reference-du10866vx)

        i.  A method reference is the shorthand syntax for a lambda
            > expression that executes just ONE method.

        ii. **Syntax**

            1.  **Object :: methodName**

        iii. **CODE EXAMPLE** - Unit3

            1.  MethodReferenceExample1.java

            2.  MethodReferenceExample2.java

    e.  ####  Other aspects

        i.  **CODE EXAMPLE** - Unit3

            1.  ExceptionHandlingExample.java

            2.  ClosuresExample.java

            3.  ThisReferenceExample.java

            4.  #### Collection improvements & Streams 

                a.  CollectionIterationExample.java

                b.  StreamsExample1.java

2.  Interface Default and Static Methods
    ------------------------------------

    a.  Java provides a facility to create **default / static** methods
        > inside the interface. Methods which are defined inside the
        > interface and tagged with default and static keyword are known
        > as default methods and static methods respectively. These
        > methods are non-abstract methods and can have method body.

    b.  Cannot override Object class methods - Since any class
        > implementing an interface already has Object as superclass, if
        > we have equals(), hashCode() default methods in interface, it
        > will become irrelevant. That’s why for better clarity,
        > interfaces are not allowed to have Object class default
        > methods.

    c.  Diamond problem - gives compile time exception

    d.  used heavily in Collection API and default methods are added so
        > that our code remains backward compatible.

    e.  **CODE EXAMPLE**

3.  Repeating annotations
    ---------------------

    a.  Prior to Java 8, it was forbidden to declare more than one
        > annotation of the same type to the same location of a code.

    b.  **CODE EXAMPLE**

    c.  [*Example*](https://blog.idrsolutions.com/2015/03/java-8-repeating-annotation-explained-in-5-minutes/)

    d.  [*Refer*](https://docs.oracle.com/javase/tutorial/java/annotations/repeating.html)

4.  Better Type Inference
    ---------------------

    a.  Type inference is a Java compiler's ability to look at each
        > method invocation and corresponding declaration to determine
        > the type argument (or arguments) that make the invocation
        > applicable. The inference algorithm determines the types of
        > the arguments and, if available, the type that the result is
        > being assigned, or returned. Finally, the inference algorithm
        > tries to find the most specific type that works with all of
        > the arguments.

    b.  **CODE EXAMPLE**

    c.  [*Refer*](https://docs.oracle.com/javase/tutorial/java/generics/genTypeInference.html)

5.  Extended Annotations Support - Type Annotations 
    ------------------------------------------------

> Now annotations can be used to decorate generic types itself. Type
> Annotations are annotations that can be placed anywhere you use a
> type. This includes the new operator, type casts, implements clauses
> and throws clauses. Type Annotations allow improved analysis of Java
> code and can ensure even stronger type checking.

*Eg: List&lt;@Nullable String&gt;*

> Which is not desired always, but can prove to be useful in certain
> circumstances. Apart from decorating Generic types, it can also be
> used in constructors and casting.

*Eg: new @NonEmpty @Readonly List(myNonEmptyStringSet)*

*new @Interned MyObject()*

*myString = (@NonNull String) myObject;*

Even the array objects can be annotated:

> *@NotNull String\[\] arr;*
>
> The inclusion of RuntimeVisibleTypeAnnotations and
> RuntimeInvisibleTypeAnnotations attributes which cause the .class file
> to save the annotation information.

a.  **Note**: Please note that the annotations from the following
    > examples will not work out of the box when Java 8 is released.
    > Java 8 only provides the ability to define these types of
    > annotations. It is then up to framework and tool developers to
    > actually make use of it. So this is a collection of annotations
    > frameworks could give us in the future.

b.  **CODE EXAMPLE**

c.  [*Refer*](https://www.javatpoint.com/java-8-type-annotations-and-repeating-annotations)

New Features in Java compiler
=============================

1.  Parameter names
    ---------------

    a.  [*Refer*](https://julien.ponge.org/blog/java8-parameter-names-and-jdk-dogfooding/)

New Features in Java libraries
==============================

1.  [*Optional Class*](https://www.mkyong.com/java8/java-8-optional-in-depth/)
    --------------------------------------------------------------------------

    a.  Null checks are not required.

    b.  No more NullPointerException at runtime.

    c.  We can develop clean and neat APIs.

    d.  No more Boilerplate code

2.  StringJoiner Class
    ------------------

    a.  **CODE EXAMPLE**

3.  Streams API
    -----------

    a.  Java Stream API for Bulk Data Operations on Collections

    b.  Two Operations

        i.  Executing - eg. Filtering

        ii. Terminating - eg. Printing the result

    c.  Java.util.stream

    d.  Gives parallel execution as well

    e.  **CODE EXAMPLE**

    f.  **Refer [*Link1*](http://www.baeldung.com/java-8-streams),
        > [*Link2*](http://www.journaldev.com/2774/java-8-stream),
        > [*Link3*](http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/)**

4.  [*Collection API improvements*](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/changes8.html)
    -----------------------------------------------------------------------------------------------------------------

    a.  forEach() method in Iterable interface

        i.  forEach method in java.lang.Iterable interface so that while
            > writing code we focus on business logic only.

        ii. forEach method takes java.util.function.Consumer object as
            > argument

        iii. it helps in having our business logic at a separate
            > location that we can reuse.

        iv. **CODE EXAMPLE**

    b.  Iterator default method forEachRemaining(Consumer action) to
        > perform the given action for each remaining element until all
        > elements have been processed or the action throws an
        > exception.

    c.  Collection default method removeIf(Predicate filter) to remove
        > all of the elements of this collection that satisfy the given
        > predicate.

    d.  Collection spliterator() method returning Spliterator instance
        > that can be used to traverse elements sequentially or
        > parallel.

    e.  Map replaceAll(), compute(), merge() methods.

    f.  Performance Improvement for HashMap class with Key Collisions

        i.  The alternative String hash function added in
            > [*7u6*](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/changes7.html)
            > has been removed from JDK 8, along with the
            > jdk.map.althashing.threshold system property. Instead,
            > hash bins containing a large number of colliding keys
            > improve performance by storing their entries in a balanced
            > tree instead of a linked list. This JDK 8 change applies
            > only to HashMap, LinkedHashMap, and ConcurrentHashMap.

    g.  [*Parallel
        > Arrays*](https://examples.javacodegeeks.com/core-java/util/concurrent/java-8-parallel-arrays-example/) -
        > Eg. Arrays.ParallelSort()

5.  Date/Time API (JSR 310)
    -----------------------

    a.  java.time new package

    b.  sub-packages java.time.format that provides classes to print and
        > parse dates and times

    c.  & java.time.zone provides support for time-zones and their
        > rules.

    d.  The new Time API prefers enums over integer constants for months
        > and days of the week.

    e.  One of the useful class is DateTimeFormatter for converting
        > datetime objects to strings.

6.  IO Improvements
    ---------------

    a.  Files.list(Path dir) that returns a lazily populated Stream, the
        > elements of which are the entries in the directory.

    b.  Files.lines(Path path) that reads all lines from a file as a
        > Stream.

    c.  Files.find() that returns a Stream that is lazily populated with
        > Path by searching for files in a file tree rooted at a given
        > starting file.

    d.  BufferedReader.lines() that return a Stream, the elements of
        > which are lines read from this BufferedReader.

7.  Concurrency API Improvements
    ----------------------------

    a.  ConcurrentHashMap compute(), forEach(), forEachEntry(),
        > forEachKey(), forEachValue(), merge(), reduce() and search()
        > methods.

    b.  CompletableFuture that may be explicitly completed (setting its
        > value and status).

    c.  Executors newWorkStealingPool() method to create a work-stealing
        > thread pool using all available processors as its target
        > parallelism level.

New Java tools
==============

1.  **Nashorn engine**: 
    --------------------

    a.  jjs command is added to invoke Nashorn Engine.
        ----------------------------------------------

    b.  Nashorn JavaScript Engine (Java + JavaScript)

    c.  Nashorn is a JavaScript engine developed in the Java programming
        > language by Oracle. It is based on the Da Vinci Machine
        > (JSR 292) and has been released with Java 8.

2.  Class dependency analyzer
    -------------------------

    a.  **jdeps** (Java class dependency analyzer) command is added to
        > analyze class files

New Features in Java runtime (JVM)
==================================

1.  **PermGen (Permanent Generation)** memory space has been removed
    > **Metaspace** is introduced

Miscellaneous Core API improvements
===================================

1.  ThreadLocal static method withInitial(Supplier supplier) to create
    > instance easily.

2.  Comparator interface has been extended with a lot of default and
    > static methods for natural ordering, reverse order etc.

3.  min(), max() and sum() methods in Integer, Long and Double wrapper
    > classes.

4.  logicalAnd(), logicalOr() and logicalXor() methods in Boolean class.

5.  ZipFile.stream() method to get an ordered Stream over the ZIP file
    > entries. Entries appear in the Stream in the order they appear in
    > the central directory of the ZIP file.

6.  Several utility methods in Math class.

7.  **JDBC-ODBC** Bridge has been removed.

8.  [*Base64*](https://dzone.com/articles/base64-encoding-java-8)
    > Encode/Decode Class

References
==========

-   [*https://www.youtube.com/watch?v=gpIUfj3KaOc*](https://www.youtube.com/watch?v=gpIUfj3KaOc)

-   [*https://www.javatpoint.com/java-8-features*](https://www.javatpoint.com/java-8-features)

-   [*http://www.journaldev.com/2389/java-8-features-with-examples*](http://www.journaldev.com/2389/java-8-features-with-examples)

-   [*https://www.javacodegeeks.com/2014/05/java-8-features-tutorial.html*](https://www.javacodegeeks.com/2014/05/java-8-features-tutorial.html)
