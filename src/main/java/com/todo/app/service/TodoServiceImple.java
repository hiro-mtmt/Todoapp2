package com.todo.app.service;

import java.util.ArrayList;
import java.util.List;

import com.todo.app.entity.Todo;

public class TodoServiceImple implements TodoService {
	public List<Todo> dateSort(List<Todo> list){
		List<Todo> sortList = new ArrayList<Todo>();
		for(int i=0; i<list.size(); i++) {
			String a = list.get(i).getTime_limit();
		}
		return list;
	}
}
