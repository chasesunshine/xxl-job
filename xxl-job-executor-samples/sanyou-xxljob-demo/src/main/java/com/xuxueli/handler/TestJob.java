package com.xuxueli.handler;

import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TestJob {

    private static final Logger logger = LoggerFactory.getLogger(TestJob.class);

    @XxlJob("TestJob")
    public void testJob() {
        logger.info("TestJob任务执行了。。。");
    }

    @XxlJob("TestJob1")
    public void testJob1() {
        logger.info("TestJob1任务执行了123。。。");
    }

}
