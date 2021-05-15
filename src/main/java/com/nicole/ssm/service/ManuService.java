package com.nicole.ssm.service;

import com.nicole.ssm.entity.Manu;
import com.nicole.ssm.vo.ManuVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Manu)表服务接口
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
@Service
public interface ManuService {

    /**
     * 通过ID查找此级别下所有manu
     *
     * @param id 主键
     * @return list
     */
    List<Manu> queryAllChildrenManus( Long id );

    /**
     * 通过ID查找此级别下所有manu,并用ManuVo更容易分层展示
     *
     * @param id 主键
     * @return ManuVo
     */
    ManuVo queryAllChildrenManuVos( Long id );

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Manu queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Manu> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param manu 实例对象
     * @return 实例对象
     */
    Manu insert(Manu manu);

    /**
     * 修改数据
     *
     * @param manu 实例对象
     * @return 实例对象
     */
    Manu update(Manu manu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}