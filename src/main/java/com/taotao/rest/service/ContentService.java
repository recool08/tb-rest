package com.taotao.rest.service;

import java.util.List;
import com.taotao.pojo.TbContent;

public interface ContentService {

	String getContentListJson(long contentCid);
	
	List<TbContent> getContentList(long contentCid);
	
}