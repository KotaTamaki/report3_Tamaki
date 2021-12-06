package jp.ac.uryukyu.ie.e215755;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WarriorTest {
    
    @Test
    void attachWithWeponSkillTest() {
        int defaultEnemyHP = 100;
        int defaultWorriorHP = 100;
        int defaultWarriorAttack = 10;
        int defaultEnemyAttack = 15;
        Warrior warrior = new Warrior("勇者", defaultWorriorHP, defaultWarriorAttack);
        Enemy enemy = new Enemy("スライム", defaultEnemyHP, defaultEnemyAttack);
        

        for(int i=0; i<3; i++){
            int Hp=enemy.getHitPoint();
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(warrior);
            assertEquals((int)(defaultWarriorAttack * 1.5), Hp - enemy.getHitPoint());
        }
    }
}