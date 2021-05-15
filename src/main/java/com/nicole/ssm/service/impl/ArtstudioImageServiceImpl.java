package com.nicole.ssm.service.impl;

import com.nicole.ssm.entity.ArtstudioImage;
import com.nicole.ssm.dao.ArtstudioImageDao;
import com.nicole.ssm.service.ArtstudioImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ArtstudioImage)表服务实现类
 *
 * @author makejava
 * @since 2021-05-15 20:30:58
 */
@Service("artstudioImageService")
public class ArtstudioImageServiceImpl implements ArtstudioImageService {
    @Resource
    private ArtstudioImageDao artstudioImageDao;

    /**
     * 查询多个，都是ArtstudioId下的图片
     *
     * @param artstudioId
     * @return 实例对象
     */
    @Override
    public List<ArtstudioImage> queryByArtstudioId(Long artstudioId) {
        return this.artstudioImageDao.queryByArtstudioId( artstudioId );
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ArtstudioImage queryById(Long id) {
        return this.artstudioImageDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ArtstudioImage> queryAllByLimit(int offset, int limit) {
        return this.artstudioImageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param artstudioImage 实例对象
     * @return 实例对象
     */
    @Override
    public ArtstudioImage insert(ArtstudioImage artstudioImage) {
        this.artstudioImageDao.insert(artstudioImage);
        return artstudioImage;
    }

    /**
     * 修改数据
     *
     * @param artstudioImage 实例对象
     * @return 实例对象
     */
    @Override
    public ArtstudioImage update(ArtstudioImage artstudioImage) {
        this.artstudioImageDao.update(artstudioImage);
        return this.queryById(artstudioImage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.artstudioImageDao.deleteById(id) > 0;
    }


}