package com.nicole.ssm.dao;

import com.nicole.ssm.entity.CommentReply;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (CommentReply)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
public interface CommentReplyDao {

    /**
     * 查询artwork_id是指定某个状态
     *
     * @param artworkId
     * @return 实例对象
     */
    List<CommentReply> queryByArtworkIdStatusOrder(@Param("artworkId")long artworkId,
                                              @Param("status")int status, @Param("orderBy") String orderBy);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CommentReply queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CommentReply> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param commentReply 实例对象
     * @return 对象列表
     */
    List<CommentReply> queryAll(CommentReply commentReply);

    /**
     * 新增数据
     *
     * @param commentReply 实例对象
     * @return 影响行数
     */
    int insert(CommentReply commentReply);

    /**
     * 修改数据
     *
     * @param commentReply 实例对象
     * @return 影响行数
     */
    int update(CommentReply commentReply);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}