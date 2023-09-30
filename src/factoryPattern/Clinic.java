package factoryPattern;

import java.util.Scanner;

public class Clinic {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int selection = getUserSelection();

            if (selection == 3) {
                System.out.println("Closing application...");
                break;
            }

            PetRecord petData = generatePetFromSelection(selection);
            showcasePetDetails(petData);
        }
    }

    private static int getUserSelection() {
        System.out.println();
        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Terminate");
        System.out.print("\nPick your animal number: ");
        return scanner.nextInt();
    }

    private static PetRecord generatePetFromSelection(int selection) {
        PetRecord petData = new PetRecord();
        Pet creature;

        switch (selection) {
            case 1:
                creature = new Dog();
                petData.setPetId("001D");
                petData.setPetName("Balong");
                petData.setPet(creature);
                ((Dog) creature).setBreed("Chinese Shar-pei");
                break;
            case 2:
                creature = new Cat();
                petData.setPetId("001C");
                petData.setPetName("Bogart");
                petData.setPet(creature);
                ((Cat) creature).setNoOfLives(7);
                break;
            default:
                System.err.println("Wrong selection! Please choose a proper option [1] [2] [3]");
                break;
        }

        return petData;
    }

    private static void showcasePetDetails(PetRecord petData) {
        System.out.println("Pet identifier is " + petData.getPetId());
        System.out.println("Pet name is " + petData.getPetName());
        System.out.println("Pet species: " + petData.getPet().getClass().getSimpleName());

        Pet creature = petData.getPet();
        if (creature instanceof Dog) {
            System.out.println("Lineage: " + ((Dog) creature).getBreed());
        } else if (creature instanceof Cat) {
            System.out.println("Count of lives: " + ((Cat) creature).getNoOfLives());
        }

        System.out.println("Animal noise: " + creature.makeSound());
        System.out.println("Fun activity: " + creature.play());
    }
}
