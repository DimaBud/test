package animals;

public abstract class Animal {
    private String name;
    private String kind;
    private String voice;

    public Animal(String name, String kind, String voice){
        this.name = name;
        this.kind = kind;
        this.voice = voice;
    }

    public Animal(){
        this.name = "Abrakadabra";
        this.kind = "Unknown";
        this.voice = "CHU-CHU";
    }

    public void voice(){
        System.out.println(getVoice());
    }

    public void sleep(){
        System.out.println(getKind() + " " + getName() + " sleeping now");
    }

    public void eat() {
        System.out.println(getKind() + " " + getName() + ": Ya kushau, ne meshay");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}

//public - плностью открытый метод
//private - только внутри класса
//protected - все наследникам