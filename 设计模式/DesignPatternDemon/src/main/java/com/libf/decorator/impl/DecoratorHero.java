package com.libf.decorator.impl;

import com.libf.decorator.interfaces.Hero;

public abstract class DecoratorHero implements Hero {
    protected Hero hero;

    public DecoratorHero(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void run() {
        hero.run();
    }
}
