package Encapsulation;

class Mammals{

    private int max_life_expect;
    private String sex, species, environment, blood, country;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMax_life_expect() {
        return max_life_expect;
    }

    public void setMax_life_expect(int max_life_expect) {
        this.max_life_expect = max_life_expect;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

class Reptiles{
    int id;
    String sex;
    String species;
    String blood;
    String country;
    int eggs;
    int max_life_expect;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public int getMax_life_expect() {
        return max_life_expect;
    }

    public void setMax_life_expect(int max_life_expect) {
        this.max_life_expect = max_life_expect;
    }

}

public class Main {
    public static void main(String[] args) {
        Mammals mammal = new Mammals();
        mammal.setId(1);
        mammal.setSex("Male");
        mammal.setSpecies("Lion");
        mammal.setEnvironment("Savanna");
        mammal.setBlood("Warm-blooded");
        mammal.setCountry("South Africa");
        mammal.setMax_life_expect(20);

        System.out.println("The mammal's ID is " + mammal.getId() + ".\nThe mammal is " + mammal.getSex() + ".\nThe mammal's specie is a " +
        mammal.getSpecies() + ".\nThe mammal's living environment is " + mammal.getEnvironment() + ".\nThe mammal lives in " +
        mammal.getCountry() + ".\nThe mammal is " + mammal.getBlood() + ".\nMaximum life expectancy for the mammal is "
                + mammal.getMax_life_expect() + " years.");

        System.out.println("--------------------Next animal--------------------");

        Reptiles reptile = new Reptiles();
        reptile.setId(2);
        reptile.setSex("Female");
        reptile.setSpecies("Lizard");
        reptile.setBlood("Cold-blooded");
        reptile.setEggs(17);
        reptile.setCountry("Canada");
        reptile.setMax_life_expect(5);

        System.out.println("The reptile's ID is " + reptile.getId() + ".\nThe reptile is " + reptile.getSex() + ".\nThe reptile's specie is a " +
        reptile.getSpecies() + ".\nThe reptile lives in " + reptile.getCountry() + ".\nThe reptile is " + reptile.getBlood() +
                ".\nThis reptile can give a birth for " + reptile.getEggs() + " children.\nMaximum life expectancy for the reptile is "
                + reptile.getMax_life_expect() + " years.");
    }
}
