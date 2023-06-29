package com.ijpay.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
/**
 * @author juzi
 * @date 2023/6/28 下午 6:19
 * @description Spring 容器在启动后，会自动调用执行 run 方法。并且在整个应用生命周期内只会执行一次。
 */
@Order(1)
public class StartupRunner implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(StartupRunner.class);

	@Override
	public void run(String... args) {
		logger.info("startup runner");
	}

}
