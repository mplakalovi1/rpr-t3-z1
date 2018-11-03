package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    private String broj;
    private Grad grad;
    public FiksniBroj(Grad grad, String broj){ //konstruktor
        this.broj=broj;
        this.grad=grad;
    }

    @Override
    public String ispisi(){
        String s=new String(grad.pozivni + "/" + broj);
        return s;
    }
    @Override
    public int hashCode(){
        return 34;
    }
    public enum Grad{ //promjenljive pobrojanog tipa;
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

}
