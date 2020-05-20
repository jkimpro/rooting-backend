package com.rooting.best.vo;

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
public class TeamMVo {
    @Id
    private Integer teamCd;
    private String regDt;
    private String regId;
    private String teamNm;
    private String ceoDirYn;
}

