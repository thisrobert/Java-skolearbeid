
public class TelephoneClient
{
    public void start() {
        Telephones contacts = new Telephones();

        contacts.add("Jimmy", "6969");
        contacts.add("JimmyD", "696969");                                      
        contacts.add("JimmyDi", "69696969");
        contacts.add("JimmyDin", "6969696969");
        contacts.add("JimmyDinh", "696969696969");

        String name = "JimmyDinh";
        System.out.println("Finner " + name + " sitt telefonnummer");
        System.out.println(name + " har telefonnummer " + contacts.getPhone(name));
    }
}
