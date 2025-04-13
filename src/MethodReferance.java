import java.util.ArrayList;
import java.util.List;

public class MethodReferance {

    public static void main(String[] args) {

        // Ödevde istenilen listeyi ArrayList ile oluşturuyoruz;
        List<String> names = new ArrayList<>();

        names.add("Ahmet");

        names.add("Ayşe");

        names.add("Mehmet");

        names.add("Zeynep");

        // Method reference ile ise bu listeyi yazdırıyoruz;

        names.forEach(System.out::println);
    }
}