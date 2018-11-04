package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
Klasa Imenik omogućuje da se pretražuju brojevi koristeći klasu HashMap. Ova klasa treba sadržavati sljedeće javne metode:
void dodaj(String ime, TelefonskiBroj broj)
String dajBroj(String ime) - vraća telefonski broj osobe pod imenom ime u formi stringa pozivajući metodu ispisi() klase TelefonskiBroj,
String dajIme(TelefonskiBroj broj) - vraća ime osobe čiji telefonski broj je broj - i ova operacija treba koristiti HashMapu,
String naSlovo(char s) - vraća sve brojeve u telefonskom imeniku za osobe čije ime počinje na slovo s u formatu:
1. Ime Prezime - broj
2. Ime Prezime - broj
…
Set<String> izGrada(Grad g) - vraća skup Stringova koji sadrži imena i prezimena svih osoba koje žive u gradu g (istog pobrojanog tipa koji je dat u klasi FiksniBroj),
 što se može saznati ako osoba ima fiksni broj telefona u tom gradu. Pri tome skup treba biti sortiran abecedno.
Set<TelefonskiBroj> izGradaBrojevi(Grad g) - vraća brojeve za osobe iz grada g. Ovaj skup treba biti sortiran po stringu koji se dobije metodom ispisi().

 */
public class Imenik {
    private HashMap imenikKeyString=new HashMap();
    private HashMap imenikKeyTelefonskiBroj=new HashMap();

    public void dodaj(String ime, TelefonskiBroj broj){
        this.imenikKeyString.put(ime,broj);
        this.imenikKeyTelefonskiBroj.put(broj,ime);
    }
    public String dajBroj(String ime){
        TelefonskiBroj broj=(TelefonskiBroj) this.imenikKeyString.get(ime);
        return broj.ispisi();
    }
    public String dajIme(TelefonskiBroj broj){
        String ime=(String) this.imenikKeyTelefonskiBroj.get(broj);
        return ime;
        }
     public String naSlovo(char s){
         Set skup=this.imenikKeyString.keySet(); //pravi skup ciji su elementi imena(key) tipa OBJECT !!!! ;
         String popis="";
         int i=1;
         for(Object imence : skup){ //prolazimo rangovskom kroz skup
             String ime=(String)imence; // da bi koristili metodu "charAt()" konverziju radimo;
             if (ime.charAt(0)==s){
                 popis=popis +  i + ". " + imence + " - " + this.dajBroj(ime);
             }
             i++;
         }
         return popis;
    }



}
