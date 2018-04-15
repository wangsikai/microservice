package com.lanking.yc.ms.auth.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.lanking.cloud.sdk.util.StringUtils;

/**
 * 
 * <pre>
 * 从原来平台的yoo项目中复制而来,   TODO 服务化后是否有需要提取到公共类库中 by Michael
 * </pre>
 * 
 * @author <a href="mailto:sikai.wang@elanking.com">sikai.wang</a>
 * @version V1.0.0,2014年12月11日
 */
public class ValidateUtils {

	public static boolean isName(String value) {
		boolean validate = true;
		validate = StringUtils.isNotBlank(value);
		if (validate) {
			char[] cs = value.toCharArray();
			int len = 0;
			for (char c : cs) {
				String n = String.valueOf(c);
				if (Pattern.compile("([a-z]|[A-Z]|[0-9]|[_])+").matcher(n).matches()) {
					len += 1;
				} else if (Pattern.compile("([\\u4e00-\\u9fa5])+").matcher(n).matches()) {
					len += 2;
				}
			}
			if (len < 4 || len > 16) {
				validate = false;
			}
		}
		if (validate) {
			validate = !Pattern.compile("([0-9])+").matcher(value).matches();
		}
		if (validate) {
			Pattern p = Pattern.compile("([a-z]|[A-Z]|[0-9]|[_]|[\\u4e00-\\u9fa5])+");
			Matcher m = p.matcher(value);
			validate = m.matches();
		}
		return validate;
	}

	public static boolean isEmail(String value) {
		boolean validate = true;
		validate = StringUtils.isNotBlank(value);
		if (validate) {
			Pattern p = Pattern
					.compile("\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*");
			Matcher m = p.matcher(value);
			validate = m.matches();
		}
		return validate;
	}

	public static boolean isMobile(String value) {
		boolean validate = true;
		validate = StringUtils.isNotBlank(value);
		if (validate) {
			Pattern p = Pattern.compile("(1)\\d{10}");
			Matcher m = p.matcher(value);
			validate = m.matches();
		}
		return validate;
	}

}
