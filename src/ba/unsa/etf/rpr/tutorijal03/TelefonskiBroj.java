package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj implements Comparable<String> {
    public abstract String ispisi();

    @Override
    public int compareTo(String o) {
        return this.ispisi().compareTo(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}