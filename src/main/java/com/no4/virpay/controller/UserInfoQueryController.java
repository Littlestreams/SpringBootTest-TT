package com.no4.virpay.controller;

import com.no4.virpay.base.ResultVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lvqi
 * @Title: 用户信息查询
 * @Package
 * @Description:
 * @date 2023/1/3 15:14
 */
@RestController
@RequestMapping(value = "/ui")
public class UserInfoQueryController {
    private Logger logger = LoggerFactory.getLogger(UserInfoQueryController.class);
    @RequestMapping(value = "/queryUserInfo")
    @ResponseBody
    public ResultVo queryUserInfo(@RequestBody Map<String,Object> respMap){
        logger.info("query userInfo ....start:::respMap:"+respMap.toString());
        List<Map<String,String>> listMap= (List<Map<String, String>>) respMap.get("Books");
        List<Map<String,String>> result= new ArrayList();
        //解析数据
        for (int i = 0; i <listMap.size() ; i++) {
            Map<String, String> date =new HashMap<>(16);
            for (String key :listMap.get(i).keySet()){
                logger.info("key:"+key+",value:"+listMap.get(i).get(key));
                date.put(key,listMap.get(i).get(key));
                logger.info(result.toString());
            }
            result.add(date);
        }
        //自定义编码
        String code="custom9527";
        String message= (String) respMap.get("Wisdom");
        return ResultVo.success(code,message,result);
    }
}
