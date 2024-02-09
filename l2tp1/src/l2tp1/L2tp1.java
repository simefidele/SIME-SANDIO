
package l2tp1;
import java.util.Random;
//class Arena {
//    
//    
//}
public class L2tp1 {
    public static void main(String[] args) {
        Robot D2R2 = new Robot("D2R2"); // Création d'un robot de base
//        System.out.println(Robot D2R2);
        Fighter Data = new Fighter("Data", 123456); // Création d'un combattant avec une graine spécifique
        Robot winner = Arena.fight(D2R2, Data); // Combat entre les deux robots
        System.out.println("Le vainqueur est : "+ winner.name);
    }
}
