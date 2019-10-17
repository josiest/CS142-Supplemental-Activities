import java.util.Scanner;

public class Vector {
    public static double epsilon = 0.01;
    public double[] components;

    /** Create a new vector with the given components.
     *
     * Postconditions:
     *  The components of the new vector should be the same as the components
     *  passed in.
     *
     * example:
     *
     *  Vector vec = new Vector(new double[]{1, 2, 3});
     */
    Vector(double[] components) {
        this.components = components;
    }

    /** Read a vector from the console.
     *
     * Parameters:
     *  console - the scanner which is connected to the console
     *
     * Preconditions:
     *  Assume that the user will only enter numbers, and that they'll enter
     *  a positive number for dimensions.
     *
     * Example:
     *
     *  Scanner console = new Scanner(System.in);
     *  Vector vec = readVector(console);
     *
     *  >>> Enter the number of dimensions: 3
     *  >>> Enter component 1: 3
     *  >>> Enter component 2: 4
     *  >>> Enter component 3: 5
     *  >>> New vector: [3.0, 4.0, 5.0]
     */
    public static Vector readVector(Scanner console) {
        System.out.print("Enter the # for dimensions" + ": ");
        int numb = console.nextInt();
        double[] a = new double[numb];
        for (int i = 1; i == numb; i++) {
            System.out.print("Enter component "+i+": ");
            a[i-1] = console.nextDouble();
        }
        System.out.println("New vector: "+Arrays.toString(a));
        Vector v = new Vector(a);
        return v;
    }

    /** Returns the number of dimensions in the vector.
     *
     * example:
     *
     *  Vector vec = new Vector(new double[]{1, 2, 3, 4, 5});
     *  System.out.println("vec dimensions: " + vec.dimensions());
     *
     * $ vec dimensions: 5
     */
    public int dimensions() {
        return 0;
    }

    /** Return the string representation of a vector.
     *
     * example:
     *
     *  Vector vec = new Vector(new double[]{1, 2, 3});
     *  System.out.println(vec);
     *
     * $ {1.0, 2.0, 3.0}
     */
    public string toString() {
    }

    /** Test if two vectors are equal.
     *
     * example:
     *
     *  Vector a = new Vector(new double[]{0.0001, 5.9999});
     *  Vector b = new Vector(new double[]{0, 6});
     *
     *  Vector.epsilon = 0.001;
     *  System.out.println("a and b are equal: "+a.equals(b));
     *
     *  Vector.epsilon = 0.0001;
     *  System.out.println("a and b are equal: "+a.equals(b));
     *
     * $ a and b are equal: true
     * $ a and b are equal: false
     */
    public boolean equals(Vector other) {
        return false;
    }

    /** Returns a new vector which is the sum of this vector and other.
     * The dimensions of this vector and other should be the same.
     *
     * example:
     *
     *  Vector vec = new Vector(new double[]{1, 2});
     *  Vector other = new Vector(new double[]{3, 4});
     *
     *  Vector sum = vec.add(other);
     *  System.out.println("sum: " + sum);
     *
     * $ sum: {4.0, 6.0}
     */
    public Vector add(Vector other) {
        return new Vector();
    }

    /** Returns the magnitude of this vector.
     *
     * example:
     *  Vector vec = new Vector(new double[]{3, 4});
     *
     *  double mag = vec.magnitude();
     *  System.out.println("||vec||: " + mag);
     *
     * $ ||vec||: 5.0
     */
    public double magnitude() {
        return 0.0;
    }

    /** Returns a new, scaled version of this vector.
     *
     * example:
     *  Vector a = new Vector(new double[]{3, 4});
     *
     *  Vector b = a.scaledBy(0.5);
     *  System.out.println("b: " + b);
     *
     * $ b: {1.5, 2.0}
     */
    public double scaledBy(double m) {
        return new Vector();
    }

    // Extra-Special Methods for fun

    /** Returns the dot product of this vector and other.
     *
     * example:
     *
     *  Vector a = new Vector(new double[]{1, 2, 3, 4});
     *  Vector b = new Vector(new double[]{2, 3, 4, 5});
     *
     *  System.out.println("a . b: " + a.dot(b));
     *
     * $ a . b: 40.0
     */
    public double dot(Vector other) {
    }

    /** Returns a new vector which is projected from this vector onto other.
     *
     * example:
     *
     *  Vector a = new Vector(new double[]{3, 4, 5, 6});
     *  Vector b = new Vector(new double[]{1, 0, 0, 0});
     *
     *  Vector c = a.projectedOnto(b);
     *  System.out.println("c: " + c);
     *
     * $ c: {3.0, 0.0, 0.0, 0.0}
     */
    public Vector projectedOnto(Vector other) {
        return new Vector();
    }
}
