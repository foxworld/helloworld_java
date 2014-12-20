package kr.co.ksnet.foxworld.html;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class ReceiveHtml {

	public static void main(String[] args) {
		try {
			BufferedInputStream in = null;
			String strUrl = "https://pgims.ksnet.co.kr/pg_inc/login/login.jsp";
			StringBuffer sb = new StringBuffer();
			
			try {
				URL url = new URL(strUrl);
				URLConnection urlConnection = url.openConnection();
				in = new BufferedInputStream(urlConnection.getInputStream());
				
				byte[] bufRead = new byte[4096];
				int lenRead = 0;
				while ((lenRead = in.read(bufRead)) > 0)
					sb.append(new String(bufRead, 0, lenRead));

			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			
			System.out.println(sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
