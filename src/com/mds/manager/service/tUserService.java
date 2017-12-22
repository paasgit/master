package com.mds.manager.service;
import java.util.List;
import com.mds.manager.model.tUser;
import com.mds.manager.common.Assist;
public interface tUserService{
    long gettUserRowCount(Assist assist);
    List<tUser> selecttUser(Assist assist);
    tUser selecttUserById(Integer id);
    int inserttUser(tUser value);
    int insertNonEmptytUser(tUser value);
    int deletetUserById(Integer id);
    int deletetUser(Assist assist);
    int updatetUserById(tUser enti);
    int updatetUser(tUser value, Assist assist);
    int updateNonEmptytUserById(tUser enti);
    int updateNonEmptytUser(tUser value, Assist assist);
}