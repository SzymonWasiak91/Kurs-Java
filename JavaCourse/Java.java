package JavaCourse;

import org.testng.annotations.Test;

public class Java {
    //Operatory Matematyczne
    @Test
    public void testOperatory(){
        int pierwszaLiczba = 5;
        int drugaLiczba = 2;
        //suma
        int suma = pierwszaLiczba + drugaLiczba;
        //różnica
        int roznica = pierwszaLiczba - drugaLiczba;
        //iloczny
        int iloczyn = pierwszaLiczba * drugaLiczba;
        //iloraz
        int iloraz = pierwszaLiczba / drugaLiczba;
        //modulo - reszta z dzielenia
        int modulo = pierwszaLiczba%drugaLiczba;
        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloczyn);
        System.out.println(modulo);
    }

}
