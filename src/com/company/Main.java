package com.company;

import com.company.enemy.Enemy;
import com.company.enemy.Necromancer;
import com.company.heroes.Hero;
import com.company.heroes.Sniper;
import com.company.weapon.PistolMk1;
import com.company.weapon.Staff;
import com.sun.org.apache.xpath.internal.operations.String;

public class Main {

    public static void main(String[] args) {
        Hero<PistolMk1> hero = new Sniper<>("Shults");
        Enemy<Staff> necromancer = new Necromancer<>("Olaf");
        System.out.println(hero.getHealth());
        System.out.println(necromancer.getHealth());
        hero.attackEnemy(necromancer);
        System.out.println(hero.getHealth());
        System.out.println(necromancer.getHealth());

//        hero.attackEnemy();
    }
}
