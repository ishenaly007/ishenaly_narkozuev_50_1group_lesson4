public class Hero {

    private int health;
        private int damage;
        private String name;

    public Hero(int theHealth, int theDamage, String name){
        this.health = theHealth;
        this.damage = theDamage;
        this.name = name;
    }
    public Hero(int theHealth, int theDamage) {
        this.health = theHealth;
        this.damage = theDamage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
