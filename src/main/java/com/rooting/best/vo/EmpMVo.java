package com.rooting.best.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EmpMVo {
    private BigDecimal empCd;
    private String regDt;
    private String regId;
    private String empNm;
    private BigDecimal teamCd;
    private String onWorkYn;
    private String insideYn;
    private String masterRtYn;
}

//    CREATE TABLE EMP_M(
//        EMP_CD INT(11) PRIMARY KEY NOT NULL,
//    REG_DT VARCHAR(11) NOT NULL,
//    REG_ID VARCHAR(11) NOT NULL,
//    EMP_NM VARCHAR(11) NOT NULL,
//    TEAM_CD INT(11) NOT NULL,
//    ON_WORK_YN VARCHAR(11) NOT NULL DEFAULT 'N',
//        INSIDE_YN VARCHAR(11) NOT NULL DEFAULT 'N',
//        MASTER_RT_YN VARCHAR(11) NOT NULL DEFAULT 'N',
//        FOREIGN KEY (TEAM_CD) REFERENCES TEAM_M(TEAM_CD)
//        );
