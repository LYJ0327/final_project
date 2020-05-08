package com.lyj;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2020/5/6 17:04
 * @Version: 1.0
 * @Modified by:
 */
public class sense {
    Person person=new Person();
    MonsterWolf wolf1 = new MonsterWolf();
    MonsterWolf wolf2 = new MonsterWolf();
    MonsterWolf wolf3 = new MonsterWolf();
    MonsterWolfSet monsterWolfSet = new MonsterWolfSet();

    public void initSense(){
        initPerson();
        initMonster();
    }

    public void initPerson(){
        person.setId("19970327");
        person.setDiscription("LISA");
        person.setHPValue(327);
        person.setCurrentweapon(new WeaponSword("w1","sword1",-50));
    }
    public void initMonster(){
        wolf1.setId("wolf1");
        wolf1.setDiscription("狼1");
        wolf1.setHPValue(200);
        wolf1.setCurrentweapon(new WeaponKnife("n1","knife1",-30));

        wolf2.setId("wolf2");
        wolf2.setDiscription("狼2");
        wolf2.setHPValue(200);
        wolf2.setCurrentweapon(new WeaponKnife("n2","knife2",-30));

        wolf3.setId("wolf3");
        wolf3.setDiscription("狼3");
        wolf3.setHPValue(200);
        wolf3.setCurrentweapon(new WeaponKnife("n3","knife3",-30));

        monsterWolfSet.getMonsterWolves().add(wolf1);
        monsterWolfSet.getMonsterWolves().add(wolf2);
        monsterWolfSet.getMonsterWolves().add(wolf3);
    }

    public void play(){

    }
}
