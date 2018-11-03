package ba.unsa.etf.rpr.tutorijal03;
/*
MedunarodniBroj ima konstruktor MedunarodniBroj(String drzava, String broj) pri čemu string drzava sadrži kompletan pozivni broj za državu npr. "+387".
 */
public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private String broj;

    public MedunarodniBroj(String drzava,String broj){
        this.drzava=drzava;
        this.broj=broj;
    }
    @Override
    public String ispisi(){
        String s=new String(drzava + "/" + broj);
        return s;
    }
    @Override
    public int hashCode(){
        return 3444;
    }

}
