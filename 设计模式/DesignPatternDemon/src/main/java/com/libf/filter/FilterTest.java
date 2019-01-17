package com.libf.filter;

import com.libf.filter.entry.Regular;
import com.libf.filter.interfaces.IFilter;
import com.libf.filter.interfaces.impl.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FilterTest {

    @Test
    public void Test(){
        List<Regular> regularList = new ArrayList<>(10);

        regularList.add(new Regular(1, "libf", "2"));
        regularList.add(new Regular(2, "li2bf", "212"));
        regularList.add(new Regular(3, "lib3ff", "23"));
        regularList.add(new Regular(4, "l4ibff", "56"));
        regularList.add(new Regular(5, "l5ibf", "77"));

        IFilter idFilter = new RegularIDFilter();
        IFilter nameFIlter = new RegularNameFilter();
        IFilter conditionFilter = new RegularConditionFilter();
        List<IFilter> filterList = new ArrayList<>(2);
        filterList.add(idFilter);
        filterList.add(nameFIlter);

        IFilter andFilter = new AndFilter(filterList);

        IFilter orFilter = new OrFilter(filterList);


        List<Regular> t = andFilter.doFilter(regularList);
        for (Regular i: t) {
            System.out.println(i);
        }

        System.out.println("===================>");
        t = orFilter.doFilter(regularList);

        for (Regular i: t) {
            System.out.println(i);
        }
    }
}
