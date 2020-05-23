package com.rooting.best.controller.web.emp;

import com.rooting.best.services.CmmService;
import com.rooting.best.vo.EmpLocVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.beans.ExceptionListener;
import java.math.BigDecimal;

@RestController
public class LocationController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    CmmService cmmService;

    @RequestMapping(method = RequestMethod.GET, value = "/emp/getEmpLocation/{empCd}")
    EmpLocVo getEmpLocation(@PathVariable("empCd") BigDecimal empCd){
        EmpLocVo returnLoc = new EmpLocVo();
        logger.info(" >>> id: " + empCd);
        if(empCd.equals("") || empCd.equals(null)){
            return null;
        }
        else {
            returnLoc = cmmService.getEmpLocation(empCd);
        }

        return returnLoc;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/emp/setEmpLocation")
    boolean setEmpLocation(@RequestBody EmpLocVo inputValue){
        logger.info(" >>> id: " + inputValue.getRegId());
        logger.info(" >>> lat: " + inputValue.getLocLat() + " lng: " + inputValue.getLocLng());

        boolean retrunValue = cmmService.setEmpLocation(inputValue);
        return false;
    }
}
