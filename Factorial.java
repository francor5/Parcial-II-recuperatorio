package recuperatoriolabII;

public class Factorial extends Operaciones implements ParaFACTORIAL {
private double Factorial;
    public Factorial(int numeroentero) {
        super(numeroentero);
    }

    public void CalcularelFactorial() {
       double Factorial1 = 1;
        for (int i = 2; i <= getNumeroentero(); i++) {
            Factorial1 = Factorial1 * i;
        }
        this.Factorial=Factorial1;

    }


    @Override
    public double MostrarResultado() {
        return Factorial;
    }
}