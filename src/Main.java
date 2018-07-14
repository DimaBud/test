import animals.*;



public class Main {

    public static void main(String[] args) {
        int a = 0;
        double b = 0.5;
        boolean c = true;
        Integer aa = 0;
        Double bb = 0.5;
        Boolean cc = false;
        String dd = "String";

        Cat cat = new Cat("Пушок");
        cat.sleep();
        cat.voice();
        cat.eat();
        cat.setName("Kolbaska");
        cat.sleep();
        cat.voice();
        cat.eat();
        System.out.println(cat.getName());
        String name = "Sharik";
        Dog dog = new Dog("Rex");
        dog.voice();
        dog.sleep();
        dog.eat();
        dog.setName("BarBOSS");
        dog.voice();
        dog.sleep();
        dog.eat();

    }

}
