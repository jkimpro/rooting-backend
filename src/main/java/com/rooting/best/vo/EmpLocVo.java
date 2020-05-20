package com.rooting.best.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EmpLocVo {
    private BigDecimal empCd;
    private BigDecimal locLat;
    private BigDecimal locLng;
}
