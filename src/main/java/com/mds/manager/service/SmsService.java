package com.mds.manager.service;

import com.mds.manager.utils.PageUtils;

public interface SmsService {

	/**
	 * 短信分页数据
	 * @param Page
	 * @return
	 */
	PageUtils getSmsPages(PageUtils Page);
}
