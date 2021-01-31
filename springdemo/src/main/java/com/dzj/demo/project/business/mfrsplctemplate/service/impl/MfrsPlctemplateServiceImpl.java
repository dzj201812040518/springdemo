package com.dzj.demo.project.business.mfrsplctemplate.service.impl;

import com.dzj.demo.project.business.mfrsplctemplate.mapper.MfrsPlctemplateMapper;
import com.dzj.demo.project.business.mfrsplctemplate.model.MfrsPlctemplate;
import com.dzj.demo.project.business.mfrsplctemplate.service.IMfrsPlctemplateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author xiaojie
 * @Description 信号模板业务实现层
 * @createTime 2021-01-30 23:11
 **/
@Service
public class MfrsPlctemplateServiceImpl implements IMfrsPlctemplateService {
    @Resource
    private MfrsPlctemplateMapper mfrsPlctemplateMapper;

    @Override
    public int insertBean(MfrsPlctemplate mfrsPlctemplate) {
        return mfrsPlctemplateMapper.insertSelective(mfrsPlctemplate);
    }

    @Override
    public int updateBean(MfrsPlctemplate mfrsPlctemplate) {
        return mfrsPlctemplateMapper.updateByPrimaryKeySelective(mfrsPlctemplate);
    }

    @Override
    public int deleteBean(Integer id) {
        return mfrsPlctemplateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public MfrsPlctemplate selectBeanById(Integer id) {
        return mfrsPlctemplateMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<MfrsPlctemplate> selectBeanList(MfrsPlctemplate mfrsPlctemplate) {
        mfrsPlctemplate.setDelFlag("0");
        return mfrsPlctemplateMapper.selectBySelectiveList(mfrsPlctemplate);
    }

    @Override
    public Map<String, Object> plctemplateStatics(MfrsPlctemplate mfrsPlctemplate) {
        return mfrsPlctemplateMapper.plctemplateStatics(mfrsPlctemplate);
    }
}
