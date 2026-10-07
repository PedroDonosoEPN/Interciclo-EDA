  public class Vector2D {
      private double x, y;        // atributos

      public Vector2D(double x, double y) {
          this.x = x;
          this.y = y;
      }
      public double norma() {
          return Math.sqrt(x * x + y * y); //Math.sqrt se usa para sacar la raiz cuadrada
      }
      public double direccion() {
          return Math.atan2(y, x); //Math.atan2 se usa porque  usamos 2 parametros
      }

  }

