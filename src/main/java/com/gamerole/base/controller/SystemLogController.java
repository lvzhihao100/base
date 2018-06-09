package com.gamerole.base.controller;

import com.gamerole.base.core.ret.HttpResult;
import com.gamerole.base.core.ret.HttpResponse;
import com.gamerole.base.core.utils.ApplicationUtils;
import com.gamerole.base.model.SystemLog;
import com.gamerole.base.service.SystemLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: SystemLogController类
* @author 张瑶
* @date 2018/06/09 11:25
*/
@RestController
@RequestMapping("/systemLog")
public class SystemLogController {

    @Resource
    private SystemLogService systemLogService;

    @PostMapping("/insert")
    public HttpResult<Integer> insert(SystemLog systemLog) throws Exception{
systemLog.setId(ApplicationUtils.getUUID());
    Integer state = systemLogService.insert(systemLog);
    return HttpResponse.makeOKRsp(state);
    }

    @PostMapping("/deleteById")
    public HttpResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = systemLogService.deleteById(id);
        return HttpResponse.makeOKRsp(state);
        }

        @PostMapping("/update")
        public HttpResult<Integer> update(SystemLog systemLog) throws Exception {
            Integer state = systemLogService.update(systemLog);
            return HttpResponse.makeOKRsp(state);
            }

            @PostMapping("/selectById")
            public HttpResult<SystemLog> selectById(@RequestParam String id) throws Exception {
        SystemLog systemLog = systemLogService.selectById(id);
            return HttpResponse.makeOKRsp(systemLog);
            }

            /**
            * @Description: 分页查询
            * @param page 页码
            * @param size 每页条数
            * @Reutrn RetResult<PageInfo<SystemLog>>
            */
            @PostMapping("/list")
            public HttpResult<PageInfo<SystemLog>> list(@RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "0") Integer size) throws Exception {
            PageHelper.startPage(page, size);
            List<SystemLog> list = systemLogService.selectAll();
            PageInfo<SystemLog> pageInfo = new PageInfo<SystemLog>(list);
            return HttpResponse.makeOKRsp(pageInfo);
            }
            }

