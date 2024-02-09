
package l2tp1;
public class Robot {
    public String name; // Nom du robot
    public int health; // Points de vie du robot
    // Constructeur de la classe Robot
    public Robot(String name) {
        this.name = name;
        this.health = 10; // Initialisation des points de vie à 10
        System.out.println("Robot " + name);
    }
    // Méthode pour attaquer un autre robot
    public void fire(Robot target) {
        if (!this.isDead() && !target.isDead()) {
            target.health -= 2; // Réduit les points de vie de la cible
            System.out.println("Robot " + this.name + " a été touché par le Robot " + target.name + " !");
        }
    }
    // Méthode pour vérifier si le robot est mort
    public boolean isDead() {
        return health <= 0;
    }
}
