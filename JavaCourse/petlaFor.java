package JavaCourse;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class petlaFor {
    //wypisz cyfry od 0 do 10

    @Test
    public void wypiszLiczby(){
        //for + nawias + deklarujemy zmienną początkową ; podajemy warunek który musi być spełniony żeby się zakończyłą
        //krok iteracji (co ile ma przeskakiwać)
         for (int i =0; i<=10; i++){
          System.out.println(i);
        }
        List<String> studenci = Arrays.asList("Marta","Magda","Natalia","Kamila","Kaya");
        for(String student:studenci){
            System.out.println(student);

        }
        for(int index = 0;index<studenci.size();index++){
            System.out.println("Student numre "+ index + "to" +studenci.get(index));
        }

    }
}
