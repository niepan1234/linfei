package com.lin.ssm.test;


import java.util.HashMap;
import org.apache.log4j.Logger;

public class Vote {

	// ͨ��firebug���Եõ�ͶƱʱ�ϴ�������Ϊ: id=146&tel=18965870620&outside=0
	private static final String URL_ADDRESS = "http://m.oneniceapp.com/topic/supergirl?from=singlemessage&isappinstalled=0";
//	private static String[] workIds = { "146" };// ͶƱ��Ʒid
//	private static final String outside = "0";
	private static Logger logger = Logger.getLogger("Vote");
	private static final long SLEEP_DUARATION = 1000;



	public static void submit(int count) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		String result = "";
		params.put("uid", "22363778");
		params.put("nuid", "CgoKC1ee0d84x6UfBghFAg==");
		params.put("Hm_lvt_f6dc28af987a6622d859520da4227f38", "1470026208");
		params.put("Hm_lpvt_f6dc28af987a6622d859520da4227f38", "1470026412");
		result = Commonfunctions.sendPost(URL_ADDRESS, params);
		logger.info("result " + result);
		/*if (result.contains("0")) {
			logger.info("ͶƱ�ɹ� " + phoneNum);
		} else if (result.contains("2")) {
			logger.info("30����ֻ����Ͷһ��");
		} else if (result.contains("8")) {
			logger.info("ÿ���ֻ���ֻ��ͶƱһ�� " + phoneNum);
		}*/

		try {
			Thread.sleep(SLEEP_DUARATION);
		} catch (InterruptedException e) {
			logger.info(e.toString());
		}
	}
	
	public static void main(String[] args) {
		Vote.submit(3);
	}
}
