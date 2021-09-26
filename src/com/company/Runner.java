package com.company;

import com.company.enemy.Enemy;
import com.company.enemy.Necromancer;
import com.company.heroes.Hero;
import com.company.heroes.Sniper;
import com.company.weapon.*;

import java.util.*;

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
        Map<Integer, Weapon> map = new HashMap<>();
        map.put(1, new PistolMk1());
        map.put(2, new ElectricSword());
        map.put(3, new Staff());

        System.out.println(map);
        map.values().stream().sorted(new SotrtByDamage()).forEach(System.out::println);
        List<Weapon> list = Arrays.asList(new Staff(), new ElectricSword(), new PistolMk1());
        System.out.println(list);
        list.sort(new SotrtByDamage());
        System.out.println(list);
    }
}
class SotrtByDamage implements Comparator<Weapon>{
    @Override
    public int compare(Weapon o1, Weapon o2) {
        return Integer.compare(o1.getDamage(), o2.getDamage());
    }
}
