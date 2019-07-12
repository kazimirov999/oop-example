# oop-example


###Polymorphism in Java

Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.<br>

There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.<br>

####Compile-time polymorphism

Polymorphism that is resolved during compiler time is known as static polymorphism. Method overloading is an example of compile time polymorphism.<br>
Method Overloading: This allows us to have more than one method having the same name, if the parameters of methods are different in number, sequence and data types of parameters.<br>

**Example of static Polymorphism**<br>
Method overloading is one of the way java supports static polymorphism. In the Teacher class, we have four definitions of the same printSalary () method that will be called by the printSalary method, defined by a list of parameters during compilation. That is why it is also known as the polymorphism of compilation time.<br>

####Runtime Polymorphism

Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.<br>

In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.<br>

**Example of Java Runtime Polymorphism**<br>
In this example, we are creating three classes Student,  FullTimeStudent and PartTimeStudent. FullTimeStudent and PartTimeStudent classes extends Student class and overrides its printInformationAboutTheStudent() method. We are calling the printInformationAboutTheStudent method by the reference variable of Parent class. Since it refers to the subclass object and subclass method overrides the Parent class method, the subclass method is invoked at runtime.<br>

Since method invocation is determined by the JVM not compiler, it is known as runtime polymorphism.<br>


###Aggregation and Composition in Java

Dependency: Aggregation implies a relationship where the pen can exist independently of the student. For example, Student and Pen, delete the Student and the Pen still exist. whereas Composition implies a relationship where the Student cannot exist independent of the Gradebook. Example: Student and Gradebook, Gradebook don’t exist separate to a Student.<br>
Type of Relationship: Aggregation relation is “has-a” and composition is “part-of” relation.<br>
Type of association: Composition is a strong Association whereas Aggregation is a weak Association.<br>

###Generics in Java

There are mainly 3 advantages of generics. They are as follows:<br>

1)	Type-safety : We can hold only a single type of objects in generics. It doesn’t allow to store other objects.<br>
2)	Type casting is not required: There is no need to typecast the object.<br>
3)	Compile-Time Checking: It is checked at compile time so problem will not occur at runtime. The good programming strategy says it is far better to handle the problem at compile time than runtime.<br>