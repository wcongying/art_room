package com.nicole.ssm.dao;

import com.nicole.ssm.entity.Artstudio;
import com.nicole.ssm.entity.Banner;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Banner)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
public interface BannerDao {

    /**
     * 查询指定数量数据,should be show 1
     *
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Banner> queryLimitBanners(@Param("limit") int limit);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Banner queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Banner> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param banner 实例对象
     * @return 对象列表
     */
    List<Banner> queryAll(Banner banner);

    /**
     * 新增数据
     *
     * @param banner 实例对象
     * @return 影响行数
     */
    int insert(Banner banner);

    /**
     * 修改数据
     *
     * @param banner 实例对象
     * @return 影响行数
     */
    int update(Banner banner);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}