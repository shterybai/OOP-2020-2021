package ie.tudublin;

public class Cat extends Animal {
    private int numLives;

    public Cat(String name) {
        super(name);
        numLives = 9;
    }

    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

    public void kill () {
        if (numLives > 0) {
            numLives -= 1;
            System.out.println("Ouch!");
        }

        if (numLives == 0) {
            System.out.println("Dead");
        }
    }
}