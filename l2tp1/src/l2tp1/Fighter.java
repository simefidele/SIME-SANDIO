package l2tp1;
 import java.util.Random;
public // Définition de la classe Fighter qui hérite de la classe Robot
class Fighter extends Robot {
    // Constructeur de la classe Fighter
    public Fighter(String name, long seed) {
        super(name); // Appel au constructeur de la classe parent (Robot)
        System.out.println("Fighter " + name);
    }
    // Méthode pour attaquer un autre robot avec une chance aléatoire de toucher
    @Override
    public void fire(Robot target) {
        if (!this.isDead() && !target.isDead()) {
                target.health -= 2;
                System.out.println("Fighter " + this.name + " a touché le Robot " + target.name + " !");
            } else {
                System.out.println("Fighter " + this.name + " a raté sa cible !");
            }
        }
    }

