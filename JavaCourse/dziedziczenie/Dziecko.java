package JavaCourse.dziedziczenie;

public class Dziecko extends Rodzic {
    protected String kolorOczu = "zielony";
    public void wypiszMojKolrOczu(){
        System.out.println("Mój kolor oczu to "+kolorOczu);
    }
    public void wypiszMojKolorWlosow(){
        System.out.println("Moj kolor wlosow to  "+ kolorWłosow);

    }
    public void wypiszTypCeryiSklonnosiDoTycia(){
        System.out.println("Moj typ cery to" + typCery +"Sklonnosci do tycia"+skłonnośćDpTycia);
    }
    @Override
    public void prubujePływac(){
        System.out.println("Byc moze mam talent po rodzicu ale jeszcze nie umiem plywac");

    }
}
