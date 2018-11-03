package ba.unsa.etf.rpr.tutorijal03;
/*
MobilniBroj ima konstruktor MobilniBroj(int mobilnaMreza, String broj) pri čemu oznaka mobilne mreže predstavlja drugu i
treću cifru pozivnog broja tj. 60-67 (detaljnije informacije možete naći na istoj stranici). Metoda ispisi vraća broj istog oblika "061/987-654".

 */
public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }
    @Override
    public String ispisi(){
        String s=new String(0 + mobilnaMreza + "/" + broj);
        return s;
    }

    @Override
    public int hashCode(){
        return 344;
    }

}
