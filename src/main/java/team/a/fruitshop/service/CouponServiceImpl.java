package team.a.fruitshop.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import team.a.fruitshop.entity.Coupon;
import team.a.fruitshop.repository.CouponRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CouponServiceImpl implements CouponService{

    private final CouponRepository couponRepository;

    @Override
    public List<Coupon> createCoupon(List<Coupon> coupons) {
        return this.couponRepository.saveAll(coupons);
    }

    @Override
    public Coupon getCoupon(String couponCode) {
        Coupon coupon = this.couponRepository.findByCouponCode(couponCode);

        if (coupon == null){
            throw new IllegalArgumentException("Coupon is invalid");
        }

        return coupon;
    }

    @Override
    public List<Coupon> getAllCoupons() {
        return this.couponRepository.findAll();
    }

    private Coupon getCouponId(Long id) {
        Optional<Coupon> coupon = this.couponRepository.findById(id);
        if (coupon.isEmpty()){
            throw new IllegalArgumentException("Coupon is not found");
        }
        return coupon.get();
    }

    @Override
    public Coupon updateCoupon(Coupon coupon) {
        this.getCouponId(coupon.getId());
        return this.couponRepository.save(coupon);
    }

    @Override
    public void deleteCoupon(String couponCode) {
        Coupon coupon = this.couponRepository.findByCouponCode(couponCode);
        this.couponRepository.delete(coupon);
    }
}