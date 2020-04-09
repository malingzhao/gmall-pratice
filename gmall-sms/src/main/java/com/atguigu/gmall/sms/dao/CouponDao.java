package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author MalingZhao
 * @email 2833084526@qq.com
 * @date 2020-04-09 11:32:00
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
