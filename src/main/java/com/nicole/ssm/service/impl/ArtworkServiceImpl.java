package com.nicole.ssm.service.impl;

import com.nicole.ssm.entity.Artwork;
import com.nicole.ssm.dao.ArtworkDao;
import com.nicole.ssm.service.ArtworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Artwork)表服务实现类
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
@Service("artworkService")
public class ArtworkServiceImpl implements ArtworkService {
    @Autowired
    private ArtworkDao artworkDao;

    /**
     * 查询所有可展示作品，根据修改时间先新后旧
     *
     *
     * @return 对象列表
     */
    @Override
    public List<Artwork> queryArtworksNewUpdate() {
        String orderBy = "DESC";
        return this.artworkDao.queryArtworksNewUpdate( orderBy );
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Artwork queryById(Long id) {
        return this.artworkDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Artwork> queryAllByLimit(int offset, int limit) {
        return this.artworkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param artwork 实例对象
     * @return 实例对象
     */
    @Override
    public Artwork insert(Artwork artwork) {
        this.artworkDao.insert(artwork);
        return artwork;
    }

    /**
     * 修改数据
     *
     * @param artwork 实例对象
     * @return 实例对象
     */
    @Override
    public Artwork update(Artwork artwork) {
        this.artworkDao.update(artwork);
        return this.queryById(artwork.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.artworkDao.deleteById(id) > 0;
    }
}