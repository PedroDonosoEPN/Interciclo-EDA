public class Main {
    public static void main(String[] args) {
        Vector2D v2d = new Vector2D(3, 4);
        System.out.println("Norma del vector 2D: " + v2d.norma());
        System.out.println("Dirección del vector 2D: " + v2d.direccion());

        Vector3d v3d = new Vector3d(1, 2, 3);
        System.out.println("Norma del vector 3D: " + v3d.norma());
        double[] direccion = v3d.direccion();
        System.out.println("Dirección del vector 3D: (" + direccion[0] + ", " + direccion[1] + ", " + direccion[2] + ")");
    }
}
