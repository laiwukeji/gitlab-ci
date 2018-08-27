package com.chengli.gitlab.env;

import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: chengli
 * @Date: 2018/8/1 12:37
 *
 * 这里配置父容器
 */
@ComponentScan(basePackages = "com.chengli.gitlab.service")
public class RootConfig {

}
