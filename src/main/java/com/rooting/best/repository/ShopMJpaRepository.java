package com.rooting.best.repository;

import com.rooting.best.vo.MemMVo;
import com.rooting.best.vo.ShopMVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.math.BigDecimal;

@Repository
public interface ShopMJpaRepository extends JpaRepository<ShopMVo, BigDecimal> {
    @QueryHints(value = {@QueryHint(name = "org.hibernate.comment", value = "ShopMJpaRepository.findByShopCd")})
    public ShopMVo findByShopCd(BigDecimal shopCd);

}
