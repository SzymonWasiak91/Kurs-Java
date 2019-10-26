package JavaCourse;

import org.testng.annotations.Test;

public class OperatoryLogicznePorownawcze {
    @Test
    public void testOperatory(){
        int liczbaA = 2;
        int libczaB = 5;
        System.out.println(libczaB>liczbaA);
        System.out.println(liczbaA<libczaB);
        System.out.println(liczbaA==libczaB);
        System.out.println(liczbaA!=libczaB);
        System.out.println(liczbaA<=libczaB);
        System.out.println(liczbaA>=libczaB);

        System.out.println(1>0 && 2<5);//koniunkcja (oba prawdziwe)
        System.out.println(1>2 || -5<1);//alternatywa (przynajmniej jeden prawdziwy)


    }

}
