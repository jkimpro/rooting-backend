package com.rooting.best.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MemMVo {
    private BigDecimal memCd;
    private String id;
    private String password;
    private String empYn;
    private BigDecimal empCd;
}

//    CREATE TABLE MEM_M(
//        MEM_CD INT(11) PRIMARY KEY,
//    ID VARCHAR(11) NOT NULL,
//    PASSWORD VARCHAR(11) NOT NULL,
//    EMP_YN VARCHAR(11) DEFAULT 'N',
//        EMP_CD INT(11)
//        );