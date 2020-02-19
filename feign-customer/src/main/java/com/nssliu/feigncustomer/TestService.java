package com.nssliu.feigncustomer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liuzhiheng
 * @version 1.0
 * @date 2020/2/19 19:12
 * @describe:
 */
@FeignClient(value = "service-hi")
public interface TestService {
    @RequestMapping(value = "/servers/getValue")
    String getValue(@RequestParam(value = "name") String name);
}
