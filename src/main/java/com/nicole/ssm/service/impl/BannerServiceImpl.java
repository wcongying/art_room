package com.nicole.ssm.service.impl;

import com.nicole.ssm.entity.Artstudio;
import com.nicole.ssm.entity.Banner;
import com.nicole.ssm.dao.BannerDao;
import com.nicole.ssm.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Banner)表服务实现类
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
@Service("bannerService")
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerDao bannerDao;


    @Override
    public List<Banner> queryLimitBanners() {
        int limit = 6;
        return this.bannerDao.queryLimitBanners( limit );
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Banner queryById(Long id) {
        return this.bannerDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Banner> queryAllByLimit(int offset, int limit) {
        return this.bannerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param banner 实例对象
     * @return 实例对象
     */
    @Override
    public Banner insert(Banner banner) {
        this.bannerDao.insert(banner);
        return banner;
    }

    /**
     * 修改数据
     *
     * @param banner 实例对象
     * @return 实例对象
     */
    @Override
    public Banner update(Banner banner) {
        this.bannerDao.update(banner);
        return this.queryById(banner.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.bannerDao.deleteById(id) > 0;
    }
}