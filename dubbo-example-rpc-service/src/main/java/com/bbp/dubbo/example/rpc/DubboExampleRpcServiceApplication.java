package com.bbp.dubbo.example.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by ZhangShuzheng on 2017/2/3.
 */
public class DubboExampleRpcServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DubboExampleRpcServiceApplication.class);

	public static void main(String[] args) {
		LOGGER.info(">>>>> dubbo-example-rpc-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath:spring-context/*.xml");
		LOGGER.info(">>>>> dubbo-example-rpc-service 启动完成 <<<<<");
	}

}
