package com.rooting.best.config.session;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

import org.springframework.util.ObjectUtils;
import io.swagger.annotations.ApiModelProperty;

@Data
public class SessionVo {

    @ApiModelProperty(hidden=true)
    protected String sessionUserId;

    @ApiModelProperty(hidden=true)
    protected String sessionUserIp;

    @ApiModelProperty(hidden=true)
    protected String sessionUserNm;

    @ApiModelProperty(hidden=true)
    protected String sessionHndphnNo;

    @ApiModelProperty(hidden=true)
    protected String sessionEmailAddr;

    @ApiModelProperty(hidden=true)
    protected String sessionOrgId;

    @ApiModelProperty(hidden=true)
    protected String sessionOrgNm;

    @ApiModelProperty(hidden=true)
    protected String sessionFuncAuthList;

    @ApiModelProperty(hidden=true)
    protected String regDt;

    @ApiModelProperty(hidden=true)
    protected String regId;

    @ApiModelProperty(hidden=true)
    protected String modDt;

    @ApiModelProperty(hidden=true)
    protected String modId;

    @ApiModelProperty(hidden=true)
    protected String retCd;

    @ApiModelProperty(hidden=true)
    protected String retMsg;

    @ApiModelProperty(hidden=true)
    protected String creuser;

    private SessionVo sessionVo;

    public boolean isSessionFuncAuth(String authId) {
        if (this.sessionFuncAuthList == null) {
            return false;
        } else {
            if (this.sessionFuncAuthList.indexOf("#SEP#" + authId + "#SEP#") > -1)
                return true;
            return false;
        }
    }

    public void setSessionInfo() {
        this.regId = this.sessionUserId;
        this.modId = this.sessionUserId;

        Date now = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");
        String inputDate = date.format(now);

        this.modDt = inputDate;
        this.regDt = inputDate;
    }

    public void setSessionInfo(SessionVo sessionVo) {
        if(!ObjectUtils.isEmpty(sessionVo)) {
            this.sessionVo = sessionVo;
        }
    }
}