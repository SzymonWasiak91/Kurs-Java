package JavaCourse.Interfejs;

public class AutoPremium implements Auto{
    @Override
    public void jedź() {
        System.out.println("Jedziesz autem ze złotymi felgami");

    }

    @Override
    public void zatrzymaj() {
        System.out.println("Nasza droga hamowania jest krótsza dzieki ceramicznym tarczą");

    }

    @Override
    public void otorzSzybe() {
        System.out.println("Otwieram szybę jednym palcem za pomocą przyciksu");

    }

    @Override
    public void zmienBieg() {
        System.out.println("Zmieniam biegi automatyczną skrzynią biegów");
    }
    public void specyficznaMetodaPremium(){
        System.out.println("Jako posiadacz auta premium masz 30% zniżki na paliwo");
    }
}
