import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Alura Online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");


        // Collections.sort(palavras, comparator);

//        palavras.sort((s1, s2) ->
//            Integer.compare(s1.length(), s2.length())
//        );
//
        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));

        System.out.println(palavras);
//
//        for (String p: palavras){
//            System.out.println(p);
//        }

        palavras.forEach(p ->
                System.out.println(p)
        );

    }
}