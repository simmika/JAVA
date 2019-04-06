
abstract class Animal {
    abstract void eat();

    void shit() {
        // poops the same
        System.out.println("I'm shitting");
    }
}


class Cat extends Animal {

    @Override
    void eat() {
        // eat viskas
    }
}

class Dog extends Animal {


    @Override
    void eat() {
        // eat pedigree
    }
}

class Owner {

    private Animal animal;

    Owner(Animal animal) {
        this.animal = animal;
    }

    void takeOutside() {
        this.animal.shit();
    }
}

class One {
    public static void main(String[] args) {
        Owner owner = new Owner(new Cat());

        owner.takeOutside();
    }
}