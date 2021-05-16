package com.nicole.ssm.controller;

import com.nicole.ssm.entity.Artstudio;
import com.nicole.ssm.entity.Banner;
import com.nicole.ssm.rest.Restful;
import com.nicole.ssm.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Banner)表控制层
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
@RestController
@RequestMapping("/banner")
public class BannerController {
    /**
     * 服务对象
     */
    @Autowired
    private BannerService bannerService;

    /**
     * 查询X个banners,限制目前是6个,should be show 1
     *
     *
     * @return 对象列表
     */
    @RequestMapping (value = "/limitbanners", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryLimitArtstudios() {
        List<Banner> banners = bannerService.queryLimitBanners();
        if ( null != banners  ) {
            return Restful.set(200, "show artstudios successfully", banners);
        }
        return Restful.set(404, "null limit banners");
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/")
    public Banner selectOne(Long id) {
        return this.bannerService.queryById(id);
    }

}