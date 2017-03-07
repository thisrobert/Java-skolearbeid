public class TrafficLight {
    String status;
    String [] statuses = {"rødt", "rødt og gult", "grønt", "gult"};

    public TrafficLight() {
        this("rødt");
    }

    public TrafficLight (String status){
        setStatus(status);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void change() {
        switch(status) {
            case "rødt": setStatus ("rødt og gult");
            break;
            case "rødt og gult": setStatus ("grønt");
            break;
            case "grønt": setStatus ("gult");
            break;
            case "gult": setStatus ("rødt");
            break;
        }
    }
}