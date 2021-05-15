package com.nicole.ssm.dao;

import com.nicole.ssm.entity.ArtstudioImage;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ArtstudioImage)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-15 20:30:58
 */
public interface ArtstudioImageDao {


    /**
     * 查询多个，都是ArtstudioId下的图片
     *
     * @param artstudioId artstudioId
     * @return 实例对象
     */
    List<ArtstudioImage> queryByArtstudioId(Long artstudioId);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ArtstudioImage queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ArtstudioImage> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param artstudioImage 实例对象
     * @return 对象列表
     */
    List<ArtstudioImage> queryAll(ArtstudioImage artstudioImage);

    /**
     * 新增数据
     *
     * @param artstudioImage 实例对象
     * @return 影响行数
     */
    int insert(ArtstudioImage artstudioImage);

    /**
     * 修改数据
     *
     * @param artstudioImage 实例对象
     * @return 影响行数
     */
    int update(ArtstudioImage artstudioImage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}