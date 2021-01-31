package com.dzj.demo.project.business.mfrsplctemplate.service;

import com.dzj.demo.framework.base.BaseService;
import com.dzj.demo.project.business.mfrsplctemplate.model.MfrsPlctemplate;

import java.util.Map;

/**
 * @author xiaojie
 * @Description 信号模板业务层
 * @createTime 2021-01-30 23:10
 **/
public interface IMfrsPlctemplateService extends BaseService<MfrsPlctemplate> {

    Map<String,Object> plctemplateStatics(MfrsPlctemplate mfrsPlctemplate);
}
