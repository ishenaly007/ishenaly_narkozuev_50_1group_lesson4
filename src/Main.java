

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(100);
        boss.setTypeDefence("Physical");
        System.out.println("Boss health:" + boss.getHealth() + "| Boss damage:" + boss.getDamage()
                + "| Boss defence:" + boss.getTypeDefence());

        //System.out.println(Arrays.toString(createHeroes()));
        for (int i = 0; i < createHeroes().length; i++) {
            if(createHeroes()[i].getName()==null){
                System.out.println("________________________________");
                System.out.println("Health:" + createHeroes()[i].getHealth()
                        + "| Damage:" + createHeroes()[i].getDamage());
            }else {
                System.out.println("________________________________");
                System.out.println("Name:" + createHeroes()[i].getName() + "| Health:" + createHeroes()[i].getHealth()
                        + "| Damage:" + createHeroes()[i].getDamage());
            }
        }
    }

    public static Hero[] createHeroes(){
        Hero hero1 = new Hero(250, 50, "Magic");
        Hero hero2 = new Hero(300,80);
        Hero hero3 = new Hero(350,75,"Warrior");
        Hero heroes[] = {hero1, hero2, hero3};

        return heroes;//1,2.
    }
}