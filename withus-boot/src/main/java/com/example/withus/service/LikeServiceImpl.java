package com.example.withus.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.withus.domain.GroupItem;
import com.example.withus.domain.Item;
import com.example.withus.domain.Like;
import com.example.withus.dao.LikeDao;



@Service("LikeServiceImpl")
public class LikeServiceImpl implements LikeService {

	@Autowired
	private LikeDao likeDao;

	public List<Item> getItemLikes(String user_id) {
		return likeDao.getItemLikes(user_id);
	}

	public List<GroupItem> getGroupItemLikes(String user_id) {
		return likeDao.getGroupItemLikes(user_id);
	}

	public void insertItemLike(Like like) {
		likeDao.insertItemLike(like);
	}

	public void insertGroupItemLike(Like like) {
		likeDao.insertGroupItemLike(like);
	}

	public void removeItemLike(Like like) {
		likeDao.removeItemLike(like);
	}

	public void removeGroupItemLike(Like like) {
		likeDao.removeGroupItemLike(like);
	}

	public List<Item> rankingItem() {
		return likeDao.rankingItem();
	}

	public List<GroupItem> rankingGroupItem() {
		return likeDao.rankingGroupItem();
	}

	public List<Like> getGroupItemLike(Like like) {
		return likeDao.getGroupItemLike(like);
	}

	public List<Like> getItemLike(Like like) {
		return likeDao.getItemLike(like);
	}
}
