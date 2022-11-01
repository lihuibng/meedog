package com.macro.meedog.server.controller;

import com.macro.meedog.common.api.CommonResult;
import com.macro.meedog.server.domain.Image;
import com.macro.meedog.server.domain.vo.ImageVo;
import com.macro.meedog.server.service.ImageService;
import com.macro.meedog.server.util.CompressUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author "xxxxxx"
 * @modified 2021/1/3 3:59 下午
 */

@Api(tags = "图片上传下载")
//@Controller
@RestController
@RequestMapping("/user/image")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @ApiOperation(value = "上传信息")
    //@PostMapping("upload")
    @RequestMapping(value = "/upload", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    CommonResult<Object> upload(@RequestParam MultipartFile file) throws Exception {
        Long id = imageService.store(file.getName(), file.getBytes());
        if (id <= 0L) {
            return CommonResult.failed("上传图片失败");
        }
        List<String> imageIds = new ArrayList<>();
        imageIds.add(Long.toString(id));
        ImageVo imageVo = new ImageVo(imageIds);
        return CommonResult.success(imageVo);
    }

    @ApiOperation(value = "下载信息")
    @RequestMapping(value = "/get", method = RequestMethod.GET, produces = "multipart/form-data")
    ByteArrayResource get(@RequestParam String id) {
        System.out.println("get wyg, download " + id);
        Long imageId = Long.parseLong(id);
        System.out.println("get wyg, download " + imageId);
        Image image = imageService.load(imageId);
        if (image == null) {
            return null;
        }
        byte[] imageContent = CompressUtil.decompressBytes(image.getContent());
        return new ByteArrayResource(imageContent);
    }
}
