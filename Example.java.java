class Animal
{
void eat()
{
System.out.println("animal eats");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println("dog barks");
}
}
public class Example
{
public static void main()
{
Dog d1=new Dog();
d1.eat();
d1.bark();
}
}