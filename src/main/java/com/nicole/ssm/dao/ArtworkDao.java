package com.nicole.ssm.dao;

import com.nicole.ssm.entity.Artstudio;
import com.nicole.ssm.entity.Artwork;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Artwork)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
public interface ArtworkDao {

    /**
     * 查询所有可展示数据，根据修改时间先新后旧
     *
     * @param
     * @return 对象列表
     */
    List<Artwork> queryArtworksNewUpdate( @Param("orderBy") String orderBy );

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Artwork queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Artwork> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param artwork 实例对象
     * @return 对象列表
     */
    List<Artwork> queryAll(Artwork artwork);

    /**
     * 新增数据
     *
     * @param artwork 实例对象
     * @return 影响行数
     */
    int insert(Artwork artwork);

    /**
     * 修改数据
     *
     * @param artwork 实例对象
     * @return 影响行数
     */
    int update(Artwork artwork);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}