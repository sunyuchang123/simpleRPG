/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hero;

/**
 *
 * @author yucha
 */
public class Wizard extends Hero{
    public Wizard(String name) {
        setAttack(15);
        setHealth(80);
        setMaxHealth(80);
        setName(name);
        setOccupation("wizard");
    }
}
