package com.rooting.best.controller.web;

import com.rooting.best.repository.EmpMJpaRepository;
import com.rooting.best.vo.EmpMVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.net.Inet4Address;

@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    EmpMJpaRepository empMJpaRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/test0")
    public EmpMVo test() {

        logger.info(">>> test web controller");
        BigDecimal temp = new BigDecimal(1000);

        logger.info(">>> input value :" + temp.toString());
        logger.info(">>> input value :" + temp);

        EmpMVo returnEmpMVo = empMJpaRepository.findByEmpCd(temp);
        logger.info(">>> output value name:" + returnEmpMVo.getEmpNm());
        if (!ObjectUtils.isEmpty(returnEmpMVo)) {
            return returnEmpMVo;
        } else {
            return null;
        }
    }

}
