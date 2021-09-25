package com.company;

import com.company.weapon.Weapon;

public abstract class Hero<T extends Weapon> {

    private String name;
    private T weapon;

    public Hero getHero() {
        return this;
    }

    public int getDamage() {
        return weapon.getDamage();
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

}
