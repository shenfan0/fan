package com.fiberhome.powerrecord;

import org.testng.annotations.Test;

public class TestDemo1 extends BaseTest {

    @Test
    public void testGetUserInfo(){
        String result = powerRecordService.getUserInfo();
        System.out.println(">>>>>>" + result + i);
    }

    @Test
    public void testDeleteUserInfo(){
        String result = powerRecordService.deleteUserInfo();
        System.out.println(">>>>>>" + result + i);
    }

}
