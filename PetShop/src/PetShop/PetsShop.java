package PetShop;

public class PetsShop {
    public static void main(String[] args){
        Pets[] Pets = new Pets[3];
        Pets[0] = new Pets("Dog", "Labrador", 3);
        Pets[1] = new Pets("Cat", "Garfield", 14,);
        Pets[2] = new Pets("Lizard", "Komodo Dragon", 67,);

        System.out.println("Pets available in the shop");
        for (Pets p : Pets){
            System.out.println(p);

        }
        System.out.println();

        }

    }
