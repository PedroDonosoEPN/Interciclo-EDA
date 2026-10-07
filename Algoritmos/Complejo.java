public class Complejo {
    private double real, imag;      // a + bi
    public Complejo(double r, double i) {
       this.real = r;
       this.imag = i;
     }
    public void imprimir() {
      if(imag < 0) System.out.println(real + " - " + (-imag) + "i");
        System.out.println(real + " + " + imag + "i");


     }


    public Complejo sumar(Complejo c) {
      double sumaReal = this.real + c.real;
      double sumaImag = this.imag + c.imag;
      return new Complejo(sumaReal, sumaImag);

    }

    public Complejo restar(Complejo c) {
      double restaReal = this.real - c.real;
      double restaImag = this.imag - c.imag;
      return new Complejo(restaReal, restaImag);
    }



    public Complejo multiplicar(Complejo c) {
      double multReal = this.real * c.real - this.imag * c.imag;
      double multImag = this.real * c.imag + this.imag * c.real;
      return new Complejo(multReal, multImag);


     }
     //OPCIONAL
     public Complejo dividir(Complejo c){
      double denominador = c.real * c.real + c.imag * c.imag;
      //Parte real del resultado
      if (denominador == 0) {
          throw new ArithmeticException("División por cero: el denominador es cero.");
      }
      double divReal = (this.real * c.real + this.imag * c.imag) / denominador;
      double divImag = (this.imag * c.real - this.real * c.imag) / denominador;
      return new Complejo(divReal, divImag);
     }
     public static void main(String[] args) {
        Complejo c1 = new Complejo(3, 4);
        Complejo c2 = new Complejo(1, -2);


        Complejo suma = c1.sumar(c2);
        System.out.print("Suma: ");
        suma.imprimir();

        Complejo resta = c1.restar(c2);
        System.out.print("Resta: ");
        resta.imprimir();

        Complejo multiplicacion = c1.multiplicar(c2);
        System.out.print("Multiplicación: ");
        multiplicacion.imprimir();

        //OPCIONAL
        Complejo division = c1.dividir(c2);
        System.out.print("División: ");
        division.imprimir();
     }
}
