package com.mds.manager.service.impl;
import java.util.List;
import com.mds.manager.dao.tUserDao;
import com.mds.manager.model.tUser;
import com.mds.manager.common.Assist;
import com.mds.manager.service.tUserService;
public class tUserServiceImpl implements tUserService{
    private tUserDao tUserDao;
    @Override
    public long gettUserRowCount(Assist assist){
        return tUserDao.gettUserRowCount(assist);
    }
    @Override
    public List<tUser> selecttUser(Assist assist){
        return tUserDao.selecttUser(assist);
    }
    @Override
    public tUser selecttUserById(Integer id){
        return tUserDao.selecttUserById(id);
    }
    @Override
    public int inserttUser(tUser value){
        return tUserDao.inserttUser(value);
    }
    @Override
    public int insertNonEmptytUser(tUser value){
        return tUserDao.insertNonEmptytUser(value);
    }
    @Override
    public int deletetUserById(Integer id){
        return tUserDao.deletetUserById(id);
    }
    @Override
    public int deletetUser(Assist assist){
        return tUserDao.deletetUser(assist);
    }
    @Override
    public int updatetUserById(tUser enti){
        return tUserDao.updatetUserById(enti);
    }
    @Override
    public int updatetUser(tUser value, Assist assist){
        return tUserDao.updatetUser(value,assist);
    }
    @Override
    public int updateNonEmptytUserById(tUser enti){
        return tUserDao.updateNonEmptytUserById(enti);
    }
    @Override
    public int updateNonEmptytUser(tUser value, Assist assist){
        return tUserDao.updateNonEmptytUser(value,assist);
    }

    public tUserDao gettUserDao() {
        return this.tUserDao;
    }

    public void settUserDao(tUserDao tUserDao) {
        this.tUserDao = tUserDao;
    }

}