package com.cskaoyan.cinemaproject.mapper;

import com.cskaoyan.cinemaproject.bean.mtimeFilmInfo;
import com.cskaoyan.cinemaproject.bean.mtimeFilmInfoWithBLOBs;

public interface mtimeFilmInfoMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(mtimeFilmInfoWithBLOBs record);

    int insertSelective(mtimeFilmInfoWithBLOBs record);

    mtimeFilmInfoWithBLOBs selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(mtimeFilmInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(mtimeFilmInfoWithBLOBs record);

    int updateByPrimaryKey(mtimeFilmInfo record);
}