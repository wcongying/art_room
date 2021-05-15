package com.nicole.ssm.dao;

import com.nicole.ssm.entity.Artstudio;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Artstudio)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-11 15:40:03
 */
public interface ArtstudioDao {

    /**
     * 查询指定数量数据,should be show 1
     *
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Artstudio> queryLimitArtstudios( @Param("limit") int limit);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Artstudio queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Artstudio> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param artstudio 实例对象
     * @return 对象列表
     */
    List<Artstudio> queryAll(Artstudio artstudio);

    /**
     * 返回status是1的元素的list
     *
     * @return list
     */
    List<Artstudio> queryAllShow();

    /**
     * 新增数据
     *
     * @param artstudio 实例对象
     * @return 影响行数
     */
    int insert(Artstudio artstudio);

    /**
     * 修改数据
     *
     * @param artstudio 实例对象
     * @return 影响行数
     */
    int update(Artstudio artstudio);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}