package com.cskaoyan.cinemaproject.mapper;

import com.cskaoyan.cinemaproject.bean.mtimeSourceDict;

public interface mtimeSourceDictMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(mtimeSourceDict record);

    int insertSelective(mtimeSourceDict record);

    mtimeSourceDict selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(mtimeSourceDict record);

    int updateByPrimaryKey(mtimeSourceDict record);
}