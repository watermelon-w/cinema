package com.cskaoyan.cinemaproject.mapper;

import com.cskaoyan.cinemaproject.bean.mtimeBanner;

public interface mtimeBannerMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(mtimeBanner record);

    int insertSelective(mtimeBanner record);

    mtimeBanner selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(mtimeBanner record);

    int updateByPrimaryKey(mtimeBanner record);
}