package com.rooting.best.services.emp;

import com.rooting.best.repository.ShopMJpaRepository;
import com.rooting.best.vo.EmpMVo;
import com.rooting.best.vo.ShopMVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@Service
public class ShopMngService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ShopMJpaRepository shopMJpaRepository;

    public ShopMVo getShopInfo(BigDecimal shopCd){
        ShopMVo returnVo;
        try{
            returnVo = shopMJpaRepository.findByShopCd(shopCd);
        }
        catch (Exception e){
            logger.info(">>> shop information get fail");
            return null;
        }
        return returnVo;
    }

    public int setShopInfo(ShopMVo input){
        int result = new Integer(0);
        ShopMVo sample = new ShopMVo();
        BigDecimal shopCdCheck = input.getShopCd();

        try{
            sample = shopMJpaRepository.findByShopCd(shopCdCheck);
        }
        catch(Exception e){
            logger.info(">>> Data none");
        }

        if(!ObjectUtils.isEmpty(input) && ObjectUtils.isEmpty(sample)){
            shopMJpaRepository.save(input);
            result = 1;
        }
        else{
            result = 0;
        }
        return result;
    }

}
