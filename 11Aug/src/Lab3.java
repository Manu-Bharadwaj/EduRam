public class Lab3 {
    public static void main(String[] args) {

        Engine engineBMW = new Engine("2400CC");
        Engine engineHundai = new Engine("1000CC");
        Engine engineTesla= new Engine("NoEngine");

        Car samsBMW = new Car(engineBMW,"D7000","Black");
        Car samsSantro = new Car(engineHundai,"zip+","Yellow");
        Car samsTesla= new Car(engineTesla,"Roadster","White");

        Car [] smamsCars = {samsBMW,samsSantro,samsTesla};

        Person ram = new Person();
        ram.setName("ram");


        Person sam = new Person("sam",smamsCars,ram);
        ram.setFriend(sam);

        System.out.println(sam.toString());
//        System.out.println(sam.getCar());




    }
}
