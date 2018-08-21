package com.simons.sericefeign;

import org.springframework.stereotype.Component;

/**
 * @author Simons
 * @version V1.0
 * @Title: SchedualServiceHiHystric
 * @ProjectName eureka
 * @Description: TODO
 * @date 2018/8/20 14:54
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, you are fail,"+name;
    }
}
