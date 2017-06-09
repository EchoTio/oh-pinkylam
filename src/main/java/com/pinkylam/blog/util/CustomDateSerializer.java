package com.pinkylam.blog.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月9日 上午10:28:54
 */
public class CustomDateSerializer extends JsonSerializer<Date> {

	@Override
	public void serialize(Date value, JsonGenerator jsonGenerator, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		jsonGenerator.writeString(sdf.format(value));
	}
}