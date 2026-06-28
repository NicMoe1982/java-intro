public class M3HW1_molina {

    public static void main(String[] args) {

        // Declare and assign a radius
        double radius = 5.0; 
        // you can change this value to test with different radii

        // Perform calculations
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        
        // Display results
        System.out.println("Circle with radius: " + radius);        
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

    }
}
/* Explanation:
1. radius – the distance from the center to the edge of the circle.
2. Diameter formula → 2 × radius
3. Circumference formula → 2 × π × radius
4. Area formula → π × radius × radius
5. Math.PI gives the value of π (3.14159...).
*/
