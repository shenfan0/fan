package com.fiberhome.powerrecord;

import org.testng.annotations.Test;

public class TestDemo2 extends BaseTest {

    @Test
    public void testUpdateUserInfo(){
        String result = powerRecordService.updateUserInfo();
        System.out.println(">>>>>>" + result + i);
    }

    public static void main(String[] args) {

    }

}
