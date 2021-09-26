package com.company.weapon;

public interface Weapon {
    default Weapon getWeapon() {
        return this;
    }

    int getDamage();

    void showWeaponSpecificaton();
}
