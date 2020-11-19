package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author sxq
 * @email 2191567886@gmail.com
 * @date 2020-11-19 22:25:12
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
