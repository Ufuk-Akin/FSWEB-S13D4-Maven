package org.example;

public enum Weapon {
    SWORD(50, 50),
    AXE (120 ,30),
    ARROW (25 ,50);

    private int damage ;
    private double attackSpeed;

    Weapon(int damage , double attackSpeed) {
        this.damage = damage ;
        this.attackSpeed =attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
}
