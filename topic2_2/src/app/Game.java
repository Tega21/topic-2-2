// Brandon Ortega// CST-239// 11.05,2023// I used code from the activity guide given to us
package app;

/**
* Main class to simulate a game using weapons.
* It demonstrates the usage of Weapon, Bomb, and Gun classes.
*/
public class Game {
	
	/**
     * Main method to run the game simulation.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Bomb weapon1 = new Bomb();
        Gun weapon2 = new Gun();
        weapon1.activate(true);
        weapon2.activate(true);
        weapon1.fireWeapon(10);
        weapon2.fireWeapon(5);
        weapon1.fireWeapon();
        weapon2.fireWeapon();
    }
}
