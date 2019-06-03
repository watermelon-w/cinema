package com.cskaoyan.cinemaproject.mapper;

import com.cskaoyan.cinemaproject.bean.mtimeCatDict;

public interface mtimeCatDictMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(mtimeCatDict record);

    int insertSelective(mtimeCatDict record);

    mtimeCatDict selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(mtimeCatDict record);

    int updateByPrimaryKey(mtimeCatDict record);
}