package com.dzj.demo.framework.table;

import com.dzj.demo.framework.base.BaseBean;
import com.dzj.demo.framework.base.BaseTableData;
import com.github.pagehelper.Page;

import java.util.List;
import java.util.Objects;

/**
 * @author xiaojie
 * @Description
 * @createTime 2021-01-30 22:41
 **/
public class LayUi extends BaseTableData {

    private List<? extends BaseBean> data;
    /**
     * 状态码0成功1失败
     */
    private int code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 返回总数
     */
    private long count;

    public List<? extends BaseBean> getData() {
        return data;
    }

    public void setData(List<? extends BaseBean> data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public <T extends BaseBean> BaseTableData covertTableData(List<T> t) {
        this.data = t;
        if (Objects.isNull(t)) {
            this.code = 500;
            this.msg = "系统异常";
            this.count = 1;
        } else if (t.isEmpty()) {
            this.msg = "未找到数据";
        } else {
            this.msg = "返回成功";
            this.count = t.size();
        }
        return this;
    }

    @Override
    public <T extends BaseBean> BaseTableData covertTableData(Page<T> page) {
        this.data = page.getResult();
        if (Objects.isNull(data)) {
            this.code = 500;
            this.msg = "系统异常";
            this.count = 1;
        } else if (data.isEmpty()) {
            this.msg = "未找到数据";
        } else {
            this.msg = "返回成功";
            this.count = page.getTotal();
        }
        return this;
    }
}
