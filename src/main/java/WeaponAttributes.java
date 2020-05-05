/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author metan
 */
public class WeaponAttributes {

    String name, type;

    int attack, cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public WeaponAttributes() {

        name = "";
        type = "";
        attack = 0;
        cost = 0;
    }

    public WeaponAttributes(String name, String type, int attack, int cost) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.cost = cost;
    }

    public void doubleWeaponAttack() {
        attack = attack * 2;
    }

}
