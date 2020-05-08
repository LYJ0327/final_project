package com.lyj;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2020/5/6 16:35
 * @Version: 1.0
 * @Modified by:
 */
public abstract class Creature {
    private String id;
    private String discription;
    private int HPValue;
    private Weapon Currentweapon;

    public abstract void useArticle(Weapon weapon, Creature targetCreature);

    public Creature(){
    }

    public Creature(String id, String discription, int HPValue) {
        this.id = id;
        this.discription = discription;
        this.HPValue = HPValue;
    }

    public int getHPValue() {
        return HPValue;
    }

    public void setHPValue(int HPValue) {
        this.HPValue = HPValue;
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

    public Weapon getCurrentweapon() {
        return Currentweapon;
    }

    public void setCurrentweapon(Weapon currentweapon) {
        Currentweapon = currentweapon;
    }
}
