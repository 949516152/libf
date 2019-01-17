package com.libf.decorator.impl;

import com.libf.decorator.interfaces.Hero;

public class SkillW extends DecoratorHero {
    public SkillW(Hero hero) {
        super(hero);
    }

    @Override
    public void run() {
        System.out.println("Hero learn W");
        hero.run();
    }

}
