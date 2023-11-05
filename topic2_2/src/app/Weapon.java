// Brandon Ortega// CST-239// 11.05,2023// I used code from the activity guide given to us
package app;

/**
 * Abstract class that represents a generic weapon.
 * Provides a template for weapon behavior.
 */
public abstract class Weapon {
	
	/**
     * Fires the weapon with the specified power.
     * 
     * @param power the intensity of the weapon's fire
     */
    public void fireWeapon(int power){
        System.out.println("In Weapon.fireWeapon with a power of " + power);
    }
    
    /**
     * Activates or deactivates the weapon.
     * 
     * @param enable true to activate, false to deactivate
     */
    public abstract void activate(boolean enable);
}
