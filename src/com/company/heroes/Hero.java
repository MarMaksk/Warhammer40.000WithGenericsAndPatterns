package com.company.heroes;

import com.company.enemy.Enemy;
import com.company.weapon.Weapon;

public abstract class Hero<T extends Weapon> {

    private String name;
    private T weapon;

    public Hero(String name) {
        this.name = name;
    }

    public Hero getHero() {
        return this;
    }

    public void showHeroInfo() {
        System.out.println(this);
    }

    public String getName() {
        return this.name;
    }


    public int getDamage() {
        return weapon.getDamage();
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {

    }

    public abstract int getHealth();

    public abstract void setHealth(int health);

    public abstract boolean attackEnemy(Enemy enemy);

    public abstract boolean getAtack(Enemy enemy);


    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                '}';
    }
}
