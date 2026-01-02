import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        float area;
        Rectangle1 r1 = new Rectangle1(); 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter height:");
        r1.height = sc.nextFloat();
        
        System.out.print("enter width:");
        r1.width = sc.nextFloat();
        
        area = r1.calArea();
        System.out.println("Area=" + area);
        sc.close(); 
    }
}

class Rectangle1 {
    float height;
    float width;
    
    public float calArea() {
        return height * width;
    }
}
