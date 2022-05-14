package com.example.xy.controller;

import cn.hutool.json.JSONObject;
import com.example.xy.pojo.Article;
import com.example.xy.service.ArticleService;
import com.example.xy.utils.Conts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;

    /**
     * 获取文章信息
     */
    @GetMapping(value = "/getAtricle")
    public Object getAtricle(){
        return articleService.getAllArticle();
    }

    /**
     * 修改
     */
    @PostMapping(value = "/modif")
    public Object modif(@RequestParam Article article){
        boolean flag = articleService.modif(article);
        JSONObject jsonObject = new JSONObject();
        if(flag){
            jsonObject.put(Conts.CODE,1);
            jsonObject.put(Conts.MSG,"修改成功");
            return jsonObject;
        }else{
            jsonObject.put(Conts.CODE,0);
            jsonObject.put(Conts.MSG,"修改失败");
            return jsonObject;
        }
    }
    /**
     * 删除
     */
    @PostMapping(value = "/delete")
    public Object delete(@RequestParam Integer id){
        boolean flag = articleService.deletebyid(id);
        JSONObject jsonObject = new JSONObject();
        if(flag){
            jsonObject.put(Conts.CODE,1);
            jsonObject.put(Conts.MSG,"删除成功");
            return jsonObject;
        }else{
            jsonObject.put(Conts.CODE,0);
            jsonObject.put(Conts.MSG,"删除失败");
            return jsonObject;
        }
    }

    /**
     *根据主键获取
     */
    @GetMapping(value = "/getById")
    public Object getAtricle(@RequestParam Integer id){
        return articleService.getbyid(id);
    }

    /**
     * 添加
     */
    @PostMapping(value = "/insert")
    public Object insert(@RequestParam Article article){
        boolean flag = articleService.insert(article);
        JSONObject jsonObject = new JSONObject();
        if(flag){
            jsonObject.put(Conts.CODE,1);
            jsonObject.put(Conts.MSG,"添加成功");
            return jsonObject;
        }else{
            jsonObject.put(Conts.CODE,0);
            jsonObject.put(Conts.MSG,"添加失败");
            return jsonObject;
        }
    }
}
