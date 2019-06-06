package com.fiberhome.powerrecord.controller;

import com.fiberhome.powerrecord.service.PowerRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PowerRecordController {

    @Autowired
    private PowerRecordService powerRecordService;

    @GetMapping("getuserinfo")
    public String queryUser() {
        return powerRecordService.getUserInfo();
    }

    @GetMapping("updateuserinfo")
    public String updateUser() {
        return powerRecordService.updateUserInfo();
    }

    @GetMapping("deleteuserinfo")
    public String deleteUser() {
        return powerRecordService.deleteUserInfo();
    }

}
