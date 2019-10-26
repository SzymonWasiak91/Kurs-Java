package JavaCourse;

import org.testng.annotations.Test;

public class MetodOverLoadinPrzeciazanieMetod {
    @Test
    public void metodOverLoadigTest(){
        Select autoSelect = new Select();
        autoSelect.slectBy(1);
        autoSelect.slectBy("Volvo");
    }
}
