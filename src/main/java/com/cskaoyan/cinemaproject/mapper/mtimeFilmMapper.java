package com.cskaoyan.cinemaproject.mapper;

import com.cskaoyan.cinemaproject.bean.mtimeFilm;

public interface mtimeFilmMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(mtimeFilm record);

    int insertSelective(mtimeFilm record);

    mtimeFilm selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(mtimeFilm record);

    int updateByPrimaryKey(mtimeFilm record);
}