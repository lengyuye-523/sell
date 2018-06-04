package com.imooc.controller;

import com.UpYun;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 廖师兄
 * 2018-06-04 20:38
 */
@RestController
@RequestMapping("/image")
public class ImageController {

    @PostMapping("/upload")
    public void upload() {
        UpYun upyun = new UpYun("空间名称", "操作员名称", "操作员密码");
//        upyun.writeFile()
    }
}
