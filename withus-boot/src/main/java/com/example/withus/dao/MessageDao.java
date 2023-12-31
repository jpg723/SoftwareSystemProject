package com.example.withus.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.withus.domain.Member;
import com.example.withus.domain.Message;



public interface MessageDao {
	//메시지 보내기
	void insertMessage(Message message) throws DataAccessException;
	
	//받은 메시지 불러오기
	List<Message> getMessageList(String receiver_id) throws DataAccessException;
	
	//보낸 메시지 불러오기
	List<Message> getSendedMessageList(String sender_id) throws DataAccessException;
		
	//받은 메시지 중 읽지 않은 메시지 불러오기
	List<Message> getUnrededList(String receiver_id) throws DataAccessException;
	
	//메시지 자세히 보기
	Message getMessage(int id) throws DataAccessException;

	//읽음표시 체크
	void readCheck(int message_id) throws DataAccessException;
}
