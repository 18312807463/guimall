package com.atguigu.gulimall.member.feign;


import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("gulimall-coupon")
public interface CouponFeign {

    @RequestMapping("coupon/coupon/list")
    public R list(@RequestParam Map<String, Object> params);


}
