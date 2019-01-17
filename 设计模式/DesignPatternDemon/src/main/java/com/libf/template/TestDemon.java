package com.libf.template;

import com.libf.template.impl.BasketBall;
import com.libf.template.impl.FootBall;
import com.libf.template.interfaces.Game;

/***
 * 描述：模板模式测试类
 */
public class TestDemon {
    public static void main(String[] args) {
        Game game = new FootBall();
        game.play();

        game = new BasketBall();
        game.play();
    }
}
