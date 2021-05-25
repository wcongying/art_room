package com.nicole.ssm.controller;

import com.nicole.ssm.entity.Artwork;
import com.nicole.ssm.rest.Restful;
import com.nicole.ssm.service.ArtworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * (Artwork)表控制层
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
@RestController
@RequestMapping("/artwork")
public class ArtworkController {
    /**
     * 服务对象
     */
    @Autowired
    private ArtworkService artworkService;

    /**
     * @api {GET} /artwork/all queryArtworksNewUpdate
     * @apiVersion 1.0.0
     * @apiGroup ArtworkController
     * @apiName queryArtworksNewUpdate
     * @apiDescription 查询所有可展示作品，根据修改时间先新后旧
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequestMapping (value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryArtworksNewUpdate() {
        List<Artwork> artworks = artworkService.queryArtworksNewUpdate();
        if( null != artworks ){
            return Restful.set(200, "show artworks successfully", artworks);

        }
        return Restful.set(404, "null artworks");
    }

    /**
     * @api {GET} /artwork/manuid/{manuId} queryArtworksNewUpdate
     * @apiVersion 1.0.0
     * @apiGroup ArtworkController
     * @apiName queryArtworksNewUpdate
     * @apiDescription 查询对应manuId下可展示作品，根据修改时间先新后旧
     * @apiParam (请求参数) {Number} manuId
     * @apiParamExample 请求参数示例
     * manuId=5445
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequestMapping (value = "/manuid/{manuId}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryArtworksNewUpdate(@PathVariable long manuId) {
        List<Artwork> artworks = artworkService.queryArtworksManuId( manuId );
        if( null != artworks ){
            return Restful.set(200, "show artworks in manuId " + manuId, artworks);

        }
        return Restful.set(404, "null artworks");
    }

    /**
     * @api {GET} /artwork/{id} OneArtwork
     * @apiVersion 1.0.0
     * @apiGroup ArtworkController
     * @apiName OneArtwork
     * @apiDescription 通过主键查询单条作品
     * @apiParam (请求参数) {Number} id
     * @apiParamExample 请求参数示例
     * id=495
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequestMapping (value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> OneArtwork(@PathVariable long id) {
        Artwork artwork = this.artworkService.queryById(id);
        if( null != artwork ){
            return Restful.set(200, "show artwork successfully", artwork);

        }
        return Restful.set(404, "null artwork");
    }

}