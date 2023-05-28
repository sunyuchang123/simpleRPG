/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hero;

/**
 *
 * @author yucha
 */
public class Enemy {
    public int health = 30;
    public int attack = 20;
    int heroMoveSpeed;


public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHeroMoveSpeed() {
        return heroMoveSpeed;
    }

    public void setHeroMoveSpeed(int heroMoveSpeed) {
        this.heroMoveSpeed = heroMoveSpeed;
    }
}