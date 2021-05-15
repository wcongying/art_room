package com.nicole.ssm.service;

import com.nicole.ssm.entity.Artwork;
import org.springframework.stereotype.Service;

import java.util.List;



/**
 * (Artwork)表服务接口
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
@Service
public interface ArtworkService {

    /**
     * 查询所有可展示作品，根据修改时间先新后旧
     *
     *
     * @return 对象列表
     */
    List<Artwork> queryArtworksNewUpdate();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Artwork queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Artwork> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param artwork 实例对象
     * @return 实例对象
     */
    Artwork insert(Artwork artwork);

    /**
     * 修改数据
     *
     * @param artwork 实例对象
     * @return 实例对象
     */
    Artwork update(Artwork artwork);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}