package com.mds.manager.dao;
import com.mds.manager.model.tUser;
import java.util.List;
import com.mds.manager.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface tUserDao{
    long gettUserRowCount(Assist assist);
    List<tUser> selecttUser(Assist assist);
    tUser selecttUserById(Integer id);
    int inserttUser(tUser value);
    int insertNonEmptytUser(tUser value);
    int deletetUserById(Integer id);
    int deletetUser(Assist assist);
    int updatetUserById(tUser enti);
    int updatetUser(@Param("enti") tUser value, @Param("assist") Assist assist);
    int updateNonEmptytUserById(tUser enti);
    int updateNonEmptytUser(@Param("enti") tUser value, @Param("assist") Assist assist);
}