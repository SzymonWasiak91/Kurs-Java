package JavaCourse.Interfejs;

import org.testng.annotations.Test;

public class interfejTest {
    @Test
    public void interfejsTest(){
        PodstawoweAuto auto = new PodstawoweAuto();
        auto.jedź();
        auto.zmienBieg();
        auto.toJestModelSpecyficzny();

        AutoPremium autoPremium = new AutoPremium();
        autoPremium.jedź();
        autoPremium.zmienBieg();
        autoPremium.specyficznaMetodaPremium();
    }
}
