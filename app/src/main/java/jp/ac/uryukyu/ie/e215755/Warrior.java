package jp.ac.uryukyu.ie.e215755;

public class Warrior extends LivingThing{

    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    
    public void attackWithWeponSkill(LivingThing opponent){
        int damage;
        if(hitPoint < 0){
            damage = 0;
        }
        else{
        damage = (int)(attack*1.5);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        }
        opponent.wounded(damage);
    }
}
