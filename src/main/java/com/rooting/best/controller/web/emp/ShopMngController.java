package com.rooting.best.controller.web.emp;

import com.rooting.best.services.emp.ShopMngService;
import com.rooting.best.vo.ShopMVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class ShopMngController {

    @Autowired
    ShopMngService shopMngService;

    @RequestMapping(method = RequestMethod.GET, value = "/emp/getShopInfo/{shopCd}")
    public ShopMVo getShopInfo(@PathVariable("shopCd")BigDecimal shopCd){
        ShopMVo returnVo = shopMngService.getShopInfo(shopCd);
        return returnVo;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/emp/setShopInfo")
    public int setShopInfo(@RequestBody ShopMVo shopMVo){
        if(("").equals(shopMVo.getShopCd())){
            return 0;
        }
        else{
            return shopMngService.setShopInfo(shopMVo);
        }
    }

}
