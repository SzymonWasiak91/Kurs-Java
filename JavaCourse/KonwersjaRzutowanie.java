package JavaCourse;

import org.testng.annotations.Test;

public class KonwersjaRzutowanie {
    @Test
    public void testKonwersja(){
        int a = 1;
        double b = 2.22;
        double c = a+b;
        //Konwertowanie zmiennej duble do int
        int d = a + (int)b;
        System.out.println(c);
        System.out.println(d);


    }
}
