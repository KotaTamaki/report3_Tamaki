package jp.ac.uryukyu.ie.e215755;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WarriorTest {
    
    @Test
    void attachWithWeponSkillTest() {
        int defaultEnemyHP = 100;
        Warrior warrior = new Warrior("Warrior", 10, 100);
        Enemy enemy = new Enemy("スライム", defaultEnemyHP, 100);
        int weponSkillDamage = (int)(warrior.attack * 1.5);
        int enemyDamage = 0;

        for(int i=0; i<5; i++){
            warrior.attackWithWeponSkill(enemy);
            enemyDamage = defaultEnemyHP - enemy.hitPoint;
            assertEquals(weponSkillDamage, enemyDamage);
            defaultEnemyHP -= enemyDamage;
        }
    }
}