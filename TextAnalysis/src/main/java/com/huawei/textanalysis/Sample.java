package com.huawei.textanalysis;

import java.util.HashMap;

import org.json.JSONObject;

import com.baidu.aip.nlp.AipNlp;

public class Sample {
	
    //设置APPID/AK/SK
	private static final String APPID = "15652877";
	
	private static final String APIKEY = "xzA1I1pikSjVp9g7l5ktkC7H";
	
	private static final String SECRETKEY = "B8VUmdSz8qkGFlnZqQZp5g2R0C4cQBge";
	
	private static final String XIANSIURL = "https://aip.baidubce.com/rpc/2.0/nlp/v2/simnet";

    public static void main(String[] args) {
        // 初始化一个AipNlp
        AipNlp client = new AipNlp(APPID, APIKEY, SECRETKEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
        // client.setHttpProxy("123.55.102.219", 9999);  // 设置http代理
        // client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // 调用接口
        String text = "刘德华的老婆身高是165cm";
        JSONObject res = client.lexer(text, null);
        System.out.println(res.toString(2));
        
//        String text1 = "1990年，黎明的火速走红，将同属宝丽金唱片公司的李克勤的声势压下，取而代之。而香港乐坛的乐队势力亦开始被偶像派取代。当时因为黎明和刘德华同属偶像派，成为最大竞争对手，两人曾被封为双子星。 而唱将实力派的张学友亦保持声势和前两者被合称乐坛“三剑客”。随后1991年，郭富城爆红旋风从台湾吹回香港，加上《东方日报》一篇打油诗的效应，香港“演唱会之父”张耀荣（另一说法为方逸华）将四位当时最受欢迎的男流行歌手统称为“四大天王”，并得到市民广泛接受，一直沿用至今。四人都在多栖发展，但各自竞争最多的地方还是在音乐上，四人几乎垄断了1990年代香港乐坛所有奖项。每年香港四大音乐颁奖礼期间，不仅四人竞争激烈、各自歌迷更是口水横飞";
//        String text2 = "张学友、黎明";
//
//        // 传入可选参数调用接口
//        HashMap<String, Object> options = new HashMap<String, Object>();
//        options.put("model", "CNN");
//        
//        // 短文本相似度
//        JSONObject res = client.simnet(text1, text2, options);
//        System.out.println(res.toString(2));

        
    }
}
