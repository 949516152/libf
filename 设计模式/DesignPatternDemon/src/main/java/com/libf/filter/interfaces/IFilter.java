package com.libf.filter.interfaces;

import com.libf.filter.entry.Regular;

import java.util.ArrayList;
import java.util.List;

/**
 * @author libingfeng
 */
public interface IFilter {

    /**
     * 过滤
     * @param regulars
     * @return
     */
    List<Regular> doFilter(List<Regular> regulars);
}
