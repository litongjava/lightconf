package com.lightconf.admin.web.example.core.constant;

import org.springframework.beans.factory.annotation.Value;

/**
 *  测试示例（可删除）
 *
 *  @author xuxueli
 */
public class DemoConf {

//	@XxlConf("default.key02")
//	public String paramByAnno;
//
//	@Value("key01")
//	public String paramByXml;

	@Value("key1")
	public String paramByLightConf;


//	public void setParamByXml(String paramByXml) {
//		this.paramByXml = paramByXml;
//	}

}
