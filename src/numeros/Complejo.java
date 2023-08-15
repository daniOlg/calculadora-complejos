package numeros;

public class Complejo {
    public double real;
    public double imaginario;

    public Complejo() {
        this.real = 0;
        this.imaginario = 0;
    }

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complejo sumar(Complejo complejo) {
        Complejo resultado = new Complejo();

        // (a, b) + (c, d) = (a + c, b + d);
        resultado.real = this.real + complejo.real;
        resultado.imaginario = this.imaginario + complejo.imaginario;

        return resultado;
    }

    public Complejo restar(Complejo complejo) {
        Complejo resultado = new Complejo();

        // (a, b) - (c, d) = (a - c, b - d);
        resultado.real = this.real - complejo.real;
        resultado.imaginario = this.imaginario - complejo.imaginario;

        return resultado;
    }

    public Complejo multiplicar(Complejo complejo) {
        Complejo resultado = new Complejo();

        // (a, b) * (c, d) = (a*c – b*d, a*d + b*c)
        resultado.real = (this.real * complejo.real) - (this.imaginario * complejo.imaginario);
        resultado.imaginario = (this.real * complejo.imaginario) + (this.imaginario * complejo.real);

        return resultado;
    }

    public Complejo dividir(Complejo complejo) {
        Complejo resultado = new Complejo();

        // (a, b) / (c, d) = ((a*c + b*d) / (c2 + d2) , (b*c – a*d) / (c2 + d2))
        double c2 = complejo.real * complejo.real;
        double d2 = complejo.imaginario * complejo.imaginario;

        resultado.real = ((this.real * complejo.real) + (this.imaginario * complejo.imaginario)) / (c2 + d2);
        resultado.imaginario = ((this.imaginario * complejo.real) - (this.real * complejo.imaginario)) / (c2 + d2);

        return resultado;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    @Override
    public String toString() {
        return "("+ real + ", " + imaginario + ")";
    }
}
