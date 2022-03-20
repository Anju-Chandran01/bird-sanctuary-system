package com.bl.birdsanctuarysystem;

public class Main {
    static final int MAINEXIT = 5;

    void handleUserSelection(int option){
        switch (option){
            case 1:
                addBird();
                break;
            case 2:
                System.out.println("Enter Bird ID you want to remove");
                break;
            case 3:
                break;
            case 4:
                break;
            case MAINEXIT:
                System.out.println("Bye bye..!!");
                break;
            default:
                System.out.println("Choose proper option.");
        }
    }

    private void addBird() {
        // TO DO
        Penguin penguin = new Penguin("pn001");
        Penguin penguin2 = new Penguin("pn001");
        Parrot parrot = new Parrot("p002");
        Duck duck = new Duck("d003");
        Ostrich ostrich = new Ostrich("o004");
        Kiwi kiwi = new Kiwi("k005");

        BirdRepository birdRepository = new BirdRepository();

        birdRepository.add(parrot);
        birdRepository.add(penguin);
        birdRepository.add(penguin2);
        birdRepository.add(duck);
        birdRepository.add(ostrich);
        birdRepository.add(kiwi);
    }

    public static void main(String[] args) {

        System.out.println("--- Welcome to Bird Sanctuary ---");

        UserInterface userInterface = new UserInterface();
        Main main = new Main();
        int option;
        do {
            option = userInterface.showMainMenu();
            main.handleUserSelection(option);
        } while (option != 5);

//        UserInterface ui = new UserInterface();
//        System.out.println("--Before Removal--");
//        ui.print(birdRepository.getBirdList());
//
//        birdRepository.remove(parrot);
//        birdRepository.remove(penguin);
//
//        System.out.println("--After Removal--");
//        ui.print(birdRepository.getBirdList());
    }


}
