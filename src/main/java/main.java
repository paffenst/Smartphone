import java.util.ArrayList;
import java.util.List;
public class main {
    public static void main(String[] args) {
        Contact fr = new Friend(
                "Otto",
                911911119);
        Contact fr2 = new Friend(
                "Thomas",
                1051123456);
        Contact fr3 = new Friend(
                "Hanna",
                987652133);
        List<Contact> contacts = new ArrayList<>();
        contacts.add(fr);
        Smartphone apple = new Smartphone("20 Pro Max","Apple", contacts);

        System.out.println(apple);

    }
}