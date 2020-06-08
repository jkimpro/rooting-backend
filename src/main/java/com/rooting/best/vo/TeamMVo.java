package com.rooting.best.vo;

import com.rooting.best.config.session.SessionVo;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
@ToString
@Table(name = "TEAM_M")
public class TeamMVo extends SessionVo {
    @Id
    private BigDecimal teamCd;
    private String regDt;
    private String regId;
    private String teamNm;
    private String ceoDirYn;
}

