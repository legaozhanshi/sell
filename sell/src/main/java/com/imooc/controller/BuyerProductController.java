package com.imooc.controller;

import com.imooc.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 买家商品
 * @author jinhaoliang
 * @version 1.0
 * @date 2020/12/21 21:09
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVO list(){
        ResultVO resultVO = new ResultVO();
        return resultVO;
    }
}
