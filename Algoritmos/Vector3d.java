public class Vector3d {
    private double x, y, z;        // atributos

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double norma() {
        return Math.sqrt(x * x + y * y + z * z); //Math. sqrt es la raiz cuadrada de la operacion que estamos haciendo
    }
    //Devuelve los tres angulos directores en radianes, en un arreglo de 3 elementos
     public double[] direccion() {
        double m=norma();
        if (m==0){
          throw new ArithmeticException("El vector nulo no tiene dirección definida.");//Interrupe la ejecucucion si la norma es 0
        }
            return new double[]{
              Math.acos(x/m), //Math.acos se usa para sacar el angulo en radianes
              Math.acos(y/m),
              Math.acos(z/m),
            };
        }
}
