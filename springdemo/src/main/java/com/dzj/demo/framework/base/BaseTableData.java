package com.dzj.demo.framework.base;

import com.github.pagehelper.Page;

import java.util.List;

/**
 * @author xiaojie
 * @Description 表格数据格式
 * @createTime 2021-01-30 22:36
 **/
public abstract class BaseTableData {

    /**
     * [集合转换表格数据]
     * @author xiaojie
     * @param t [集合]
     * @return [返回值]
     * @date 2021/1/30 22:37
     */
    public abstract <T extends BaseBean> BaseTableData covertTableData(List<T> t);

    /**
     * [根据分页实例转换表格数据]
     * @author xiaojie
     * @param page [分页实例]
     * @return [返回值]
     * @date 2021/1/31 10:24
     */
    public abstract <T extends BaseBean> BaseTableData covertTableData(Page<T> page);

    /**
     * [获取实例]
     * @author xiaojie
     * @param t [类]
     * @return [返回值]
     * @date 2021/1/30 22:47
     */
    public static BaseTableData getInstance(Class<? extends BaseTableData> t) throws IllegalAccessException, InstantiationException {
        return t.newInstance();
    }
}
