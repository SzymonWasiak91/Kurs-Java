package JavaCourse.dziedziczenie;

import org.testng.annotations.Test;

public class TestDziedziczenia {
    @Test
    public void testDziedziczenia(){
        Dziecko dziecko = new Dziecko();
        dziecko.wypiszMojKolorWlosow();
        dziecko.wypiszTypCeryiSklonnosiDoTycia();
        dziecko.wypiszMojKolrOczu();
        dziecko.prubujePływac();
        if (dziecko.skłonnośćDpTycia){
            System.out.println("Mam skłonności do tycia po rodzicu");
        }
    }
}
