# oop-example

## Polymorphism</b> <br />
<br />
Polymorphism is the ability of an object to take on many forms.</br>
The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.</br>
Any Java object that can pass more than one IS-A test is considered to be polymorphic.</br>
In Java, all Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object.</br>
It is important to know that the only possible way to access an object is through a reference variable.</br>
A reference variable can be of only one type.</br>
Once declared, the type of a reference variable cannot be changed.</br>
The reference variable can be reassigned to other objects provided that it is not declared final.</br>
The type of the reference variable would determine the methods that it can invoke on the object.</br>
A reference variable can refer to any object of its declared type or any subtype of its declared type.</br>
A reference variable can be declared as a class or interface type.</br>

<b>Compile time polymorphism: </b> It is also known as static polymorphism. This type of polymorphism is achieved by <br />
function overloading or operator overloading. <br />

<li><b>Method Overloading:</b> When there are multiple functions with same name but different parameters then these functions <br />
are said to be overloaded. Functions can be overloaded by change in number of arguments or/and change in type of arguments.
<li><b>Operator Overloading:</b> Java also provide option to overload operators. For example, we can make the operator (‘+’) for <br />
string class to concatenate two strings. We know that this is the addition operator whose task is to add two operands. So a single <br />
operator ‘+’ when placed between integer operands, adds them and when placed between string operands, concatenates them. <br />
<b>Runtime polymorphism:</b> It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden <br />
method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding.<br />

<li><b>Method overriding</b>, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class.<br />
That base function is said to be overridden.<br />

##Aggregation and Composition<br />

Aggregation and Composition are subsets of association meaning they are specific cases of association. <br />
In both aggregation and composition object of one class "owns" object of another class. <br />
But there is a subtle difference. In Composition the object of class that is owned by the object of it's owning class cannot live on it's own <br />
(Also called "death relationship"). It will always live as a part of it's owning object where as in Aggregation the dependent object is standalone <br />
and can exist even if the object of owning class is dead. <br />
So in composition if owning object is garbage collected the owned object will also be which is not the case in aggregation. <br />

<b>Composition Example:</b> Consider the example of a Car and an engine that is very specific to that car (meaning it cannot be used in any other car). <br />
This type of relationship between Car and SpecificEngine class is called Composition. An object of the Car class cannot exist without an object  <br />
of SpecificEngine class and object of SpecificEngine has no significance without Car class. To put in simple words Car class solely "owns" the <br />
SpecificEngine class. <br />

<b>Aggregation Example:</b> Now consider class Car and class Wheel. Car needs a Wheel object to function. Meaning the Car object owns the Wheel object <br />
but we cannot say the Wheel object has no significance without the Car Object. It can very well be used in a Bike, Truck or different Cars Object.<br />

##Generics in Java <br />

Generics in Java is similar to templates in C++. The idea is to allow type (Integer, String, … etc and user defined types) to be a parameter to <br />
methods, classes and interfaces<br/>
<b>Advantages of Generics: </b> <br />
<li> Code Reuse: We can write a method/class/interface once and use for any type we want.
<li>Type Safety : Generics make errors to appear compile time than at run time (It’s always better to know problems in your code at compile time <br />
 rather than making your code fail at run time). Suppose you want to create an ArrayList that store name of students and if by mistake programmer <br />
 adds an integer object instead of string, compiler allows it. But, when we retrieve this data from ArrayList, it causes problems at runtime.<br />
<li>Individual Type Casting is not needed: If we do not use generics, then, in the above example every-time we retrieve data from ArrayList,  <br />
 then we need not to typecast it every time. <br />
<li>Implementing generic algorithms: By using generics, we can implement algorithms that work on different types of objects and at the same <br />
they are type safe too.<br />