package com.company;

import com.company.enemy.Enemy;
import com.company.enemy.Necromancer;
import com.company.heroes.Hero;
import com.company.heroes.Sniper;
import com.company.weapon.MagicWeapon;
import com.company.weapon.PistolMk1;
import com.company.weapon.RangeWeapon;
import com.company.weapon.Staff;

public class Runner {
    public static void main(String[] args) {
        Hero<RangeWeapon> hero = new Sniper<>("Shults");
        hero.setWeapon(new PistolMk1());
        Enemy<MagicWeapon> necromancer = new Necromancer<>("Olaf");
        necromancer.setWeapon(new Staff());
        System.out.println(hero.getHealth());
        System.out.println(necromancer.getHealth());
        hero.attackEnemy(necromancer);
        System.out.println(hero.getHealth());
        System.out.println(necromancer.getHealth());
    }
}
