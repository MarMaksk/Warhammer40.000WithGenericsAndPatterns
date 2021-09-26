package com.company.heroes;

import com.company.enemy.Enemy;
import com.company.weapon.RangeWeapon;


public class Sniper<T extends RangeWeapon> extends Hero<T> {

    private int health = 120;

    public Sniper(String name) {
        super(name);
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }


    @Override
    public boolean attackEnemy(Enemy enemy) {
        System.out.println(enemy.getName() + " attacked by " + this.getName());
        return enemy.getAtack(this);
    }

    @Override
    public boolean getAtack(Enemy enemy) {
        this.health -= Math.min(health, enemy.getDamage());
        return true;
    }


}
