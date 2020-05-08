package com.lyj;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2020/5/6 16:39
 * @Version: 1.0
 * @Modified by:
 */
public abstract class Weapon {
    private String id;
    private String discription;
    private int damagePoints;

    public abstract void useArticle(Creature targetCreature);

    public Weapon() {

    }

    public Weapon(String id, String discription, int damagePoints) {
        this.id = id;
        this.discription = discription;
        this.damagePoints = damagePoints;
    }

    public Weapon(String id, String discription) {
        this.id = id;
        this.discription = discription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
}
