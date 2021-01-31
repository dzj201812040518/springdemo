package com.dzj.demo.project.business.mfrsplctemplate.model;

import com.dzj.demo.framework.base.BaseBean;

import java.io.Serializable;
import java.util.Date;

/**
 * mfrs_plctemplate
 * @author 
 */
public class MfrsPlctemplate extends BaseBean {
    /**
     * 自增主键
     */
    private Integer plctempId;

    /**
     * 所在站点id
     */
    private Integer siteId;

    /**
     * modbus地址
     */
    private Integer modbus;

    /**
     * 对应接收数组key值
     */
    private Integer refeKey;

    /**
     * 寄存器（小写）
     */
    private String registerLowercase;

    /**
     * plc信号编号
     */
    private String plcCode;

    /**
     * 寄存器含义
     */
    private String tempName;

    private Integer plcType;

    /**
     * 备注
     */
    private String remark;

    /**
     * 厂商id
     */
    private Integer mfrsId;

    /**
     * 状态（0正常 1停用）
     */
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    private String regex;

    private static final long serialVersionUID = 1L;

    public Integer getPlctempId() {
        return plctempId;
    }

    public void setPlctempId(Integer plctempId) {
        this.plctempId = plctempId;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getModbus() {
        return modbus;
    }

    public void setModbus(Integer modbus) {
        this.modbus = modbus;
    }

    public Integer getRefeKey() {
        return refeKey;
    }

    public void setRefeKey(Integer refeKey) {
        this.refeKey = refeKey;
    }

    public String getRegisterLowercase() {
        return registerLowercase;
    }

    public void setRegisterLowercase(String registerLowercase) {
        this.registerLowercase = registerLowercase;
    }

    public String getPlcCode() {
        return plcCode;
    }

    public void setPlcCode(String plcCode) {
        this.plcCode = plcCode;
    }

    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    public Integer getPlcType() {
        return plcType;
    }

    public void setPlcType(Integer plcType) {
        this.plcType = plcType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getMfrsId() {
        return mfrsId;
    }

    public void setMfrsId(Integer mfrsId) {
        this.mfrsId = mfrsId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
}