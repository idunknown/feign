package com.xz.controller;

import com.xz.clientInterface.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuhy on 2018/5/31.
 */
@RestController
@RequestMapping("serviceNameController")
public class ServiceNameController {
    @Autowired
    ComputeService computeService;

    @RequestMapping(value = "/getName",method = RequestMethod.GET)
    public String getServiceName(@RequestParam String name){
        return computeService.sayHiFromClientOne(name);
    }
}
