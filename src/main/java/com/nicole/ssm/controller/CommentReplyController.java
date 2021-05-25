package com.nicole.ssm.controller;

import com.nicole.ssm.entity.Artwork;
import com.nicole.ssm.entity.CommentReply;
import com.nicole.ssm.rest.Restful;
import com.nicole.ssm.service.CommentReplyService;
import com.nicole.ssm.vo.CommentReplyVo;
import org.apache.commons.lang3.StringUtils;
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
 * @author nicole
 */
@RestController
@RequestMapping("/commentreply")
public class CommentReplyController {

    private Logger logger = LoggerFactory.getLogger(CommentReplyController.class);

    /**
     * 服务对象
     */
    @Autowired
    private CommentReplyService commentReplyService;

    /**
     * @api {GET} /commentReply/all/{artworkId} queryShowByArtworkId
     * @apiVersion 1.0.0
     * @apiGroup CommentReplyController
     * @apiName queryShowByArtworkId
     * @apiDescription 查询作品Id下所有留言评论。return 对象列表,平板带parent_id
     * @apiParam (请求参数) {Number} artworkId
     * @apiParamExample 请求参数示例
     * artworkId=6705
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
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
     * @api {GET} /commentReply/allcommentreply/{artworkId} queryArtworkIdCommentAndReply
     * @apiVersion 1.0.0
     * @apiGroup CommentReplyController
     * @apiName queryArtworkIdCommentAndReply
     * @apiDescription 查询作品Id下所有留言评论, 层级展示
     * return 对象列表,层级展示
     * @apiParam (请求参数) {Number} artworkId
     * @apiParamExample 请求参数示例
     * artworkId=5454
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequestMapping (value = "/allcommentreply/{artworkId}", method = RequestMethod.GET)
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
     * @api {POST} /commentReply insertOneCommentReply
     * @apiVersion 1.0.0
     * @apiGroup CommentReplyController
     * @apiName insertOneCommentReply
     * @apiDescription 新增评论或者留言一个
     * @apiParam (请求体) {Number} id
     * @apiParam (请求体) {Number} createdAt
     * @apiParam (请求体) {Number} updatedAt
     * @apiParam (请求体) {Number} editorId
     * @apiParam (请求体) {Number} artworkId
     * @apiParam (请求体) {Number} status comment shows1;noshow0;administrators' reply2
     * @apiParam (请求体) {Number} parentId
     * @apiParam (请求体) {String} content
     * @apiParamExample 请求体示例
     * {"createdAt":1678,"editorId":6900,"artworkId":8177,"id":3060,"parentId":4350,"content":"AzLfnNst0","updatedAt":7315,"status":2955}
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequestMapping (value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertOneCommentReply(@RequestBody CommentReply commentReply) {
        if( null == commentReply ){
            return Restful.set(404, "null comments replies");
        }

        if( null == commentReply.getArtworkId() || StringUtils.isBlank( commentReply.getContent()) ||
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
    @GetMapping("/")
    public CommentReply selectOne(Long id) {
        return this.commentReplyService.queryById(id);
    }

}