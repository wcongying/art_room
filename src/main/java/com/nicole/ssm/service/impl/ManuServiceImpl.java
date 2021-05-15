package com.nicole.ssm.service.impl;

import com.nicole.ssm.entity.Manu;
import com.nicole.ssm.dao.ManuDao;
import com.nicole.ssm.service.ManuService;
import com.nicole.ssm.vo.ManuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.List;

/**
 * (Manu)表服务实现类
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
@Service("manuService")
public class ManuServiceImpl implements ManuService {
    @Autowired
    private ManuDao manuDao;


    /**
     * 通过ID查找此级别下所有manu
     *
     * @param id 主键
     * @return list
     */
    @Override
    public List<Manu> queryAllChildrenManus(Long id) {
        List<Manu> result = new ArrayList<>();
        queryAllChildrenManusHelper( id , result );
        return result;
    }


    private void queryAllChildrenManusHelper(Long root, List<Manu> result){

        if( root == null || root < 0L  ){
            return;
        }

        Manu parent = manuDao.queryById( root );

        if(parent == null || parent.getStatus() < 1 ){
            return;
        }

        result.add( parent );
        String childrenIds = parent.getChildrenIds();

        if( StringUtils.isBlank( childrenIds ) ){
            return;
        }

        String[] childrenIdList = childrenIds.split(",");
        for (String id : childrenIdList) {
            long childId = Long.parseLong( id );
            queryAllChildrenManusHelper( childId, result );
        }
    }

    /**
     * 通过ID查找此级别下所有manu,并用ManuVo更容易分层展示
     *
     * @param id 主键
     * @return ManuVo
     */
    @Override
    public ManuVo queryAllChildrenManuVos(Long id) {
        Manu manu = manuDao.queryById( id );
        return queryAllChildrenManuVosHelper( manu );
    }

    private ManuVo queryAllChildrenManuVosHelper(Manu manu) {
        if( manu == null ){
            return null;
        }

        if( manu.getStatus() < 1 ) {
            return null;
        }

        String childrenIds = manu.getChildrenIds();

        if ( StringUtils.isBlank( childrenIds ) ){
            return manuToManuVo( manu );
        }

        ManuVo manuVo = manuToManuVo( manu );

        List<ManuVo> manuVoChildren = new ArrayList<>();
        String[] childrenIdList = childrenIds.split(",");
        for (String id : childrenIdList) {
            long childId = Long.parseLong( id );
            ManuVo child = queryAllChildrenManuVosHelper( manuDao.queryById(childId) );
            manuVoChildren.add(child);
        }
        if( null != manuVoChildren && manuVoChildren.size() > 0){
            manuVo.setChildren( manuVoChildren );
        }
        return manuVo;
    }

    private ManuVo manuToManuVo(Manu manu) {
        if( manu == null ){
            return null;
        }
        ManuVo manuVo = new ManuVo();

        manuVo.setId( manu.getId() );
        manuVo.setCreatedAt( manu.getCreatedAt() );
        manuVo.setUpdatedAt( manu.getUpdatedAt() );
        manuVo.setName( manu.getName() );
        manuVo.setStatus( manu.getStatus() );
        manuVo.setLevel( manu.getLevel() );
        manuVo.setParentId( manu.getParentId() );
        return manuVo;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Manu queryById(Long id) {
        return this.manuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Manu> queryAllByLimit(int offset, int limit) {
        return this.manuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param manu 实例对象
     * @return 实例对象
     */
    @Override
    public Manu insert(Manu manu) {
        this.manuDao.insert(manu);
        return manu;
    }

    /**
     * 修改数据
     *
     * @param manu 实例对象
     * @return 实例对象
     */
    @Override
    public Manu update(Manu manu) {
        this.manuDao.update(manu);
        return this.queryById(manu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.manuDao.deleteById(id) > 0;
    }
}