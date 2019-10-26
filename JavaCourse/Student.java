package JavaCourse;

public class Student {
    //Klasa
    //publica oznacza identyfikator dostępu
    //miedzę klamrami zawierają sie pola klasy/metody
    public String imie;

    public String nazwisko;

    public String grupa;

    public void przedstawSie () {
        System.out.println("Cześć nazywam się  "+imie + "  "+nazwisko);
    }
    public Student(){
        System.out.println("Cześć! Witaj w konstruktorze");
    }
}
