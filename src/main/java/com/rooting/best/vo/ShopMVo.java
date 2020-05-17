package com.rooting.best.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShopMVo {
    private BigDecimal shopCd;
    private String regDt;
    private String regId;
    private String modDt;
    private String modId;
    private String shopNm;
    private String shopPtCd;
    private BigDecimal prdBuy;
    private BigDecimal authEmpCd;
}

//    CREATE TABLE SHOP_M(
//        SHOP_CD INT(11) PRIMARY KEY,
//    REG_DT VARCHAR(11) NOT NULL,
//    REG_ID VARCHAR(11) NOT NULL,
//    MOD_DT VARCHAR(11),
//    MOD_ID VARCHAR(11),
//    SHOP_NM VARCHAR(300),
//    SHOP_PT_CD VARCHAR(11),
//    PRD_BUY INT(11) DEFAULT 0,
//        AUTH_EMP_CD INT(11) NOT NULL,
//        CONSTRAINT AUTH_EMP_CD FOREIGN KEY (AUTH_EMP_CD) REFERENCES EMP_M(EMP_CD)
//        );

