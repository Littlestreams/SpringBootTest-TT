package com.no4.virpay.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author lvqi
 * @Title:
 * @Package
 * @Description:
 * @date 2022/10/11 14:57
 */
@Controller
@RequestMapping(value = "/c1")
public class CommonUploadController {
    @Value("${file.path}")
    private String basePath;
    /**
     *页面
     */
    @RequestMapping(value = "tf")
    public String transFile(){
        return "updown";
    }

    /**
     * 上传
     * @return
     */
    @RequestMapping(value = "/up")
    public ModelAndView upLoad(@RequestParam("myFile") MultipartFile file){
        System.out.println(file.toString());
        //1、获得原始文件名称
        String originalFilename = file.getOriginalFilename();
        //1.1、截取原始文件名后缀 .jpg  / .png等
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));

        //2、使用UUID重新生成文件名，防止文件名称重复造成文件覆盖
        String fileName = UUID.randomUUID().toString() + suffix;
        System.out.println("fileName:"+fileName);
        //创建一个目录对象
        File dir = new File(basePath);
        //3、判断当前目录是否存在
        if(!dir.exists()){
            //目录不存在，需要创建
            dir.mkdirs();
        }

        try {
            //将临时文件转存到指定位置
            file.transferTo(new File(basePath + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ModelAndView mv = new ModelAndView("success");
        mv.addObject("message","You successfully uploaded '" + fileName + "'");
        return mv;
    }
    /**
     * 文件下载
     *
     * @param name
     * @param response
     */
    @RequestMapping("/download")
    public Map<String,String> download(@RequestParam("fileName") String name, HttpServletResponse response) {
        ServletOutputStream outputStream = null;
        FileInputStream fileInputStream = null;
        Map<String,String> retMap = new HashMap<>(16);
        try {
            System.out.println(name);
            //输入流，通过输入流读取文件
            fileInputStream = new FileInputStream(new File(basePath + name));
            //输出流，通过输出流将文件写回浏览器，在浏览器展示图片
            outputStream = response.getOutputStream();
            //设置文件类型
            response.setContentType("image/jpeg");

            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fileInputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
                outputStream.flush();
            }
            retMap.put("resultCode","1");
        } catch (FileNotFoundException e) {
            retMap.put("resultCode","2");
            throw new RuntimeException(e);
        } catch (IOException e) {
            retMap.put("resultCode","2");
            throw new RuntimeException(e);
        } finally {
            try {
                outputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                retMap.put("resultCode","2");
                throw new RuntimeException(e);
            }

        }

        return retMap;
    }
}
