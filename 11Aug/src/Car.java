public class Car {

    private Engine engine;
    private String model;
    private String colour;

    public Car(Engine engine, String model, String colour) {
        this.engine = engine;
        this.model = model;
        this.colour = colour;
    }

    public Car() {
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
