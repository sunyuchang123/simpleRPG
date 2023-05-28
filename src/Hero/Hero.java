/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hero;

/**
 *
 * @author yucha
 */
public class Hero {
    private String name;
    private String occupation;
    private int health;
    private int maxHealth;
    private int attack;
    private int score;
    
    public boolean attack(Enemy enemy) {
        enemy.setHealth(enemy.getHealth() - attack);
        return enemy.getHealth() <= 0;
    }
    
    public String getName(){
    return name;
    }
    public void setName(String name){
    this.name = name;
    }
    
    
    public String getOccpation(){
    return occupation;
    }
    public void setOccupation(String occupation){
    this.occupation = occupation;
    }
    
    
    public int getHealth(){
    return health;
    }
    public void setHealth(int health){
    this.health = health;
    }
    
    
    public int getMaxHealth(){
    return maxHealth;
    }
    public void setMaxHealth(int maxHealth){
    this.maxHealth = maxHealth;
    }
    
    
    public int getAttack(){
    return attack;
    }
    public void setAttack(int attack){
    this.attack = attack;
    }
    
    
    public int getScore(){
    return score;
    }
    public void setScore(int score){
    this.score = score;
    }
    
    
    
    
    
}
