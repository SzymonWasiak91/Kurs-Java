package JavaCourse;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class petlaWhile {
    //petla while to taka petla ktora sie bedzie wykonywac do tego momentu az warunek w niej zawarty bedzie rowny true

    @Test
    public void testPteliWhile() {

        int index1 = 0;
        List<String> owoce = Arrays.asList("Jabłko", "Banan", "Pomarańcza", "Cytryna");
        while (index1 < owoce.size()) {
            System.out.println(owoce.get(index1));
            index1++;
        }
    }
}