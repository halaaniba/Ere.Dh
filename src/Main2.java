//Scrivere un programma che contenga una a classe chiamata Forma ed un
//// metodo chiamato calcolaArea() che stampi l'area dellforma.
//Crea poi una sottoclasse chiamata Rettangolo che fa override del
// metodo calcolaArea() per calcolap
public class Main2 {
    public static void main(String[]args){
        Rettangolo rettangolo = new Rettangolo(7,9);
        System.out.println(rettangolo.calcolaArea());
    }
}
