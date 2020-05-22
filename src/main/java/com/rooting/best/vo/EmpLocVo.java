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
@Table(name = "EMP_LOC")
public class EmpLocVo {
    @Id
    private BigDecimal empCd;

    private BigDecimal locLat;

    private BigDecimal locLng;
}
