package com.cskaoyan.cinemaproject.mapper;

import com.cskaoyan.cinemaproject.bean.mtimeActor;

public interface mtimeActorMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(mtimeActor record);

    int insertSelective(mtimeActor record);

    mtimeActor selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(mtimeActor record);

    int updateByPrimaryKey(mtimeActor record);
}