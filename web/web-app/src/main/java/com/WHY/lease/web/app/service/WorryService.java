package com.WHY.lease.web.app.service;

import com.WHY.lease.model.entity.MessageInfo;
import com.WHY.lease.model.entity.WorryInfo;
import com.WHY.lease.web.app.vo.message.MessageOutVo;
import com.baomidou.mybatisplus.extension.service.IService;

public interface WorryService extends IService<WorryInfo> {
    void saveOrUpdateWorry(MessageOutVo message);
}
