package com.todo.app.service;

import java.util.List;

import com.todo.app.entity.Todo;

public interface TodoService {
	
	public List<Todo> dateSort(List<Todo> list);
	
}
