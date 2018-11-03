package ba.unsa.etf.rpr.tutorijal03;

/*
FiksniBroj sadrži konstruktor FiksniBroj(Grad grad, String broj). Parametar broj je dio telefonskog broja bez pozivnog broja npr. "123-456",
a grad je promjenljiva pobrojanog tipa koji označava pozivni broj koji treba koristiti npr.:
	enum Grad { SARAJEVO, TUZLA, ZENICA…}
Spisak pozivnih brojeva se može naći ovdje. Umjesto imena kantona koristite ime glavnog grada kantona (kao u primjeru iznad),
a umjesto Brčko distrikta stavite BRCKO. Metoda ispisi() treba vratiti broj oblika "033/123-456".

 */

public class FiksniBroj extends TelefonskiBroj {
    private String broj;

    private enum Grad{ //promjenljive pobrojanog tipa;
        TRAVNIK("030"),
        ORAŠJE("031"),
        ZENICA("032"),
        SARAJEVO("033"),
        LIVNO("034"),
        TUZLA("035"),
        MOSTAR("036"),
        BIHAC("037"),
        GORAŽDE("038"),
        ŠIROKI_BRIJEG("039"),
        BRČKO("049");

        private final String pozivni; //broj pozivni za odg grad;
         Grad(String pozivni){ //konstruktor za enum, koji nam omogucava pridruzivanje odg. brojeva pobrojanim;
            this.pozivni=pozivni;
        }
    }



    public FiksniBroj(Grad grad, String broj){

    }
}
