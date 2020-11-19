package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author sxq
 * @email 2191567886@gmail.com
 * @date 2020-11-19 20:20:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
