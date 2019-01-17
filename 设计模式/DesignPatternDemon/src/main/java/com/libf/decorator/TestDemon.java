package com.libf.decorator;

import com.alibaba.fastjson.JSONObject;
import com.libf.decorator.impl.*;
import com.libf.decorator.interfaces.Hero;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestDemon {

    public static void main(String[] args) {
        Hero heroImpl = new HeroImpl();

        DecoratorHero q = new SkillQ(heroImpl);
        DecoratorHero w = new SkillW(q);
        DecoratorHero x = new SkillX(w);
        DecoratorHero member = new SkillMember(x);
        member.run();

        System.out.println("=========================================");

        Logger log = LoggerFactory.getLogger(TestDemon.class);
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name","李冰锋");
        jsonObject.put("gender","男");

        OutLog decoratorLog = new OutLog(log);
        log.info(JSONObject.toJSONString(jsonObject));
        decoratorLog.info(JSONObject.toJSONString(jsonObject));
    }
}
