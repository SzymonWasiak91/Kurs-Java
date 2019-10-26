package JavaCourse;

import org.testng.annotations.Test;

public class ParametryMetod {
    public int suma(int pierwszaLiczba, int drugaLiczba){
        //suma = pierwsza liczba + druga liczba
        return pierwszaLiczba + drugaLiczba;
    }
    public void przywitajSię(String imie){
        System.out.println("Witaj" + imie);


    }
    @Test
    public void testParametrów(){
        int sumaLiczb = suma(1,2);
        System.out.println(sumaLiczb);
        System.out.println(suma(2,5));
        przywitajSię("Kasia");
        przywitajSię("Zenek");


    }
}
