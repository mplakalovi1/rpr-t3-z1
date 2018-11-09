package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public final String ispisi() {
        return new String(drzava + "/" + broj);
    }

    @Override
    public final int hashCode() {
        return 3444;
    }
}
