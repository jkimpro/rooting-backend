package com.rooting.best.repository;

import com.rooting.best.vo.EmpLocVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.math.BigDecimal;

@Repository
public interface EmpLocJpaRepository extends JpaRepository<EmpLocVo, BigDecimal> {
    @QueryHints(value = {@QueryHint(name = "org.hibernate.comment", value = "EmpLocJpaRepository.findByEmpCd")})
    public EmpLocVo findByEmpCd(BigDecimal empCd);

}
