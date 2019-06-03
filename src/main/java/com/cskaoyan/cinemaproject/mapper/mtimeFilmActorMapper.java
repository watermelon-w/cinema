package com.cskaoyan.cinemaproject.mapper;

import com.cskaoyan.cinemaproject.bean.mtimeFilmActor;

public interface mtimeFilmActorMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(mtimeFilmActor record);

    int insertSelective(mtimeFilmActor record);

    mtimeFilmActor selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(mtimeFilmActor record);

    int updateByPrimaryKey(mtimeFilmActor record);
}