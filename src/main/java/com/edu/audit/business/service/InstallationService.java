package com.edu.audit.business.service;

import com.edu.audit.business.dto.InstallationDto;
import com.edu.audit.utils.PageResult;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName: InstallationService
 * @Description: 工程具体设施
 * @Author: Vince
 * @Date: 2020/2/29 18:17
 * @Version: v1.0
 */
public interface InstallationService {
    /**
     * 根据工程阶段查询工程列表
     *
     * @param pageNum  当前页面
     * @param pageSize 页面大小
     * @return 分页后的设施详细数据
     */
    PageResult queryInstallationList(Integer pageNum, Integer pageSize);

    /**
     * 更新材料价格
     *
     * @param price 设施价格
     * @param id    主键
     * @return 1-成功 0-失败
     */
    int updatePriceById(BigDecimal price, Integer id);
}
