package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author MalingZhao
 * @email 2833084526@qq.com
 * @date 2020-04-09 10:51:33
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
