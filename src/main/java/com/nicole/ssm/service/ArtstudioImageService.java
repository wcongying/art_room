package com.nicole.ssm.service;

import com.nicole.ssm.entity.ArtstudioImage;

import java.util.List;

/**
 * (ArtstudioImage)表服务接口
 *
 * @author makejava
 * @since 2021-05-15 20:30:58
 */
public interface ArtstudioImageService {
    /**
     * 查询多个，都是ArtstudioId下的图片
     *
     * @param artstudioId
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
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ArtstudioImage> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param artstudioImage 实例对象
     * @return 实例对象
     */
    ArtstudioImage insert(ArtstudioImage artstudioImage);

    /**
     * 修改数据
     *
     * @param artstudioImage 实例对象
     * @return 实例对象
     */
    ArtstudioImage update(ArtstudioImage artstudioImage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);


}