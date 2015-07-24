package net.devwiki.gson;

import net.devwiki.main.DataCreator;
import net.devwiki.model.Person;

public class GsonClient {
	
	public void objectToJson(){
		System.out.println("----------Gson-Object2Json----------");
		Person person = DataCreator.createPerson();
		System.out.println("对象的信息:" + person.toString());
		String objectJson = GsonUtil.toJSON(person);
		System.out.println("转换后的Json:" + objectJson);
	}
	
	public void jsonToObject(){
		System.out.println("----------Gson-Json2Object2----------");
		String json = GsonUtil.toJSON(DataCreator.createPerson());
		System.out.println("转换前的Json:" + json);
		Person person = GsonUtil.toObject(json, Person.class);
		System.out.println("转换后的对象信息:" + person.toString());
	}
}
