package com.maximalus.util;

import com.maximalus.openapi.v1.model.PageView;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * PageViewService.
 *
 * @author Maksym Matlo
 */

@Component
public class PageViewService<T> {
    public PageView<T> createPageView(List<T> body){
        PageView<T> pageView = new PageView<>();
        pageView.setData(body);
        pageView.setTotal((long) body.size());
        return pageView;
    }
}
