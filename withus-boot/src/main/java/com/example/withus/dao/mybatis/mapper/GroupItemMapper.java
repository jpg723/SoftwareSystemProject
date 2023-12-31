/*
 *    Copyright 2010-2013 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.example.withus.dao.mybatis.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.withus.domain.GroupItem;
import com.example.withus.domain.Item;

/**
 * @author Eduardo Macarron
 *
 */
@Mapper
public interface GroupItemMapper {

  //해당 groupItemId의 groupItem
  GroupItem getGroupItem(int groupItem_id);
  
  //처리 상태
  boolean GroupItemState(int groupItem_id);

  //공동구매상품 전체 조회
  List<GroupItem> getGroupItemList();
  
  //찜개수순 조회
  List<GroupItem> likeRanking();
  
  //마감일순 조회
  List<GroupItem> closeRanking();
  
  //신상품순 조회
  List<GroupItem> newProduct();
}