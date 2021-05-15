package com.nicole.ssm.service.impl;

import com.nicole.ssm.entity.CommentReply;
import com.nicole.ssm.dao.CommentReplyDao;
import com.nicole.ssm.service.CommentReplyService;
import com.nicole.ssm.vo.CommentReplyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * (CommentReply)表服务实现类
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
@Service("commentReplyService")
public class CommentReplyServiceImpl implements CommentReplyService {
    @Autowired
    private CommentReplyDao commentReplyDao;

    /**
     * 通过id查询能被显示评论，加上留言
     *
     * @param artworkId
     * @return 实例对象
     */
    @Override
    public List<CommentReply> queryShowByArtworkId(long artworkId){
        int status1 = 1;
        int status2 = 2;
        String orderBy = "DESC";
        int limit = 50 ;//limit comment to 50

        List<CommentReply> comments = commentReplyDao.queryByArtworkIdStatusOrder(
                artworkId, status1, orderBy );
        List<CommentReply> replies = commentReplyDao.queryByArtworkIdStatusOrder(
                artworkId, status2, orderBy );

        if( comments.size() > limit ) {
            comments.subList( 0, limit + 1);
        }

        comments.addAll(replies);
        return comments;
    }

    /**
     * 通过id查询能被显示评论，组装留言。排序
     *
     * @param artworkId
     * @return 回复，层级显示留言
     */
    public List<CommentReplyVo> queryArtworkIdCommentAndReply( long artworkId ) {
        int status1 = 1;
        int status2 = 2;
        //数据库排序。可以用集合的某个元素按规则排序。留言限制不多，这个项目就数据库排序了
        String orderBy = "DESC";
        int limit = 50 ;//limit comment to 50

        List<CommentReply> comments = commentReplyDao.queryByArtworkIdStatusOrder(
                artworkId, status1, orderBy );
        List<CommentReply> replies = commentReplyDao.queryByArtworkIdStatusOrder(
                artworkId, status2, orderBy );

        List<CommentReplyVo> commentVos = commentReplyToVo( comments) ;
        List<CommentReplyVo> replyVos = commentReplyToVo( replies) ;

        if( comments.size() > limit ) {
            comments.subList( 0, limit + 1);
        }

        //如果comment有作者管理员等回复，组装到replies列表中
        addReplies( commentVos, replyVos);

        return commentVos;
    }

    /**
     * 如果comment有作者管理员等回复，组装到replies列表中
     *
     * @param commentVos, replyVos
     * @return
     */
    private void addReplies(List<CommentReplyVo> commentVos, List<CommentReplyVo> replyVos) {
        for (CommentReplyVo commentVo : commentVos) {
            for (CommentReplyVo replyVo : replyVos) {
                if ( commentVo.getId() == replyVo.getParentId()){
                    if( null == commentVo.getReplies() ){
                        commentVo.setReplies( new ArrayList<>());
                    }
                    commentVo.getReplies().add( replyVo );
                }
            }
        }
    }

    /**
     * 把commentReply组装成commentReplyVo。时间ms修改成人容易读的模式
     *
     * @param crs
     * @return 列表
     */
    private List<CommentReplyVo> commentReplyToVo(List<CommentReply> crs) {
        List<CommentReplyVo> commentReplyVos = new ArrayList<>();
        //不反射
        for (CommentReply cr : crs) {
            CommentReplyVo commentReplyVo = new CommentReplyVo();
            commentReplyVo.setId( cr.getId() );
            //我看到的原型图时间是用小短线分割年月日
            commentReplyVo.setCreatedAt( transferLongToDate(
                    "yyyy-MM-dd  hh:mm:ss", cr.getCreatedAt() ) );
            commentReplyVo.setUpdatedAt( transferLongToDate(
                    "yyyy-MM-dd  hh:mm:ss", cr.getUpdatedAt() ));
            commentReplyVo.setEditorId( cr.getEditorId() );
            commentReplyVo.setArtworkId( cr.getArtworkId() );
            commentReplyVo.setStatus( cr.getStatus() );
            commentReplyVo.setParentId( cr.getParentId() );
            commentReplyVo.setContent( cr.getContent() );
            commentReplyVos.add(commentReplyVo);
        }

        return  commentReplyVos;
    }


    private static String transferLongToDate(String dateFormat, Long millSecond) {
        Date time = new Date(millSecond);
        SimpleDateFormat formats = new SimpleDateFormat(dateFormat);
        return formats.format(time);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CommentReply queryById(Long id) {
        return this.commentReplyDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CommentReply> queryAllByLimit(int offset, int limit) {
        return this.commentReplyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param commentReply 实例对象
     * @return 实例对象
     */
    @Override
    public CommentReply insert(CommentReply commentReply) {
        this.commentReplyDao.insert(commentReply);
        return commentReply;
    }

    /**
     * 修改数据
     *
     * @param commentReply 实例对象
     * @return 实例对象
     */
    @Override
    public CommentReply update(CommentReply commentReply) {
        this.commentReplyDao.update(commentReply);
        return this.queryById(commentReply.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.commentReplyDao.deleteById(id) > 0;
    }
}