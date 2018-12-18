package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016091900548714";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCb85RsbY9+B8zlsygV3WFDzIs29756UMWoeDLUde1J5QTsP0Gg75DUqRtMIw1ni427kxrylEdjAZafgam7z3xdldGffkjdR5vBlTpjYMHGiH4kV2TbYCTpDO2G58xYVRjvr6B6c0CCusTPopPo53MqGaBKUh1R7EN1K1N+lZddq140SCed8uTYF33m5N4v64upa1DtBbYcqTlhWtn8Fpxmz6m1mfu69239BGOaJhT+4wJ502CnssUmx/r5rbPOLhaL179FLwlhKQjxqnYqpFdMUySKZxbcFq4TmseWWhjMsvMOAj3iNd6cBhQQZhpmykbsYGcoIRrvzsnwfLBysYfRAgMBAAECggEAEARdayF5il0suy7CYDSDh94bMkMRqihflKT7u3x9KYi/D7CTgf745g6UQiabetYHcYtzShTWnCGOocVEdIij4ky/4dyriSaQpbo46/oFDOn54qujLTDbuZ/dSWzHPQ9IZ12nYswxhPu/uP+ep14WIu3M27VBU6eraf5QLgEZMcJ9N0WwUlYAWvo/2c8dNDzrEaqB5FWM3egQ+mEf9g7oJuRLrv1AfWpp5YtFd/O4v+SreICESqVo7XE2bM8DVVz2QNUMgmDYtNQhwn3fId4WvtqWIYMp6g+XbAJQhwFgiUWH0dDQW4aTHTIQZsjaqLj4VcmV4PwkZ8mykeutMpWUUQKBgQDx8/a58OIGvEASv2zTAa01L6TH2ME5l5lOFMv/Hi3vu7jdJCCEXIn90/QMa3bgndaDVwEAkP7WN6mhWTWoe6ysQar9Cs7si/fGIw7FMe+ktKs4KLE0P3I54D8LLfimLCm2JRLTpqKpEWuV/qfcQGxBS+ZYBVw2oeZ+zPhDJ60DrQKBgQClAWpHhyw5ne3nEDtrKZlNDy9owdVO8FsTopWwHF0zFaP0pOlqyua2oxrzhwccNGuQs2K35pCAuFiB8ORbVFHjeHzOHbkbSSlAbOCfEWF/BZi/sG10RQiAFQSeutb8sz7rAwByeROywTZKdtz04FzXPGCDfrtoIRnCxFlx9g95NQKBgQCY2pKFl8uDi8xCy9J5X7bIQggtBR/VPZPpgzP5QVyt9n9sndU5Kak3xX6Jlh6s+qo5oW6NqAyG0vWEbHJ8tV06GeZnJDvjru1irGU5aTnHaSg+O17v7iFAtQ2/B1Ttzjqvyq4hLkXW352DTjVH7R83BTdJZmGCVjfi5aT18AvapQKBgB15qj2KxPip4ISFHsgezza3vrVM4sjOIMbaJTknZ/KnK/mYt+WOxzXa3wafmUKNjqVzle/Z7PhBdfYITRKPdm1W6Zx8LMPWBttuV5WyqiLhog6j+nlpl4IhvwiHwb20W0np6FuKi11ELGmS4BeSOKNuMqNqsRmByDNFleDInqz9AoGAIBobX0qJQlJH4sbjbd3qRAzUu4eftR+B1zA5iaCd6gFBSqBCWA16TX5PNqwcTZ81ztmbz/KRXcxmB7wqJ3lq7SRebynfWK8aPnVXMhu4UA/nYMfFNZnjl+w7+KEO52BGTzrulXfvMWHuBqdwD3e84048e0FwZkyS7Bpybh7WX+o=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuG8ERq2Adn5chHMVKwDnPfczRGg/iBE0v8CTLQ9PcFS6yxYD0sSpdjXltG0QOPNS0kbniWJWbwfX7IizlCX+3S8mpNVdwZ4Pqpwkjgml9Om1/I8eULlSAp0ov39xU0SMAbHKYNEVwK4n+DkmyN+52on/N3jDZJ8ZIsDo2XFMtvt4evfUTCttS5Oi5DAJU4AujQFN5zdxxAJBs+lcKpC7pSmnwW7Nc3k306fSWD2QjtKu8Xjk7t0H+jMCca9WIByHMhjm6vf6kF+TXZ6K5rApS/HN6lmqN0bpCm9lEjvvGu6ripyGffOELBPrFh6D7BOGk0DH1IDDfy2it6fkuoJHswIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/bookstore/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/bookstore/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

