package com.gamerole.base.core.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

/**
 * @author 吕志豪
 * @date 17-11-6  下午5:58
 * Github :https://github.com/lvzhihao100
 * E-Mail：1030753080@qq.com
 * 简书 :http://www.jianshu.com/u/6e525b929aac
 * 说明 :
 */
@Configuration
public class FileUploadConfiguration {
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // 设置文件大小限制 ,超出设置页面会抛出异常信息，
        // 这样在文件上传的地方就需要进行异常信息的处理了;
        factory.setMaxFileSize("100MB"); // KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("200MB");
        // Sets the directory location where files will be stored.
         factory.setLocation("/home/lv/upload");
        return factory.createMultipartConfig();
    }
}
