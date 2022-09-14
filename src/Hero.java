public class Hero {

        private int health;
        private int damage;
        private String superPower;

    public Hero(int theHealth, int theDamage, String theSuperPower){
        this.health = theHealth;
        this.damage = theDamage;
        this.superPower = theSuperPower;
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

    public String getSuperPower() {
        return superPower;
    }
}
