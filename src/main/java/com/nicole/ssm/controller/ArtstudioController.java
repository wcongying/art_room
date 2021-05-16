package com.nicole.ssm.controller;

import com.nicole.ssm.entity.Artstudio;
import com.nicole.ssm.rest.Restful;
import com.nicole.ssm.service.ArtstudioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Artstudio)表控制层
 *
 * @author makejava
 * @since 2021-05-11 15:40:06
 */
@RestController
@RequestMapping("/artstudio")
public class ArtstudioController {
    private Logger logger = LoggerFactory.getLogger(ArtstudioController.class);

    /**
     * 服务对象
     */
    @Autowired
    private ArtstudioService artstudioService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping (value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> selectOne(@PathVariable(name = "id") long id) {
        Artstudio artstudio = this.artstudioService.queryById(id);
        if ( null != artstudio  ) {
            return  Restful.set(200, "show artstudio successfully", artstudio);
        }
        return Restful.set(404, "null artstudio showed");
    }


    /**
     * 查询所有展示的artstudio,should be show 1。后台使用，image_url不处理，后台，且列表不展示图
     *
     *
     * @return 对象列表
     */
    @RequestMapping (value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryAllShow() {
        List<Artstudio> artstudios = artstudioService.queryAllShow();
        if ( null != artstudios  ) {
            return Restful.set(200, "show artstudios successfully", artstudios);

        }
        return Restful.set(404, "null artstudios showed");
    }


}