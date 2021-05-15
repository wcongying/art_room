package com.nicole.ssm.service;

import com.nicole.ssm.entity.Artstudio;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Artstudio)表服务接口
 *
 * @author makejava
 * @since 2021-05-11 15:40:04
 */
@Service
public interface ArtstudioService {

    /**
     * 查询X个artstudio,限制目前是5个,should be show 1
     *
     *
     * @return 对象列表
     */
    List<Artstudio> queryLimitArtstudios() ;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Artstudio queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Artstudio> queryAllByLimit(int offset, int limit);

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
     * @return 实例对象
     */
    Artstudio insert(Artstudio artstudio);

    /**
     * 修改数据
     *
     * @param artstudio 实例对象
     * @return 实例对象
     */
    Artstudio update(Artstudio artstudio);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}