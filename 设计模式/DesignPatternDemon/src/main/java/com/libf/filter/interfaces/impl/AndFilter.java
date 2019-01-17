package com.libf.filter.interfaces.impl;

import com.libf.filter.entry.Regular;
import com.libf.filter.interfaces.IFilter;

import java.util.ArrayList;
import java.util.List;

public class AndFilter implements IFilter {

    /***
     * 私有化成员属性，封装过滤链规则
     */
    private List<IFilter> iFilters;

    /****
     * 构造方式传入过滤规则列表
     * @param iFilters
     */
    public AndFilter(List<IFilter> iFilters) {
        this.iFilters = iFilters;
    }

    /**
     * 过滤
     *
     * @param regulars
     * @return
     */
    @Override
    public List<Regular> doFilter(List<Regular> regulars) {
        List<Regular> regularList = new ArrayList<>(regulars);

        for (IFilter filter: iFilters) {
            regularList = filter.doFilter(regularList);
        }

        return regularList;
    }
}
