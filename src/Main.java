//Inheritance

class Animal{ //parent class
        int id;
        String species;
        double size;
        String climate;
        String country;

        Animal(){ //конструктор
            System.out.println("Animal is constructed");
        }

     //методи
        void setAnimalDetails(int id, String species, double size, String climate, String country){
            this.id = id;
            this.species = species;
            this.size = size;
            this.climate = climate;
            this.country = country;
        }

        void showAnimalDetails(){
            System.out.println("----------Animal ID: " + id + "----------");
            System.out.println("^ Species: " + species);
            System.out.println("^ Size of an animal (meters): " + size);
            System.out.println("^ Climate where it lives: " + climate);
            System.out.println("^ Country: " + country);
            System.out.println("-----------------------------------------");
        }
    }

    class Mammals extends Animal{
    int id;
    String sex;
    String species;
    String environment;
    String blood;
    String country;
    int max_life_expect;


    //конструктор
    Mammals(){
        System.out.println("Mammals Object is constructed");
    }

    //методи
    void setAnimalDetails(int id, String sex, String species, String environment, String blood, String country, int max_life_expect){
        this.id = id;
        this.sex = sex;
        this.species = species;
        this.environment = environment;
        this.blood = blood;
        this.country = country;
        this.max_life_expect = max_life_expect;
    }

    void showAnimalDetails(){
        System.out.println("----------Mammals ID: " + id + "----------");
        System.out.println("^ Sex: " + sex);
        System.out.println("^ Species: " + species);
        System.out.println("^ Living environment: " + environment);
        System.out.println("^ Blood: " + blood);
        System.out.println("^ Country: " + country);
        System.out.println("^ Maximum life expectancy (years): " + max_life_expect);
        System.out.println("-----------------------------------------");
    }
}

    class Reptiles extends Animal {

        int id;
        String sex;
        String species;
        String blood;
        int eggs;
        String country;
        int max_life_expect;

        Reptiles() {
            System.out.println("Reptiles Object is constructed");
        }

        void setAnimalDetails(int id, String sex, String species, String blood, int eggs, String country, int max_life_expect){
        this.id = id;
        this.sex = sex;
        this.species = species;
        this.blood = blood;
        this.eggs = eggs;
        this.country = country;
        this.max_life_expect = max_life_expect;
    }

    void showAnimalDetails(){
        System.out.println("----------Reptiles ID: " + id + "----------");
        System.out.println("^ Sex: " + sex);
        System.out.println("^ Species: " + species);
        System.out.println("^ Blood: " + blood);
        System.out.println("^ Country: " + country);
        System.out.println("^ Amount of eggs/children: " + eggs);
        System.out.println("^ Maximum life expectancy (years): " + max_life_expect);
        System.out.println("-----------------------------------------");
    }
}

    class Birds extends Animal{

    int id;
    String sex;
    String species;
    double speed;
    int eggs;
    String blood;
    String country;

    Birds(){
        System.out.println("Birds Object is constructed");
    }

    void setAnimalDetails(int id, String sex, String species, double speed, int eggs, String blood, String country){
        this.id = id;
        this.sex = sex;
        this.species = species;
        this.speed = speed;
        this.eggs = eggs;
        this.blood = blood;
        this.country = country;
    }

    void  showAnimalDetails(){
        System.out.println("----------Birds ID: " + id + "----------");
        System.out.println("^ Sex: " + sex);
        System.out.println("^ Species: " + species);
        System.out.println("^ Blood: " + blood);
        System.out.println("^ Country: " + country);
        System.out.println("^ Amount of eggs/children: " + eggs);
        System.out.println("^ Flight speed (km per hour): " + speed);
        System.out.println("-----------------------------------------");
    }

    }

    public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setAnimalDetails(1, "Mammals, Lion", 1.7, "Tropical", "South Africa");
        animal1.showAnimalDetails();

        Mammals mammal1 = new Mammals();
        mammal1.setAnimalDetails(1, "Male", "Lion", "Savanna", "Warm-blooded", "South Africa", 30);
        mammal1.showAnimalDetails();

        Reptiles reptile1 = new Reptiles();
        reptile1.setAnimalDetails(2, "Female", "Dragon Lizard", "Cold-blooded", 15, "USA", 5);
        reptile1.showAnimalDetails();

        Birds bird1 = new Birds();
        bird1.setAnimalDetails(3, "Male", "Eagle", 180, 0, "Warm-blooded", "Canada");
        bird1.showAnimalDetails();
    }
}