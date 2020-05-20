package com.rooting.best.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
@ToString
@Table(name = "EMP_M")
@Getter
@Setter
public class EmpMVo {

    @Id
    @Column(name = "EMP_CD")
    private Integer empCd;

    private String regDt;
    private String regId;
    private String empNm;
    private Integer teamCd;
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
