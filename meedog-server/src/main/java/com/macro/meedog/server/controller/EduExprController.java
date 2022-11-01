package com.macro.meedog.server.controller;

import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.model.UserEduExperience;
import com.macro.meedog.server.domain.vo.UserEduExperienceVo;
import com.macro.meedog.server.service.EduExprService;
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
@RequestMapping("/user/edu")
public class EduExprController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private EduExprService eduExprService;

    @ApiOperation(value = "获取所有学历")
    @PostMapping("list")
    public CommonResult getEduExprList(@RequestParam String uid, HttpServletRequest request) {
        Long id = Long.parseLong(uid);
        List<UserEduExperienceVo> userEduExperienceList = eduExprService.getEduExprVos(id);
        return CommonResult.success(userEduExperienceList);
    }

    @ApiOperation(value = "插入学历信息")
    @PostMapping("insert")
    public CommonResult insertEduExpr(@RequestBody UserEduExperienceVo uEduExpr,
                                      HttpServletRequest request) {
        int res = eduExprService.insertEduExpr(uEduExpr);
        return CommonResult.success(res);
    }

    @ApiOperation(value = "更新学历信息")
    @PostMapping("update")
    public CommonResult updateEduExpr(@RequestBody UserEduExperienceVo uEduExpr,
                                      HttpServletRequest request) {
        int res = eduExprService.updateEduExpr(uEduExpr);
        return CommonResult.success(res);
    }

    @ApiOperation(value = "获取学历信息")
    @PostMapping("detail")
    public CommonResult<UserEduExperienceVo> getEduExpr(@RequestParam String id, HttpServletRequest request) {
        Long degreeId = Long.parseLong(id);
        UserEduExperience uEduExpr = eduExprService.getEduExprById(degreeId);
        return CommonResult.success(UserEduExperienceVo.modelToView(uEduExpr));
    }

    @ApiOperation(value = "获取学历信息id")
    @PostMapping("get_id")
    public CommonResult<UserEduExperienceVo> getEduExprId(@RequestParam String uid, HttpServletRequest request) {
        Long id = Long.parseLong(uid);
        UserEduExperience uEduExpr  = eduExprService.getEduExprId(id);
        return CommonResult.success(UserEduExperienceVo.modelToView(uEduExpr));
    }

    @ApiOperation("清空学历信息")
    @RequestMapping(value = "/clear", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult clear(@RequestParam String uid) {
        Long id = Long.parseLong(uid);
        int res = eduExprService.clear(id);
        return CommonResult.success(res);
    }

    @ApiOperation("删除学历信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteEduExpr(@RequestParam String id) {
        Long degreeId = Long.parseLong(id);
        int count = eduExprService.deleteEduExpr(degreeId);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }


    @ApiOperation("插入图片信息")
    @RequestMapping(value = "/pic_insert", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult picInsertEduExprience(@RequestParam String id, @RequestParam List<String> picIds) {
        Long tmpid = Long.parseLong(id);
        List<Long> tmpPicIds = picIds.stream().map(s -> Long.parseLong(s)).collect(Collectors.toList());

        int count = eduExprService.picInsertEduExperience(tmpid, tmpPicIds);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

}
