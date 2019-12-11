package com.ssm.shop.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user-param")
@Data
public class UserParams {

    private String uploadPath;

    private String uploadProPath;

	public String getUploadPath() {
		return null;
	}
}
