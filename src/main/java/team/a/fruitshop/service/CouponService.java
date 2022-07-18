package team.a.fruitshop.service;

import team.a.fruitshop.entity.Coupon;

import java.util.List;

public interface CouponService {

    List<Coupon> createCoupon(List<Coupon> coupons);

    Coupon getCoupon(String couponCode);

    List<Coupon> getAllCoupons();

    Coupon updateCoupon(Coupon coupon);

    void deleteCoupon(String couponCode);
}