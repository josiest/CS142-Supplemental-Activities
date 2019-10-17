import java.util.Arrays;

public class VectorMain {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.components = new double[]{3, 4};
        //System.out.println("v1 magnitude: " + v1.magnitude());
        Vector v2 = new Vector();
        v2.components = new double[]{2, 8};
        Vector v3 = v1.add(v2);
        //System.out.println("v3: " + Arrays.toString(v3.components));
        //System.out.println("v1 dimensions: " + v1.dimensions());
        //System.out.println("||v3||: " + v3.magnitude());

        Vector v4 = new Vector();
        v4.components = new double[]{1, 2, 3, 4};
        //System.out.println("v4 dimensions: " + v4.dimensions());
        //System.out.println("magnitude of our 4D vector: " + v4.magnitude());
        Vector v5 = v4.add(v4);
        //System.out.println("v5: "+Arrays.toString(v5.components));
        //System.out.println("||v5||: " + v5.magnitude());
    }
}
