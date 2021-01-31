package com.dzj.demo.project.business.mfrsplctemplate.mapper;

import com.dzj.demo.project.business.mfrsplctemplate.model.MfrsPlctemplate;

import java.util.List;
import java.util.Map;

public interface MfrsPlctemplateMapper {
    int deleteByPrimaryKey(Integer plctempId);

    int insert(MfrsPlctemplate record);

    int insertSelective(MfrsPlctemplate record);

    MfrsPlctemplate selectByPrimaryKey(Integer plctempId);

    List<MfrsPlctemplate> selectBySelectiveList(MfrsPlctemplate record);

    int updateByPrimaryKeySelective(MfrsPlctemplate record);

    int updateByPrimaryKey(MfrsPlctemplate record);

    Map<String,Object> plctemplateStatics(MfrsPlctemplate mfrsPlctemplate);
}