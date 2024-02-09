/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2tp1;

/**
 *
 * @author SIME FIDELE
 */
public class Arena {
    // Méthode pour simuler un combat entre deux robots et renvoyer le vainqueur
    public static Robot fight(Robot robot1, Robot robot2) {
        while (!robot1.isDead() && !robot2.isDead()) {
            robot1.fire(robot2); // Premier robot attaque le deuxième
            if (!robot2.isDead()) {
                robot2.fire(robot1); // Deuxième robot attaque le premier s'il est encore en vie
            }
        }
        return robot1.isDead() ? robot2 : robot1; // Retourne le robot encore en vie
    }
}
