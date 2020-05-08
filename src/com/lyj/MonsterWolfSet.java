package com.lyj;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2020/5/6 17:06
 * @Version: 1.0
 * @Modified by:
 */
public class MonsterWolfSet {
    private ArrayList<MonsterWolf> monsterWolves = new ArrayList<>();

    public MonsterWolfSet(){
    }

    public MonsterWolfSet(ArrayList<MonsterWolf> monsterWolves) {
        this.monsterWolves = monsterWolves;
    }

    public ArrayList<MonsterWolf> getMonsterWolves() {
        return monsterWolves;
    }

    public void setMonsterWolves(ArrayList<MonsterWolf> monsterWolves) {
        this.monsterWolves = monsterWolves;
    }
}
