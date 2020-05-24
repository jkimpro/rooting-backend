package com.rooting.best.services.manager;

import com.rooting.best.repository.EmpMJpaRepository;
import com.rooting.best.vo.EmpLocVo;
import com.rooting.best.vo.EmpMVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@Service
public class EmpMngService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    EmpMJpaRepository empMJpaRepository;

    public EmpMVo getEmpInfo(BigDecimal empCd) {
        try{
            return empMJpaRepository.findByEmpCd(empCd);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    public int setEmpInfo(EmpMVo input){
        int result = new Integer(0);
        EmpMVo sample = new EmpMVo();
        BigDecimal empCdCheck = input.getEmpCd();

        try{
            sample = empMJpaRepository.findByEmpCd(empCdCheck);
        }catch (Exception e){
            logger.info(" >>> Data none");
        }

//        logger.info(" >>> search Data: " + sample.getEmpCd() + " " +
//                sample.getEmpNm() + " input Data: " + input.getEmpCd() + " " +input.getEmpNm());

        if(!ObjectUtils.isEmpty(input) && ObjectUtils.isEmpty(sample)){
            empMJpaRepository.save(input);
            result = 1;
        }
        else{
            result = 0;
        }
        return result;
    }
}