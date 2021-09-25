package com.company.enemy;

import com.company.heroes.Hero;
import com.company.weapon.MagicWeapon;

public class Necromancer<T extends MagicWeapon> extends Enemy<T> {
    private int health = 50;

    public Necromancer(String name) {
        super(name);
    }

    @Override
    public boolean getAtack(Hero hero) {
        this.health -= Math.min(health, hero.getDamage());
        hero.getAtack(this);
        return true;
    }

    @Override
    public int getHealth() {
        return health;
    }
}
