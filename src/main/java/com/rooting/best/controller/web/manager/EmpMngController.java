package com.rooting.best.controller.web.manager;

import com.rooting.best.services.manager.EmpMngService;
import com.rooting.best.vo.EmpMVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class EmpMngController {
    @Autowired
    EmpMngService empMngService;

    @RequestMapping(method = RequestMethod.GET, value = "/manager/getEmpInfo/{empCd}")
    public EmpMVo getEmpInfo(@PathVariable("empCd") BigDecimal empCd) {
        EmpMVo returnVo;
        if (("").equals(empCd)) {
            return null;
        }
        else {
            returnVo = empMngService.getEmpInfo(empCd);
        }
        return returnVo;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/manager/setEmpInfo")
    public int setEmpInfo(@RequestBody EmpMVo empMVo){
        if(("").equals(empMVo.getEmpCd())){
            return 0;
        }
        else{
            return empMngService.setEmpInfo(empMVo);
        }
    }


}
