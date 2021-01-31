package com.dzj.demo.framework.base;

import java.util.List;

/**
 * @author xiaojie
 * @Description 业务基础接口
 * @createTime 2021-01-30 21:37
 **/
public interface BaseService<T extends BaseBean> {
    /**
     * [新增]
     * @author xiaojie
     * @param t [实例]
     * @return [返回值]
     * @date 2021/1/30 21:40
     */
    int insertBean(T t);
    /**
     * [修改]
     * @author xiaojie
     * @param t [实例]
     * @return [返回值]
     * @date 2021/1/30 21:40
     */
    int updateBean(T t);
    /**
     * [删除]
     * @author xiaojie
     * @param id [ID]
     * @return [返回值]
     * @date 2021/1/30 21:40
     */
    int deleteBean(Integer id);
    /**
     * [根据ID查询实例]
     * @author xiaojie
     * @param id [ID]
     * @return [返回值]
     * @date 2021/1/30 21:41
     */
    T selectBeanById(Integer id);
    /**
     * [高级查询列表]
     * @author xiaojie
     * @param t [实例]
     * @return [实例集合]
     * @date 2021/1/30 21:41
     */
    List<T> selectBeanList(T t);
}
