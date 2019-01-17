package com.libf.filter.interfaces.impl;

import com.libf.filter.entry.Regular;
import com.libf.filter.interfaces.IFilter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author libingfeng
 */
public class RegularIDFilter implements IFilter {
    /**
     * 过滤
     *
     * @param regulars
     * @return
     */
    @Override
    public List<Regular> doFilter(List<Regular> regulars) {
        Iterator<Regular> iterator = regulars.iterator();

        List<Regular> filterRegular = new ArrayList<>();
        while (iterator.hasNext()){
            Regular re = iterator.next();

            if (re.getId() % 2 == 0){
                filterRegular.add(re);
            }
        }

        return filterRegular;
    }
}
