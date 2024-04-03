
public class Box {
    // intial
    double length;
    double width;
    double height;

    //default constructor
    public Box() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }

    //parameterized constructors
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //methods
    public double calculateArea(){
        return 2*((length+width)*(length*height)*(width*height));
    }

    public double calculatePerimeter(){
        return 4*(length+width+height);
    }
    public static void main(String[] args){

        Box box1 = new Box();
        Box box2 = new Box(4.0,5.0,6.0);

    //   getting area and perimeter..
    double area1 = box1.calculateArea();
    double perimeter1 = box1.calculatePerimeter();
    System.out.printf("the area is %f \n" , area1);
    System.out.printf("the perimter is \n" ,perimeter1);
        
    }

}
