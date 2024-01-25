public class Triangolo extends Rettangolo{
    @Override
    public double calcolaArea() {
        return base * altezza / 2 ;
    }

    public Triangolo(double altezza, double base) {
        super(altezza, base);

    }
}
