package com.libf.decorator.impl;

import com.libf.decorator.interfaces.Hero;

public class SkillX extends DecoratorHero {

    public SkillX(Hero hero) {
        super(hero);
    }

    @Override
    public void run() {
        System.out.println("Hero learn X skill");
        hero.run();
    }
}
