package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(10.0, 10.0);



    output("------Fläche--------");
    output("Fläche Rechteck: " + rectangle.area());
    output("Fläche Kreis: " + circle.area());
    output("Fläche Dreieck: " + triangle.area());

    //  Das geht nicht mehr wegen Abstraktion
//    Shape shape = new Shape();
   output("--------Difference--------");
   output("Diff. r-t : " + areaDiff(rectangle, triangle));
   output("Diff. r-c : " + areaDiff(rectangle, circle));
   output("Diff. r-c : " + areaDiff(triangle, circle));
   output("Diff. r-c : " + areaDiff(circle, rectangle));
   output("Diff. r-c : " + areaDiff(circle, triangle));
   output("Diff. r-c : " + areaDiff(triangle, rectangle));

       
    }

//    1.Iteration : 
// private static double areaDiff(Rectangle r , Triangle t){

//       return r.area() - t.area();
// }

// private static double areaDiff(Rectangle r , Circle c){
//     return r.area() - c.area();
// }

//  Andere Methode mit Polymorphie;

private static double areaDiff(Shape s1 , Shape s2){

    return s1.area() - s2.area();
}

   
private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

