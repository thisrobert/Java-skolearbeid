
public class TrafficLightClient{
    public void method() {
        TrafficLight trafikk = new TrafficLight();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Trafikklyset lyser: " + trafikk.getStatus());
            System.out.println("Trafikklyset skifter til... ");
            trafikk.change();
        }
    }
}
