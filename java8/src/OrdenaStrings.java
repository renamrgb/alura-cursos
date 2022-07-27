import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Alura Online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        Comparator<String> comparator = new ComparadorPorTamanho();
       // Collections.sort(palavras, comparator);

        palavras.sort(comparator);
        System.out.println(palavras);
//
//        for (String p: palavras){
//            System.out.println(p);
//        }

        palavras.forEach(p ->{
            System.out.println(p);
        });


    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
//        if (s1.length() < s2.length())
//            return -1;
//        if (s1.length() > s2.length())
//            return 1;
//        return 0;

        return s1.length() - s2.length();
    }
}