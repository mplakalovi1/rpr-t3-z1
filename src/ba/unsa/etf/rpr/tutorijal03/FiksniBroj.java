package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj implements Comparable<TelefonskiBroj> {
    private String broj;
    private Grad grad;

    public FiksniBroj(Grad grad, String broj) { //konstruktor
        this.broj = broj;
        this.grad = grad;
    }

    @Override
    public int compareTo(TelefonskiBroj broj) {
        return this.ispisi().compareTo(broj.ispisi());
    }

    @Override
    public String ispisi() {
        String s = new String(grad.pozivni + "/" + broj);
        return s;
    }

    @Override
    public int hashCode() {
        return 34;
    }

    public Grad getGrad() {
        return grad;
    }

    public enum Grad { //promjenljive pobrojanog tipa;
        TRAVNIK("030"),
        ORASJE("031"),
        ZENICA("032"),
        SARAJEVO("033"),
        LIVNO("034"),
        TUZLA("035"),
        MOSTAR("036"),
        BIHAC("037"),
        GORAZDE("038"),
        SIROKI_BRIJEG("039"),
        BRCKO("049");

        private final String pozivni; //broj pozivni za odg grad;

        Grad(String pozivni) { //konstruktor za enum, koji nam omogucava pridruzivanje odg. brojeva pobrojanim;
            this.pozivni = pozivni;
        }
    }

}
