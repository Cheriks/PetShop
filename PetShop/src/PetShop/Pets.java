package PetShop;

public class Pets {
    public String name;
    public String breed;
    public String move;
    int age;

    //Konstruktør
    public Pets(String name, String breed, int age, String move){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.move = move;

    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
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
