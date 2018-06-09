package com.gamerole.base.controller;

import com.gamerole.base.core.ret.HttpResponse;
import com.gamerole.base.core.ret.HttpResult;
import com.gamerole.base.service.RedisService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**

 * @Description:

 */
@RestController
@RequestMapping("redis")
public class RedisController {

    @Resource
    private RedisService redisService;

    @PostMapping("/setRedis")
    public HttpResult<String> setRedis(String name) {
        redisService.set("name", name);
        return HttpResponse.makeOKRsp(name);
    }

    @PostMapping("/getRedis")
    public HttpResult<String> getRedis() {
        String name = redisService.get("name");
        return HttpResponse.makeOKRsp(name);
    }


}

