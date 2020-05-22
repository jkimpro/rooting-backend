package com.rooting.best.repository;

import com.rooting.best.vo.EmpLocVo;
import com.rooting.best.vo.EmpMVo;
import com.rooting.best.vo.MemMVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.math.BigDecimal;

@Repository
public interface MemMJpaRepository extends JpaRepository<MemMVo, BigDecimal> {
    @QueryHints(value = {@QueryHint(name = "org.hibernate.comment", value = "MemMJpaRepository.findByMemCd")})
    public MemMVo findByMemCd(BigDecimal memCd);

}
