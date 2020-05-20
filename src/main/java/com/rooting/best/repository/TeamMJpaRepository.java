package com.rooting.best.repository;

import com.rooting.best.vo.ShopMVo;
import com.rooting.best.vo.TeamMVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.math.BigDecimal;

@Repository
public interface TeamMJpaRepository extends JpaRepository<TeamMVo, Integer> {
    @QueryHints(value = {@QueryHint(name="org.hibernate.comment", value = "TeamMJpaRepository.findByTeamCd")})
    public TeamMVo findByTeamCd(Integer teamCd);

}
