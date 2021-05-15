package com.nicole.ssm.dao;

import com.nicole.ssm.entity.Manu;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Manu)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
public interface ManuDao {

    /**
     * 通过parentID查询单条数据
     *
     * @param parantId 主键
     * @return 实例对象
     */
    Manu queryByParentId(Long parantId);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Manu queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Manu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param manu 实例对象
     * @return 对象列表
     */
    List<Manu> queryAll(Manu manu);

    /**
     * 新增数据
     *
     * @param manu 实例对象
     * @return 影响行数
     */
    int insert(Manu manu);

    /**
     * 修改数据
     *
     * @param manu 实例对象
     * @return 影响行数
     */
    int update(Manu manu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}