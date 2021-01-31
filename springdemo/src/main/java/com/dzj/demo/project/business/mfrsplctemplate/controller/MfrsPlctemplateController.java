package com.dzj.demo.project.business.mfrsplctemplate.controller;

import com.dzj.demo.framework.base.BaseController;
import com.dzj.demo.framework.base.BaseTableData;
import com.dzj.demo.framework.table.LayUi;
import com.dzj.demo.project.business.mfrsplctemplate.model.MfrsPlctemplate;
import com.dzj.demo.project.business.mfrsplctemplate.service.IMfrsPlctemplateService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;


/**
 * @author xiaojie
 * @Description 信号模板控制层
 * @createTime 2021-01-30 21:52
 **/
@Controller
@RequestMapping("business/mfrsplctemplate")
public class MfrsPlctemplateController extends BaseController {
    private static final String PREFIX = "business/mfrsplctemplate";

    @Resource
    private IMfrsPlctemplateService iMfrsPlctemplateService;

    @GetMapping()
    public String view(ModelMap modelMap) {
        return PREFIX + "/index";
    }

    @GetMapping("list")
    @ResponseBody
    public BaseTableData list(MfrsPlctemplate mfrsPlctemplate) throws InstantiationException, IllegalAccessException {
        Page<MfrsPlctemplate> page = startPage();
        iMfrsPlctemplateService.selectBeanList(mfrsPlctemplate);
        return BaseTableData.getInstance(LayUi.class).covertTableData(page);
    }
}
