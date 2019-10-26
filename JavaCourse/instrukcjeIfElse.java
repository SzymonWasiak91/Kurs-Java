package JavaCourse;

import org.testng.annotations.Test;

public class instrukcjeIfElse {

    //instrukcja warunkowa
    @Test
        public void testInstrukcji(){
        sprawdzWiek(14);
        sprawdzWiek(20);



    }
    public void sprawdzWiek(int wiek){
        if (wiek<18){
            System.out.println("Młodzieży alkoholu nie sprzedajym");
        }else
            System.out.println("Możesz kupić alkohol");
    }
}
