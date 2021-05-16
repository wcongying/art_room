package com.nicole.ssm.controller;

import com.nicole.ssm.entity.Banner;
import com.nicole.ssm.entity.Manu;
import com.nicole.ssm.rest.Restful;
import com.nicole.ssm.service.ManuService;
import com.nicole.ssm.vo.ManuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Manu)表控制层
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
@RestController
@RequestMapping("/manu")
public class ManuController {
    /**
     * 服务对象
     */
    @Autowired
    private ManuService manuService;

    /**
     * 查询root下所有目录,should be show 1
     *
     *
     * @return 对象列表,平板带parent_id
     */
    @RequestMapping (value = "/sortedlist/{rootId}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryAllChildrenManus( @PathVariable long rootId) {
        List<Manu> manus = manuService.queryAllChildrenManus( rootId );

        if ( null != manus ) {
            return Restful.set(200, "show manus successfully", manus);
        }
        return Restful.set(404, "null manus");
    }

    /**
     * 查询root下所有目录,should be show 1
     *
     *
     * @return tree
     */
    @RequestMapping (value = "/manuVoTree/{rootId}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryAllChildrenManuVos( @PathVariable long rootId ) {
        ManuVo manuVo = manuService.queryAllChildrenManuVos( rootId );

        if ( null != manuVo ) {
            return Restful.set(200, "show manuVo successfully", manuVo);
        }
        return Restful.set(404, "null manuVo");
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/")
    public Manu selectOne(Long id) {
        return this.manuService.queryById(id);
    }

}