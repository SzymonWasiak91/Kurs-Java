package JavaCourse;

import org.testng.annotations.Test;

public class Metody {
    //void oznacza że metoda nic nie zwraca, przetwarza wewnątrz
    //identyfikator dostępu + void+ nazwa metody+ między klamerkami deklarujemy ciało metody
    public void nazwaMetody(){
        int a = 2;
        int b = 3;
        System.out.println(a+b);
    }
    public int suma(){
        //metoda będzie musiała zwrócić wartość typu int
        int a = 2;
        int b = 3;
        return a+b; //return - słowo kluczowe zwracające wartość z metody
    }
    int wynikDodawania = suma();

    public Student pobierzDaneStudenta(){
        Student student = new Student();
        student.imie="Zenon";
        student.nazwisko="Martyniuk;";
        return student;

    }
    @Test
    public void testMetod(){
        nazwaMetody();
        System.out.println(suma());
        System.out.println(wynikDodawania);
        System.out.println(pobierzDaneStudenta());
    }
}
