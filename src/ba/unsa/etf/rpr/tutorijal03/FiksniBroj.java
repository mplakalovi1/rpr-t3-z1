package ba.unsa.etf.rpr.tutorijal03;
/*jašnjenu na predavanjima. Iz ove klase izvedene su sljedeće klase:
FiksniBroj sadrži konstruktor FiksniBroj(Grad grad, String broj). Parametar broj je dio telefonskog broja bez pozivnog broja npr. "123-456", a grad je promjenljiva pobrojanog tipa koji označava pozivni broj koji treba koristiti npr.:
	enum Grad { SARAJEVO, TUZLA, ZENICA…}
Spisak pozivnih brojeva se može naći ovdje. Umjesto imena kantona koristite ime glavnog grada kantona (kao u primjeru iznad), a umjesto Brčko distrikta stavite BRCKO. Metoda ispisi() treba vratiti broj oblika "033/123-456".
*/

public class FiksniBroj extends TelefonskiBroj {
    private enum Grad{
        SARAJEVO("033"),
        TUZLA("035"),
        ODZAK("031"),
        ZENICA("032"),
        LIVNO("034"),
        MOSTAR("036"),
        BIHAC("037"),
        GORAZDE("038"),
        LJUBUSKI("039"),
        BRCKO("049"),
        MRKONJICGRAD("050"),
        BANJALUKA("051"),
        PRIJEDOR("052"),
        DOBOJ("053"),
        SAMAC("054"),
        BIJELJINA("055"),
        ZVORNIK("056"),
        PALE("057"),
        FOCA("058"),
        TREBINJE("059");

        private String broj;

    public FiksniBroj(Grad grad,String broj){
        this.Grad=grad; //nekA ZA SADA OVAKO BUDE
        this.broj=broj;
    }

    public void ispisi(){
    System.out.println(this.);}
    }




}
