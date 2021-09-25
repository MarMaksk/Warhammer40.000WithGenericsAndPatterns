package com.company.enemy;

import com.company.heroes.Hero;
import com.company.weapon.Weapon;

public abstract class Enemy<T extends Weapon> {

    private T weapon;

    private String name;

    public Enemy(String name) {
        this.name = name;
    }

    public abstract boolean getAtack(Hero hero);

    public abstract int getHealth();

    public int getDamage() {
        return weapon.getDamage();
    }

    public String getName() {
        return name;
    }
}
