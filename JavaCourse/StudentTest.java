package JavaCourse;

import org.testng.annotations.Test;

public class StudentTest {
    @Test
    public void testStudet(){
        Student naszPierwszyStudent = new Student();
        naszPierwszyStudent.nazwisko ="Reksio";
        naszPierwszyStudent.imie = "Tomasz";
        naszPierwszyStudent.grupa = "I";
        naszPierwszyStudent.przedstawSie();
        Student naszDrugiStudent = new Student();
        naszDrugiStudent.nazwisko = "Bonifacy";
        naszDrugiStudent.imie = "Mieczysław";
        naszDrugiStudent.grupa = "II";
        naszDrugiStudent.przedstawSie();


    }
}
