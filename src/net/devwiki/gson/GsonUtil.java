package net.devwiki.gson;

import java.lang.reflect.Type;
import java.util.List;

import net.devwiki.model.Student;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GsonUtil {
	
	public static String toJSON(Object object){
		Gson gson = new Gson();
		return gson.toJson(object);
	}
	
	public static <T> T toObject(String json, Class<T> claxx){
		Gson gson = new Gson();
		T t = gson.fromJson(json, claxx);
		return t;
	}
	
	public static List<Student> toStudentList(String json){
		Gson gson = new Gson();
		Type type = new TypeToken<List<Student>>(){}.getType();
		return gson.fromJson(json, type);
	}
}
