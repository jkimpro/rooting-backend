package com.rooting.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EmpMVo {
    private BigDecimal empCd;
    private String regDt;
    private String regId;
    private String modDt;
    private String modId;
    private String empNm;
    private String teamNm;
    private String onWorkYn;
    private String insideYn;
    private String masterRtYn;
}

//    EMP_M
//            EMP_CD
//    REG_DT Default now()
//REG_ID
//        MOD_DT Default now()
//        MOD_ID
//        EMP_NM
//        TEAM_NM
//        ON_WORK_YN Default ’N’
//        INSIDE_YN Default ’N’
//        MASTER_RT_YN Default ’N’