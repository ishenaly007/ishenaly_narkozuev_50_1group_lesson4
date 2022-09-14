public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(100);
        boss.setTypeDefence("Physical");
        System.out.println(boss);
        System.out.println("Boss health:" + boss.getHealth() + " Boss damage:" + boss.getDamage()
                + " Boss defence:" + boss.getTypeDefence());

        createHeroes();


    }

    public static Hero createHeroes(){
        Hero hero1 = new Hero(250, 50, "Magic");
        Hero hero2 = new Hero(300,80);
        Hero hero3 = new Hero(350,75);
        Hero[] heroes = {hero1, hero2, hero3};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Name:" + heroes[i].getSuperPower() + " Health:" + heroes[i].getHealth()
                    + " Damage:" + heroes[i].getDamage());
        }
        return heroes[0];//1,2.
    }
}