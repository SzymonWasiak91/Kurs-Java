package JavaCourse.Interfejs;

public class PodstawoweAuto implements Auto{
    private String model = "Tipo";
    private String marka = "Fiat";

    public void toJestModelSpecyficzny(){
        System.out.println("Metoda specyficzna posiadaczy auta w wersji podstawowej - "+ model);

    }
    @Override
    public void jedź() {
        System.out.println("Jedziesz podstawowym modelem");

    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymujesz auto używając hamulce bembnowe");

    }

    @Override
    public void otorzSzybe() {
        System.out.println("Krecisz korbą aby odtworzyc szybe");
    }

    @Override
    public void zmienBieg() {
        System.out.println("zmieniasz bieg manualną skrzynią biegów");
    }
}
