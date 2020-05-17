package com.rooting.best.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TeamMVo {
    private BigDecimal teamCd;
    private String regDt;
    private String regId;
    private String teamNm;
    private String ceoDirYn;
}

