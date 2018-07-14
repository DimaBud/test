package animals;

public class Cat extends Animal {
    private static String CAT_VOICE = "Meow-Meow";
    private static String CAT_KIND = "Cat";
    public  Cat(){
        setKind("CAT_KIND");
        setVoice(CAT_VOICE);
        setName("Barsik");
    }
    public  Cat( String name) {
        setName(name);

        setKind(CAT_KIND);
        setVoice(CAT_VOICE);
    }
//    public Cat(String name){
//        setName(name);
//    }


    // имена классов с большой буквы: animals.Cat, AgressiveCat
    // имена переменных с маленькой name, secondName
    // имена методов с маленькой буквы getName()

}
