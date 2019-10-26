package JavaCourse.klasaAbstrakcyjna;

import org.testng.annotations.Test;

public class KlasaAbstrakcyjnaTest  {
    @Test
    public void testKlasyAbstrakcyjnej(){
        Pies reksio = new Pies();
        reksio.poruszajSie();
        reksio.napijSieWody();
        reksio.wypiszPrzysmak();
        System.out.println(reksio.nazwa);

        Ptak tweety = new Ptak();
        tweety.nazwa = "ptak";
        tweety.poruszajSie();
        tweety.wypiszPrzysmak();
        tweety.napijSieWody();
        System.out.println(tweety.nazwa);
    }
}
