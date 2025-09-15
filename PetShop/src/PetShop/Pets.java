package PetShop;

public class Pets {
    public String name;
    public String breed;
    public String bite;
    public String move;
    int age;

    //Konstruktør
    public Pets(String name, String breed, int age, String bite, String move){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.bite = bite;
        this.move = move;

    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public String getBite(){
        return bite;
    }
    public int getAge(){
        return age;
    }
    public String getMove(){
        return move;
    }
    @Override
    public String toString(){
        return name + " (" + breed ") " + age;
    }
}
