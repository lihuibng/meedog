package com.macro.meedog.server.controller;

import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.model.UserBasicInfo;
import com.macro.meedog.server.domain.vo.UserBasicInfoVo;
import com.macro.meedog.server.service.BasicInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author "xxxxxx"
 * @modified 2020/12/15 7:04 下午
 */

@Api(tags = "学习经历相关")
@RestController
@RequestMapping("/user/basic")
public class BasicInfoController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private BasicInfoService basicInfoService;

    @ApiOperation(value = "获取基本信息")
    @PostMapping("/list")
    public CommonResult getBasicInfoList(@RequestParam String uid, HttpServletRequest request) {
        Long id = Long.parseLong(uid);
        List<UserBasicInfoVo> userBasicInfoVoList = basicInfoService.getBasicInfoVos(id);
        return CommonResult.success(userBasicInfoVoList);
    }

    @ApiOperation(value = "插入基本信息")
    @PostMapping("/insert")
    public CommonResult insertBasicInfo(@RequestBody UserBasicInfoVo uBasicInfo,
                                        HttpServletRequest request) {
        int res = basicInfoService.insertBasicInfo(UserBasicInfoVo.viewToModel(uBasicInfo));
        return CommonResult.success(res);
    }

    @ApiOperation(value = "更新基本信息")
    @PostMapping("/update")
    public CommonResult updateBasicInfo(@RequestBody UserBasicInfoVo uBasicInfo,
                                        HttpServletRequest request) {
        int res = basicInfoService.updateBasicInfo(UserBasicInfoVo.viewToModel(uBasicInfo));
        return CommonResult.success(res);
    }

    @ApiOperation(value = "获取基本信息")
    @PostMapping("/detail")
    public CommonResult getBasicInfo(@RequestParam String id, HttpServletRequest request) {
        Long tmpId = Long.parseLong(id);
        UserBasicInfoVo uBasicInfoVo = basicInfoService.getBasicInfoVoById(tmpId);
        return CommonResult.success(uBasicInfoVo);
    }

    @ApiOperation("清空基本信息")
    @RequestMapping(value = "/clear", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult clear(@RequestParam String uid) {
        Long id = Long.parseLong(uid);
        int res = basicInfoService.clear(id);
        return CommonResult.success(res);
    }

    @ApiOperation("删除基本信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteBasicInfo(@RequestParam String pid) {
        Long id = Long.parseLong(pid);
        int count = basicInfoService.deleteBasicInfo(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("插入图片信息")
    @RequestMapping(value = "/pic_insert", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult picInsertBasicInfo(@RequestParam String id, @RequestParam List<String> picIds) {
        Long tmpid = Long.parseLong(id);
        List<Long> tmpPicIds = picIds.stream().map(s -> Long.parseLong(s)).collect(Collectors.toList());

        int count = basicInfoService.picInsertBasicInfo(tmpid, tmpPicIds);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }
}
