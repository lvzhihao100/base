package com.gamerole.base.service.impl;

import com.gamerole.base.dao.SystemLogMapper;
import com.gamerole.base.model.SystemLog;
import com.gamerole.base.service.SystemLogService;
import com.gamerole.base.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: SystemLogService接口实现类
* @author 张瑶
* @date 2018/06/09 11:25
*/
@Service
public class SystemLogServiceImpl extends AbstractService<SystemLog> implements SystemLogService {

    @Resource
    private SystemLogMapper systemLogMapper;

}

