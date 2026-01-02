class box1{
double width;
double height;
double depth;
void volume () {
System.out.print("volume is ");
System.out.println(width * height * depth);
}
}
class boxdemo1 {
public static void main(String args[])
{
box1 mybox1= new box1();
mybox1.width=10;
mybox1.height=20;
mybox1.depth=15;
mybox1.volume();
}
}