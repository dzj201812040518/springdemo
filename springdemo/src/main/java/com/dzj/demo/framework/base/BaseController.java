package com.dzj.demo.framework.base;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author xiaojie
 * @Description 基础控制器
 * @createTime 2021-01-30 21:42
 **/
@Controller
public class BaseController {

    protected HttpServletRequest getRequest() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return Objects.requireNonNull(servletRequestAttributes, "获取request失败").getRequest();
    }

    /**
     * [分页封装]
     *
     * @return [返回值]
     * @author xiaojie
     * @date 2021/1/31 9:16
     */
    protected <T> Page<T> startPage() {
        HttpServletRequest httpServletRequest = getRequest();
        int page = Integer.parseInt(httpServletRequest.getParameter("page"));
        int limit = Integer.parseInt(httpServletRequest.getParameter("limit"));
        return PageHelper.startPage(page, limit);
    }

    @GetMapping("/xingxing")
    public String xingxing(){
        return "xingxing/index";
    }

    /**
     * [增删改返回该数据]
     * @author xiaojie
     * @param row [影响行数]
     * @return [返回值]
     * @date 2021/1/31 21:51
     */
    protected AjaxResult toAjax(int row){
        return row>0?AjaxResult.success(row):AjaxResult.error();
    }

}
