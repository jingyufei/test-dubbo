package com.jing.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class HttpPostUtils {
	
    public static String httpPost(String urlAddress,Map<String, String> headerMap,Map<String, String> map) throws Exception{ 
        URL url = null; 
        HttpURLConnection con  =null; 
        BufferedReader in = null; 
        StringBuffer result = new StringBuffer(); 
        try { 
            url = new URL(urlAddress); 
            con  = (HttpURLConnection) url.openConnection();
            
            if (null != headerMap && !headerMap.isEmpty()) { // 设置header params
                for (Map.Entry<String, String> entry : headerMap.entrySet()) {
                	 con.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            con.setUseCaches(false); 
            con.setDoOutput(true); 
            con.setDoInput(true);
            con.setRequestMethod("POST");
            
//            String paramsTemp = ""; 
//            for(String param:params){ 
//                if(param!=null&&!"".equals(param.trim())){ 
//                    paramsTemp+="&"+param; 
//                } 
//            } 
//            byte[] b = paramsTemp.getBytes(); 
//            con.getOutputStream().write(b, 0, b.length); 
            
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes(map.toString());
            con.getOutputStream().flush(); 
            con.getOutputStream().close();
            
            in = new BufferedReader(new InputStreamReader(con.getInputStream())); 
            while (true) { 
              String line = in.readLine(); 
              if (line == null) { 
                break; 
              } 
              else { 
                  result.append(line); 
              } 
            } 
        }finally{ 
            try { 
                if(in!=null){ 
                    in.close(); 
                } 
                if(con!=null){ 
                    con.disconnect(); 
                } 
            } catch (IOException e) { 
                e.printStackTrace(); 
            } 
        } 
        return result.toString(); 
    } 
}
