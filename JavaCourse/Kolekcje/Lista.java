package JavaCourse.Kolekcje;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {
    List<String> imiona = new ArrayList<String>();
    List<Integer> numery = new LinkedList<Integer>();
    public void dodajImiona(){
        imiona.add("Tomek");
        imiona.add("Szymon");
        imiona.add("Mietek");

    }
    public void ustawNumeryLotto(){
        numery.add(Integer.valueOf(2));
        numery.add(Integer.valueOf(22));
        numery.add(Integer.valueOf(13));
        numery.add(Integer.valueOf(11));
        numery.add(Integer.valueOf(49));
        numery.add(Integer.valueOf(2));
    }
    @Test
    public void testListy(){
        dodajImiona();
        System.out.println(imiona.get(0));
        System.out.println(imiona.size());
        imiona.remove("Mietek");
        System.out.println(imiona.size());
        System.out.println(imiona.indexOf("Tomek"));
        System.out.println(imiona.contains("Tomek"));

    }
    @Test
    public void testLinkedListy(){
        ustawNumeryLotto();
        System.out.println(numery.get(0));
        System.out.println(numery.contains(2));
        System.out.println(numery);
        System.out.println(numery.size());



    }

    }


