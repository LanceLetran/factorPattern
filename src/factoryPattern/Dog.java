package factoryPattern;

public class Dog extends Pet {
    private String breed;

    public Dog() {}

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }

    @Override
    public String play() {
        return "The dog plays with a ball.";
    }
}
