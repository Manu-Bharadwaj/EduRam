import java.util.Arrays;

public class Person {

    private String name;
    private Car [] car;
    private Person friend;

    public Person(String name, Car[] car, Person friend) {
        this.name = name;
        this.car = car;
        this.friend = friend;
    }

    public Car[] getCar() {
        return car;
    }

    public void setCar(Car[] car) {
        this.car = car;
    }

    public Person getFriend() {
        return friend;
    }

    public void setFriend(Person friend) {
        this.friend = friend;
    }

    public Person() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + Arrays.toString(car) +
                ", friend=" + friend.getName() +
                '}';
    }
}
