package com.rooting.best.services;

import com.rooting.best.repository.*;
import com.rooting.best.vo.EmpLocVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
public class CmmService {

    @Autowired
    EmpLocJpaRepository empLocJpaRepository;

    @Autowired
    EmpMJpaRepository empMJpaRepository;

    @Autowired
    MemMJpaRepository memMJpaRepository;

    @Autowired
    ShopMJpaRepository shopMJpaRepository;

    @Autowired
    TeamMJpaRepository tempMJpaRepository;

    public EmpLocVo getEmpLocation(BigDecimal empCd){
        try{
            return empLocJpaRepository.findByEmpCd(empCd);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public boolean setEmpLocation(EmpLocVo setValue){
        try { //JPA는 변경을 자동감지함
            empLocJpaRepository.save(setValue);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}


