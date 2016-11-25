package com.lin.ssm.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

public class Commonfunctions {
	private static Commonfunctions utility = null;
	private static Logger logger = null;

	private Commonfunctions() {
		logger = Logger.getLogger("Commonfunctions");
	}

	public static synchronized Commonfunctions getInstance() {
		if (utility == null) {
			utility = new Commonfunctions();
		}
		return utility;
	}

	/**
	 * @function ��������绰����
	 * @param totalCount �ܹ����ɶ��ٸ�11λ�ֻ�����
	 * @param preFix ���뿪ͷǰ׺ ��,13,14,15,17,18�ȵ�
	 * @return
	 */
	public Set<String> getRandomPhoneNumSet(int totalCount, String preFix) {
		String[] validPrefix = { "13", "14", "15", "17", "18" };
		boolean isPrefixValid = false;
		for (String tempFre : validPrefix) {
			if (tempFre.equals(preFix)) {
				isPrefixValid = true;
			}
		}

		if (!isPrefixValid) {
			logger.info("preFix�쳣 preFix = " + preFix);
			preFix = validPrefix[0];
		}

		HashSet<String> phoneSet = new HashSet<String>();
		StringBuilder sb = new StringBuilder();
		double randomDouble = 0;
		BigDecimal bg = null;
		int index = 0;
		for (int i = 0; i < totalCount;) {
			if (index >= totalCount * 5) {
				return phoneSet;
			}
			sb.setLength(0);
			sb.append(preFix);

			randomDouble = Math.random() * Math.pow(10, 11);
			bg = new BigDecimal(randomDouble);
			sb.append(bg.toString().substring(0, 9));
			phoneSet.add(sb.toString());
			index++;
			i = phoneSet.size();
		}

		return phoneSet;
	}

	/**
	* @function ��ָ�� URL ����POST����������
	* @param url ��������� URL
	* @param param ���������ʹ��key,value����ʽ,���Զ�ʹ��"&"��������
	* @return ��Ӧ���
	*/
	public static String sendPost(String url, Map<String, Object> params) {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		String param = "";
		String connector = "&";

		for (Map.Entry<String, Object> entry : params.entrySet()) {
			param += connector + entry.getKey() + "=" + entry.getValue();
		}
		if (param.startsWith(connector)) {
			param = param.substring(1);
		}

		try {
			URL realUrl = new URL(url);
			// �򿪺�URL֮�������
			URLConnection conn = realUrl.openConnection();
			// ����ͨ�õ��������� - ����ͨ��firebugֱ��ץȡ
			conn.setRequestProperty("accept", "application/json, text/javascript, */*; q=0.01");
			conn.setRequestProperty("Content-Length", "12");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent",
					"Mozilla/5.0 (iPad; CPU OS 7_0 like Mac OS X) AppleWebKit/537.51.1 (KHTML, like Gecko) Version/7.0 Mobile/11A465 Safari/9537.53");
			//conn.setRequestProperty("Cookie", "lang=zh-cn; nuid=CgoKC1ee0d84x6UfBghFAg==; Hm_lvt_f6dc28af987a6622d859520da4227f38=1470026208; Hm_lpvt_f6dc28af987a6622d859520da4227f38=1470026412");
			conn.setRequestProperty("X-Requested-With", "XMLHttpRequest");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
			conn.setRequestProperty("Accept-Encoding", "gzip, deflate");
			//conn.setRequestProperty("Origin", "http://m.oneniceapp.com");
			// ����POST�������������������
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// ��ȡURLConnection�����Ӧ�������
			out = new PrintWriter(conn.getOutputStream());

			// �����������
			// flush������Ļ���
			out.print(param);
			out.flush();

			// ����BufferedReader����������ȡURL����Ӧ
			in = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			logger.info("���� POST ��������쳣��" + e);
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
}
