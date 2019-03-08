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
		
		System.out.println("1990年，黎明的火速走红，将同属宝丽金唱片公司的李克勤的声势压下，取而代之。而香港乐坛的乐队势力亦开始被偶像派取代。当时因为黎明和刘德华同属偶像派，成为最大竞争对手，两人曾被封为双子星。 而唱将实力派的张学友亦保持声势和前两者被合称乐坛“三剑客”。随后1991年，郭富城爆红旋风从台湾吹回香港，加上《东方日报》一篇打油诗的效应，香港“演唱会之父”张耀荣（另一说法为方逸华）将四位当时最受欢迎的男流行歌手统称为“四大天王”，并得到市民广泛接受，一直沿用至今。四人都在多栖发展，但各自竞争最多的地方还是在音乐上，四人几乎垄断了1990年代香港乐坛所有奖项。每年香港四大音乐颁奖礼期间，不仅四人竞争激烈、各自歌迷更是口水横飞".getBytes().length);
	}
	
	
	// get请求
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

