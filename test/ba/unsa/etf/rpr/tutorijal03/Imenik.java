package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    private HashMap imenikKeyString = new HashMap();
    private HashMap imenikKeyTelefonskiBroj = new HashMap();

    public void dodaj(String ime, TelefonskiBroj broj) {
        this.imenikKeyString.put(ime, broj);
        this.imenikKeyTelefonskiBroj.put(broj, ime);
    }

    public String dajBroj(String ime) {
        TelefonskiBroj broj = (TelefonskiBroj) this.imenikKeyString.get(ime);
        return broj.ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {
        String ime = (String) this.imenikKeyTelefonskiBroj.get(broj);
        return ime;
    }

    public String naSlovo(char s) {
        Set skup = this.imenikKeyString.keySet(); //pravi skup ciji su elementi imena(key) tipa OBJECT !!!! ;
        String popis = "";
        int i = 1;
        for (Object imence : skup) { //prolazimo rangovskom kroz skup
            String ime = (String) imence; // da bi koristili metodu "charAt()" konverziju radimo;
            if (ime.charAt(0) == s) {
                popis = popis + i + ". " + imence + " - " + this.dajBroj(ime);
                i++;
            }
        }
        return popis;
    }

    public Set<String> izGrada(FiksniBroj.Grad g) {
        Set skup = this.imenikKeyTelefonskiBroj.keySet();//pravimo skup koji sadrzi objekte tipa TelefonskiBroj;
        TreeSet<String> likoviIzGrada = new TreeSet<>(); //TreeSet u koji smjestamo odgovarajuca imena i prezimena koja su sortirana po default-u
        for (Object broj : skup) { //prolazimo rangovskom for petljom kroz skup
            if (broj instanceof FiksniBroj) { //ako je odg. Object instanca klase FiksniBroj i ako je grad tog broja jednak parametru g onda dodajemo u skup odg string koji je ime i prezime ;
                if (g.equals(((FiksniBroj) broj).getGrad())) {
                    likoviIzGrada.add(this.dajIme((TelefonskiBroj) broj));
                }
            }
        }
        return likoviIzGrada;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        Set skup = this.imenikKeyTelefonskiBroj.keySet(); //pravimo skup koji sadzri Objekte tipa TelefonskiBroj
        TreeSet<TelefonskiBroj> brojeviIzGrada = new TreeSet<>(); //TreeSet u koji smjestamo odgovarajuce TelefonskeBrojeve sortirana po Stringu ispisi();
        for (Object broj : skup) { //prolazimo rangovskom for petljom kroz skup
            if (broj instanceof FiksniBroj) { //ako je odg. Object instanca klase FiksniBroj i ako je grad tog broja jednak parametru g onda dodajemo u skup odg string koji je ime i prezime ;
                if (g.equals(((FiksniBroj) broj).getGrad())) {
                    brojeviIzGrada.add((TelefonskiBroj) broj);
                }
            }
        }
        return brojeviIzGrada;
    }
}
