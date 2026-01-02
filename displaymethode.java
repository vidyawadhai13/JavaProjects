class Person{
String name;
int age;
public void displayName() {
System.out.println("name="+name);
}
public void displayAge () {
System.out.println("age="+age);
}
}
class displaymethode {
public static void main(String[] args) {
Person pl=new Person();
Person p2=new Person();
pl.name="modi";
pl.age=71;
p2.name="bachchan";
p2.age=80;
pl.displayName();
p2.displayName();
pl.displayAge();
p2.displayAge();
}
}