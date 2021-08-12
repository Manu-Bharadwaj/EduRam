public class Engine {

    private String capacityInCC;

    public Engine(String capacityInCC) {
        this.capacityInCC = capacityInCC;
    }

    public Engine() {
    }

    public String getCapacityInCC() {
        return capacityInCC;
    }

    public void setCapacityInCC(String capacityInCC) {
        this.capacityInCC = capacityInCC;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "powerInHps='" + capacityInCC + '\'' +
                '}';
    }
}
