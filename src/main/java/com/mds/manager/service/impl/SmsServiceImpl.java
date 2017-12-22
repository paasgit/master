package com.mds.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mds.manager.dao.SmsMapper;
import com.mds.manager.model.Sms;
import com.mds.manager.model.SmsExample;
import com.mds.manager.service.SmsService;
import com.mds.manager.utils.PageUtils;

@Service
public class SmsServiceImpl implements SmsService {
	
	@Autowired
	private SmsMapper smsMapper;

	@Override
	public PageUtils getSmsPages(PageUtils Page) {
		SmsExample example = (SmsExample) Page.getQueryParames();
		List<Sms> list = smsMapper.getSmsPages((Page.getPage()-1)*Page.getLimit(),Page.getLimit(), example);
		int count = smsMapper.countByExample(example);
		Page.setList(list);
		Page.setCountNum(count);
		return Page;
	}

}
