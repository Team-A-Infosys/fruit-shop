package team.a.fruitshop.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import team.a.fruitshop.entity.Coupon;
import team.a.fruitshop.service.CouponService;

import java.util.List;

@RestController
@AllArgsConstructor
public class CouponController {

    private final CouponService couponService;

    @PostMapping("/dashboard/create/coupon")
    public List<Coupon> createCoupon(@RequestBody List<Coupon> coupons){
        return this.couponService.createCoupon(coupons);
    }

    @PutMapping("/dashboard/coupons/{id}")
    public Coupon getCoupon(@PathVariable("id") Long id, @RequestBody Coupon coupon) {
        coupon.setId(id);
        return this.couponService.updateCoupon(coupon);
    }

    @GetMapping("/dashboard/coupons")
    public List<Coupon> getAllCoupons(){
        return this.couponService.getAllCoupons();
    }

    @GetMapping("/coupon")
    public Coupon applyCoupon(@RequestParam("couponCode") String couponCode){
        return this.couponService.getCoupon(couponCode);
    }

    @DeleteMapping("/dashboard/coupon")
    public ResponseEntity<?> deleteCoupon(@RequestParam("couponCode") String couponCode){
        this.couponService.deleteCoupon(couponCode);

        return ResponseEntity.ok().build();
    }

}