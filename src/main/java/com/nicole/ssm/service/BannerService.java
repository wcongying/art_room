package com.nicole.ssm.service;

import com.nicole.ssm.entity.Artstudio;
import com.nicole.ssm.entity.Banner;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Banner)表服务接口
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
@Service
public interface BannerService {


    /**
     * 查询X个banners,限制目前是6个,should be show 1
     *
     *
     * @return 对象列表
     */
    List<Banner> queryLimitBanners();


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Banner queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Banner> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param banner 实例对象
     * @return 实例对象
     */
    Banner insert(Banner banner);

    /**
     * 修改数据
     *
     * @param banner 实例对象
     * @return 实例对象
     */
    Banner update(Banner banner);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}