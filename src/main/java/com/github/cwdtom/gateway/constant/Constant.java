package com.github.cwdtom.gateway.constant;

/**
 * 常量
 *
 * @author chenweidong
 * @since 1.0.0
 */
public class Constant {
    /**
     * 版本号
     */
    public static final String VERSION = "1.1.0";
    /**
     * 最大单个请求大小，10MB
     */
    public static final int MAX_CONTENT_LEN = 64 * 1024 * 1024;
    /**
     * http前缀
     */
    public static final String HTTP_PREFIX = "http://";
    /**
     * https前缀
     */
    public static final String HTTPS_PREFIX = "https://";
    /**
     * 重定向响应体模板
     */
    public static final String REDIRECT_TEMPLATE = "<html><meta http-equiv='refresh' content='0;url=%s'></html>";
    /**
     * 命令行参数help
     */
    public static final String COMMAND_HELP = "h";
    /**
     * 命令行参数配置文件地址
     */
    public static final String COMMAND_CONFIG = "c";
    /**
     * 命令行参数版本号
     */
    public static final String COMMAND_VERSION = "v";
    /**
     * 熔断临界错误次数
     */
    public static final int OFFLINE_COUNT = 3;
}
