package com.nicole.ssm.service.impl;

import com.nicole.ssm.entity.Artstudio;
import com.nicole.ssm.dao.ArtstudioDao;
import com.nicole.ssm.entity.ArtstudioImage;
import com.nicole.ssm.service.ArtstudioImageService;
import com.nicole.ssm.service.ArtstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Artstudio)表服务实现类
 *
 * @author makejava
 * @since 2021-05-11 15:40:05
 */
@Service("artstudioService")
public class ArtstudioServiceImpl implements ArtstudioService {
    @Autowired
    private ArtstudioDao artstudioDao;

    @Autowired
    private ArtstudioImageService artstudioImageService;


    /**
     * 通过ID查询单条数据.处理image_url属性，图片url之间用逗号隔开。
     * 按要求展示5个，后台上传允许也就是最多5个。所以这里不做数量限制
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Artstudio queryById(Long id) {
        Artstudio artstudio = this.artstudioDao.queryById( id );
        //add image_urls to the artstudio
        List<ArtstudioImage> artstudioImages =
                this.artstudioImageService.queryByArtstudioId( id );
        if( null == artstudioImages || artstudioImages.size() == 0 ) {
            artstudio.setImageUrl("");
            return artstudio;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (ArtstudioImage artstudioImage : artstudioImages) {
            stringBuilder.append( artstudioImage.getImageUrl());
            stringBuilder.append(",");
        }
    //前端友好，删除多余的逗号
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        artstudio.setImageUrl( stringBuilder.toString() );

        return artstudio;
    }

    /**
     * 返回status是1的元素的list
     *
     * @return list
     */
    @Override
    public List<Artstudio> queryAllShow() {
        return this.artstudioDao.queryAllShow();
    }

    /**
     * 查询X个artstudio,限制目前是5个,should be show 1
     *
     *
     * @return 对象列表
     */
    @Override
    public List<Artstudio> queryLimitArtstudios() {
        int limit = 5;
        return this.artstudioDao.queryLimitArtstudios( limit );
    }


    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Artstudio> queryAllByLimit(int offset, int limit) {
        return this.artstudioDao.queryAllByLimit(offset, limit);
    }





    /**
     * 新增数据
     *
     * @param artstudio 实例对象
     * @return 实例对象
     */
    @Override
    public Artstudio insert(Artstudio artstudio) {
        this.artstudioDao.insert(artstudio);
        return artstudio;
    }

    /**
     * 修改数据
     *
     * @param artstudio 实例对象
     * @return 实例对象
     */
    @Override
    public Artstudio update(Artstudio artstudio) {
        this.artstudioDao.update(artstudio);
        return this.queryById(artstudio.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.artstudioDao.deleteById(id) > 0;
    }
}