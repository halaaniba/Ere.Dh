public class Rettangolo extends Forma{
    double altezza;
    double base;
    public Rettangolo(double altezza,double base){
        this.altezza= altezza;
        this.base = base;
    }
    @Override
    public double calcolaArea(){
        return base*altezza;
    }
}
