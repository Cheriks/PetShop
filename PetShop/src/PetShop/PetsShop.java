package PetShop;

public class PetsShop {
    public static void main(String[] args){
        Pets[] Pets = new Pets[3];
        Pets[0] = new Pets("Dog", "Labrador", 3,"Moved");
        Pets[1] = new Pets("Cat", "Garfield", 14,"Moved");
        Pets[2] = new Pets("Lizard", "Komodo Dragon", 67,"Moved");

        System.out.println("Pets available in the shop");
        for (Pets p : Pets){
            System.out.println(p);

        }
        System.out.println();

        }

    }
