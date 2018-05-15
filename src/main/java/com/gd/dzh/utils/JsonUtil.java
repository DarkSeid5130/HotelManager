package com.gd.dzh.utils;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
/*
 * 工具类：将对象与jason进行相互转换,无需在xml中配置转换器
 */
public class JsonUtil {
	
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
	// 将对象转为json
	public static String ObjectToJson(Object object) {
		try {
			return OBJECT_MAPPER.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	// 将json转为对象
	public static <T> T jsonToObject(String json, Class<T> type) {
		try {
			return OBJECT_MAPPER.readValue(json, type);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// 将json转为集合
	public static <T> List<T> jsonToList(String json, Class<T> type) {
		try {
			//将type转为集合中的具体泛型
			JavaType jType = OBJECT_MAPPER.getTypeFactory()
					.constructParametricType(List.class, type);
			return OBJECT_MAPPER.readValue(json, jType);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
