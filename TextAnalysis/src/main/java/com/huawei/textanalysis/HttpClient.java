package com.huawei.textanalysis;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class HttpClient {

	private static final String APPID = "15652877";
	
	private static final String APIKEY = "xzA1I1pikSjVp9g7l5ktkC7H";
	
	private static final String SECRETKEY = "B8VUmdSz8qkGFlnZqQZp5g2R0C4cQBge";
	
	private static final String XIANSIURL = "https://aip.baidubce.com/rpc/2.0/nlp/v2/simnet";
	
	public static void main(String[] args) {
		
		System.out.println("1990�꣬�����Ļ����ߺ죬��ͬ��������Ƭ��˾������ڵ�����ѹ�£�ȡ����֮���������̳���ֶ������࿪ʼ��ż����ȡ������ʱ��Ϊ���������»�ͬ��ż���ɣ���Ϊ��������֣�����������Ϊ˫���ǡ� ������ʵ���ɵ���ѧ���ౣ�����ƺ�ǰ���߱��ϳ���̳�������͡������1991�꣬�����Ǳ��������̨�崵����ۣ����ϡ������ձ���һƪ����ʫ��ЧӦ����ۡ��ݳ���֮������ҫ�٣���һ˵��Ϊ���ݻ�������λ��ʱ���ܻ�ӭ�������и���ͳ��Ϊ���Ĵ������������õ�����㷺���ܣ�һֱ�����������˶��ڶ��ܷ�չ�������Ծ������ĵط������������ϣ����˼���¢����1990��������̳���н��ÿ������Ĵ����ְ佱���ڼ䣬�������˾������ҡ����Ը��Ը��ǿ�ˮ���".getBytes().length);
	}
	
	
	// get����
	public static String getRequest(String url) {
		
		OkHttpClient okHttpClient = new OkHttpClient();
		final Request request = new Request.Builder()
		        .url(url)
		        .build();
		final Call call = okHttpClient.newCall(request);
		Response response = null;
		try {
			response = call.execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
        ResponseBody rsp = response.body();
		
		try {
			return rsp.string();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	
	
}

