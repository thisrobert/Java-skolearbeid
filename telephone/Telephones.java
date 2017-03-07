import java.util.HashMap;
public class Telephones
{
    private HashMap <String, String> telephones;

    public Telephones() {
        telephones = new HashMap< String, String> ();
    }

    public void add(String name, String phone) {
        telephones.put(name, phone);
    }

    public String getPhone(String name) {
        return telephones.get(name);
    }

    public void remove(String name) {
        telephones.remove(name);
    }
}
//Sjekk API