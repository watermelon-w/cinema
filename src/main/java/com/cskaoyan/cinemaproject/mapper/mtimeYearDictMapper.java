package com.cskaoyan.cinemaproject.mapper;

import com.cskaoyan.cinemaproject.bean.mtimeYearDict;

public interface mtimeYearDictMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(mtimeYearDict record);

    int insertSelective(mtimeYearDict record);

    mtimeYearDict selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(mtimeYearDict record);

    int updateByPrimaryKey(mtimeYearDict record);
}