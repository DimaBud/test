package animals;

public class Dog extends Animal{

    public  Dog(){
        setKind("Dog");
        setVoice("Gav-Gav");
        setName("Rex");
    }
    public  Dog( String name){
        setName(name);

        setKind("Dog");
        setVoice("Gav-Gav");
    }
}
