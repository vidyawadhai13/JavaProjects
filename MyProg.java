class Square {
    double height;
    double width;
}

class MyProg {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.height = 10.0;
        s1.width = 10.0;
        System.out.println("Square s1 height: " + s1.height);
        System.out.println("Square s1 width: " + s1.width);
    }
}
