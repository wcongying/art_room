package com.nicole.ssm.service;

import com.nicole.ssm.entity.CommentReply;
import com.nicole.ssm.vo.CommentReplyVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (CommentReply)表服务接口
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
@Service
public interface CommentReplyService {

    /**
     * 通过id查询能被显示评论，加上留言
     *
     * @param artworkId
     * @return 实例对象
     */
    List<CommentReply> queryShowByArtworkId(long artworkId);

    /**
     * 通过id查询能被显示评论，组装留言。排序
     *
     * @param artworkId
     * @return 回复，层级显示留言
     */
    List<CommentReplyVo> queryArtworkIdCommentAndReply(long artworkId );

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CommentReply queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CommentReply> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param commentReply 实例对象
     * @return 实例对象
     */
    CommentReply insert(CommentReply commentReply);

    /**
     * 修改数据
     *
     * @param commentReply 实例对象
     * @return 实例对象
     */
    CommentReply update(CommentReply commentReply);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}