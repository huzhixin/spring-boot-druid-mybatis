package com.cto001.askservice.mapper;

/**
 * Created by huzhixin on 2017/6/28.
 */

import com.github.pagehelper.Page;
import com.cto001.askservice.model.UserInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    @Select("select * from user_info")
    Page<UserInfo> selectAll();
}
