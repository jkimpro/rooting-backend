package com.rooting.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShopMVo {
    private BigDecimal shopCd;
    private String regDt;
    private String regId;
    private String modDt;
    private String modId;
    private String shopPtCd;
    private BigDecimal prdBuy;
    private BigDecimal authEmpCd;
}

//    SHOP_M
//            SHOP_CD
//    REG_DT Default now()
//REG_ID
//        MOD_DT Default now()
//        MOD_ID
//        SHOP_NM
//        SHOP_PT_CD (부문별 코드)
//        PRD_BUY Default 0
//        AUTH_EMP_CD EMP_CD (외래키)