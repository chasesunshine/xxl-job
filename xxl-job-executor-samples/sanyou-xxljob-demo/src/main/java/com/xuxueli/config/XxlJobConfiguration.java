package com.xuxueli.config;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class XxlJobConfiguration {

    @Bean
    public XxlJobSpringExecutor xxlJobExecutor() {
        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
        //设置调用中心的连接地址
        xxlJobSpringExecutor.setAdminAddresses("http://localhost:8080/xxl-job-admin");
        //设置执行器的名称
        xxlJobSpringExecutor.setAppname("sanyou-xxljob-demo");
        //设置一个端口，后面会讲作用
        xxlJobSpringExecutor.setPort(9999);
        //这个token是保证访问安全的，默认是这个，当然可以自定义，
        // 但需要保证调度中心配置的xxl.job.accessToken属性跟这个token是一样的
        xxlJobSpringExecutor.setAccessToken("default_token");
        //任务执行日志存放的目录
        xxlJobSpringExecutor.setLogPath("./");
        return xxlJobSpringExecutor;
    }

}
