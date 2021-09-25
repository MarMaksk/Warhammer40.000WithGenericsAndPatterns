package com.company.enemy;

import com.company.heroes.Hero;
import com.company.weapon.MeleeWeapon;

public class Goblin<T extends MeleeWeapon> extends Enemy<T> {
    private int health = 35;

    public Goblin(String name) {
        super(name);
    }

    @Override
    public boolean getAtack(Hero hero) {
        this.health -= Math.min(health, Math.random() * hero.getDamage());
        if (hero.getWeapon() instanceof MeleeWeapon && health != 0)
            this.health -= Math.min(5, health);
        hero.getAtack(this);
        return true;
    }

    @Override
    public int getHealth() {
        return health;
    }
}
