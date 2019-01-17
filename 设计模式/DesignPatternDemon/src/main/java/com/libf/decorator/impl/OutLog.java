package com.libf.decorator.impl;

import com.alibaba.fastjson.JSONObject;
import jdk.nashorn.internal.parser.JSONParser;
import org.slf4j.Logger;

public class OutLog extends DecoratorLog {
    public OutLog(Logger logger) {
        super(logger);
    }

    /**
     * Log a message at the INFO level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void info(String msg) {

        System.out.println("装饰器：");

        JSONObject jsonObject = JSONObject.parseObject(msg);
        jsonObject.put("version","0.1");

        logger.info(jsonObject.toString());
//        System.out.println(jsonObject);
//        System.out.println(JSONObject.toJSONString(jsonObject));

    }
}
