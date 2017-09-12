package java8.examples;

public class FunctionalInterfacesExample {

}





interface Foo { boolean equals(Object obj); }
//Not functional because equals is already an implicit member (Object class)

interface Comparator<T> {
boolean equals(Object obj);
int compare(T o1, T o2);
}
//Functional because Comparator has only one abstract non-Object method

interface Foo1 {
int m();
Object clone();
}
//Not functional because method Object.clone is not public

interface X { int m(Iterable<String> arg); }
interface Y { int m(Iterable<String> arg); }

interface Z extends X, Y {}
//Functional: two methods, but they have the same signature

interface X1 { Iterable m(Iterable<String> arg); }
interface Y1 { Iterable<String> m(Iterable arg); }
interface Z1 extends X1, Y1 {}
//Functional: Y.m is a subsignature & return-type-substitutable

interface X2 { int m(Iterable<String> arg); }
interface Y2 { int m(Iterable<Integer> arg); }
interface Z2 extends X2, Y2 {}
//Not functional: No method has a subsignature of all abstract methods

interface X3 { int m(Iterable<String> arg, Class c); }
interface Y3 { int m(Iterable arg, Class<?> c); }
interface Z3 extends X3, Y3 {}
//Not functional: No method has a subsignature of all abstract methods

interface X4 { long m(); }
interface Y4 { int m(); }
interface Z4 extends X4, Y4 {}
//Compiler error: no method is return type substitutable

interface Foo3<T> { void m(T arg); }
interface Bar<T> { void m(T arg); }
interface FooBar<X, Y> extends Foo3<X>, Bar<Y> {}
//Compiler error: different signatures, same erasure
