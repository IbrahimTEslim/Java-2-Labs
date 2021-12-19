package Java2Labs.Lab_03As3;

public class Lab_03Ch12Q5 {

    class Triangle {
        private double side1,side2,side3;
        public Triangle(double side1,double side2,double side3) throws IllegalTriangleException {
           try {
                if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
                    throw new IllegalTriangleException("Illegal Inputs");
                else {
                    this.side1 = side1;
                    this.side2 = side2;
                    this.side3 = side3;
                }
            }catch (IllegalTriangleException err) { throw new IllegalTriangleException("Invalid inputs",err); }
        }
        public Triangle() throws IllegalTriangleException {
            new Triangle(1f,1f,1f);
        }
        public double getArea(){
            double s = (side1 + side2 + side3)/2;
            return Math.sqrt(2*s*(s - side1)*(s - side2)*(s - side3));
        }
        public double getPerimeter() {
            return side1+ side2+side3;
        }
        public String toString(){
            return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                    " side3 = " + side3;
        }
    }

    class IllegalTriangleException extends Exception{
        public IllegalTriangleException(String msg) {super(msg);}
        public IllegalTriangleException(String msg,Throwable err){
            super(msg,err);
        }
    }
}
