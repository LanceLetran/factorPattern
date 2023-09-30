package factoryPattern;

public class Cat extends Pet {
    private int noOfLives;

    public Cat() {}

    public int getNoOfLives() {
        return noOfLives;
    }

    public void setNoOfLives(int noOfLives) {
        this.noOfLives = noOfLives;
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }

    @Override
    public String play() {
        return "The cat chases a laser pointer.";
    }
}
