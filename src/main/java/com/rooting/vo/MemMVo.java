package com.rooting.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MemMVo {
    private BigDecimal memCd;
    private String memNm;
    private String memPassword;
    private String memEmpYn;
    private BigDecimal empCd;
}

//MEM_M
//        MEM_CD PRIMARY KEY
//        MEM_NM
//        MEM_PASSWORD
//        MEM_EMP_YN
//        EMP_CD