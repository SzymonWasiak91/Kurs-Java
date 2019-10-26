package JavaCourse;

import org.testng.annotations.Test;

public class instrukcjaSwitch {
    @Test
    public void testSwitch(){
        wypiszDzieńTygodnia(1);
        wypiszDzieńTygodnia(2);
        wypiszDzieńTygodnia(3);
        wypiszDzieńTygodnia(4);
        wypiszDzieńTygodnia(11);

    }
    public void wypiszDzieńTygodnia(int dzienTygodnia){
        switch (dzienTygodnia){
            case 1:
                System.out.println("Jest Poniedzialek");
                break;
            case 2:
                System.out.println("Jest wtorek");
                break;
            case 3:
                System.out.println("Jest środa");
                break;
            case 4:
                System.out.println("Jest czwartek");
                break;
            default:
                System.out.println("Błądna wartość");
        }

    }
}
