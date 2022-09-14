public class Boss {
    private int health;
    private int damage;
    private String typeDefence;

    public Boss(){}

    public String getTypeDefence() {
        return this.typeDefence;
    }

    public void setTypeDefence(String typeDefence) {
        this.typeDefence = typeDefence;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
