package com.libf.filter.interfaces.impl;

import com.libf.filter.entry.Regular;
import com.libf.filter.interfaces.IFilter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author libingfeng
 */
public class OrFilter implements IFilter {

    private List<IFilter> iFilter;

    /**
     * @param iFilter
     */
    public OrFilter(List<IFilter> iFilter) {
        this.iFilter = iFilter;
    }

    /**
     * 过滤
     *
     * @param regulars
     * @return
     */
    @Override
    public List<Regular> doFilter(List<Regular> regulars) {
//        通过set进行过滤去重
        Set<Regular> regularSet = new HashSet<>();

        for (IFilter ifilter: iFilter) {
//            将满足过滤条件的规则进行处理
            List<Regular> regulars1 = ifilter.doFilter(regulars);
            for (Regular re : regulars1) {
                regularSet.add(re);
            }
        }
        return new ArrayList<>(regularSet);
    }
}
