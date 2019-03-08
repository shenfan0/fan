package com.huawei.textanalysis;

import java.util.HashMap;

import org.json.JSONObject;

import com.baidu.aip.nlp.AipNlp;

public class Sample {
	
    //����APPID/AK/SK
	private static final String APPID = "15652877";
	
	private static final String APIKEY = "xzA1I1pikSjVp9g7l5ktkC7H";
	
	private static final String SECRETKEY = "B8VUmdSz8qkGFlnZqQZp5g2R0C4cQBge";
	
	private static final String XIANSIURL = "https://aip.baidubce.com/rpc/2.0/nlp/v2/simnet";

    public static void main(String[] args) {
        // ��ʼ��һ��AipNlp
        AipNlp client = new AipNlp(APPID, APIKEY, SECRETKEY);

        // ��ѡ�������������Ӳ���
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // ��ѡ�����ô����������ַ, http��socket��ѡһ�����߾�������
        // client.setHttpProxy("123.55.102.219", 9999);  // ����http����
        // client.setSocketProxy("proxy_host", proxy_port);  // ����socket����

        // ��ѡ������log4j��־�����ʽ���������ã���ʹ��Ĭ������
        // Ҳ����ֱ��ͨ��jvm�����������ô˻�������
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // ���ýӿ�
        String text = "���»������������165cm";
        JSONObject res = client.lexer(text, null);
        System.out.println(res.toString(2));
        
//        String text1 = "1990�꣬�����Ļ����ߺ죬��ͬ��������Ƭ��˾������ڵ�����ѹ�£�ȡ����֮���������̳���ֶ������࿪ʼ��ż����ȡ������ʱ��Ϊ���������»�ͬ��ż���ɣ���Ϊ��������֣�����������Ϊ˫���ǡ� ������ʵ���ɵ���ѧ���ౣ�����ƺ�ǰ���߱��ϳ���̳�������͡������1991�꣬�����Ǳ��������̨�崵����ۣ����ϡ������ձ���һƪ����ʫ��ЧӦ����ۡ��ݳ���֮������ҫ�٣���һ˵��Ϊ���ݻ�������λ��ʱ���ܻ�ӭ�������и���ͳ��Ϊ���Ĵ������������õ�����㷺���ܣ�һֱ�����������˶��ڶ��ܷ�չ�������Ծ������ĵط������������ϣ����˼���¢����1990��������̳���н��ÿ������Ĵ����ְ佱���ڼ䣬�������˾������ҡ����Ը��Ը��ǿ�ˮ���";
//        String text2 = "��ѧ�ѡ�����";
//
//        // �����ѡ�������ýӿ�
//        HashMap<String, Object> options = new HashMap<String, Object>();
//        options.put("model", "CNN");
//        
//        // ���ı����ƶ�
//        JSONObject res = client.simnet(text1, text2, options);
//        System.out.println(res.toString(2));

        
    }
}
