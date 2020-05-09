package com.rooting.vo;

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

//    TEAM_M
//            TEAM_CD
//    REG_DT Default now()
//    REG_ID
//            TEAM_NM
//    CEO_DIR_YN Default ’N’