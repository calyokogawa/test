package com.example.webapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.webapp.entity.ToDo;
import com.example.webapp.repository.ToDoMapper;
import com.example.webapp.service.ToDoService;

import lombok.RequiredArgsConstructor;

/**
 * ToDo：サービス実装クラス
 */
@Service
@Transactional
@RequiredArgsConstructor
public class ToDoServiceImpl implements ToDoService {

	/** DI */
	private final ToDoMapper toDoMapper;
	
	@Override
	public List<ToDo> findAllToDo() {
		// TODO 自動生成されたメソッド・スタブ
		
		return toDoMapper.selectAll();
	}

	@Override
	public ToDo findByIdToDo(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return toDoMapper.selectById(id);
	}

	@Override
	public void insertToDo(ToDo toDo) {
		// TODO 自動生成されたメソッド・スタブ
		toDoMapper.insert(toDo);

	}

	@Override
	public void updateToDo(ToDo toDo) {
		// TODO 自動生成されたメソッド・スタブ
		toDoMapper.update(toDo);

	}

	@Override
	public void deleteToDo(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		toDoMapper.delete(id);

	}

}
