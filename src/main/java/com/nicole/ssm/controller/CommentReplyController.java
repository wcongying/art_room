package com.nicole.ssm.controller;

import com.nicole.ssm.entity.Artwork;
import com.nicole.ssm.entity.CommentReply;
import com.nicole.ssm.rest.Restful;
import com.nicole.ssm.service.CommentReplyService;
import com.nicole.ssm.vo.CommentReplyVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (CommentReply)表控制层
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
@RestController
@RequestMapping("/commentReply")
public class CommentReplyController {

//    private Logger logger = LoggerFactory.getLogger(CommentReplyController.class);

    /**
     * 服务对象
     */
    @Autowired
    private CommentReplyService commentReplyService;

    /**
     * 查询作品Id下所有留言评论
     *
     *
     * @return 对象列表,平板带parent_id
     */
    @RequestMapping (value = "/all/{artworkId}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryShowByArtworkId(@PathVariable long artworkId) {
        List<CommentReply> commentReplies = this.commentReplyService.queryShowByArtworkId( artworkId );
        if( null != commentReplies ){
            return Restful.set(200, "show comments replies successfully", commentReplies);
        }
        return Restful.set(404, "null comments replies");
    }

    /**
     * 查询作品Id下所有留言评论,层级展示
     *
     *
     * @return 对象列表,层级展示
     */
    @RequestMapping (value = "/commentallreply/{artworkId}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryArtworkIdCommentAndReply(@PathVariable long artworkId) {
        List<CommentReplyVo> commentRepliesVo = this.commentReplyService.
                queryArtworkIdCommentAndReply( artworkId );
        if( null != commentRepliesVo ){
            return Restful.set(200, "show comments replies successfully", commentRepliesVo);
        }
        return Restful.set(404, "null comments replies");
    }

    /**
     * 新增数据
     *
     * @param commentReply 实例对象
     * @return 实例对象
     */
    @RequestMapping (value = "/one", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertOneCommentReply(@RequestBody CommentReply commentReply) {
        if( null == commentReply ){
            return Restful.set(404, "null comments replies");
        }

        if( null == commentReply.getArtworkId() || null == commentReply.getContent() ||
                null == commentReply.getEditorId() || null == commentReply.getParentId() ||
                null ==commentReply.getStatus()){
            return Restful.set(400, "null field(s), please enter all required fields");
        }

        commentReply.setCreatedAt( System.currentTimeMillis() );
        commentReply.setUpdatedAt( System.currentTimeMillis() );

        CommentReply insert= this.commentReplyService.insert(commentReply);


        return Restful.set(200, "insert comments replies successfully", insert);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/One")
    public CommentReply selectOne(Long id) {
        return this.commentReplyService.queryById(id);
    }

}