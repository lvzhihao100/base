package com.gamerole.base.controller;

import com.gamerole.base.core.ret.HttpResponse;
import com.gamerole.base.core.ret.HttpResult;
import com.gamerole.base.model.UserInfo;
import com.gamerole.base.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("userInfo")
@Api(tags = {"用户操作接口"}, description = "用户接口")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @PostMapping("/hello")
    public String hello() {
        return "hello SpringBoot";
    }

    @ApiOperation(value = "查询用户", notes = "根据用户ID查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true,
                    dataType = "Integer", paramType = "query"),
    })
    @PostMapping("/selectById")
    public HttpResult<UserInfo> selectById(String id) {
        UserInfo userInfo = userInfoService.selectById(id);
        return HttpResponse.makeOKRsp(userInfo);
    }

    @ApiOperation(value = "查询用户", notes = "分页查询用户所有")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "当前页码",
                    dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "每页显示条数",
                    dataType = "Integer", paramType = "query")
    })
    @PostMapping("/selectAll")
    public HttpResult<PageInfo<UserInfo>> selectAll(@RequestParam(defaultValue = "0") Integer page,
                                                    @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserInfo> userInfoList = userInfoService.selectAll();
        PageInfo<UserInfo> pageInfo = new PageInfo<>(userInfoList);
        return HttpResponse.makeOKRsp(pageInfo);
    }


    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String update(@RequestParam("file") MultipartFile[] files) throws IOException {

        for (int i = 0; i < files.length; i++) {
            files[i].transferTo(new File("/home/lv/upload/" + files[i].getOriginalFilename()));
        }
        return "成功";
    }
}
