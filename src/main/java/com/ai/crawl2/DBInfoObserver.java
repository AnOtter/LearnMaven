package com.ai.crawl2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author OTTER
 * @类说明 页面爬取之后将页面信息保存到数据库
 */
@Component
@Scope("prototype")
public class DBInfoObserver implements FetcherObserver {
	@Autowired
	WebPageService webPageService;

	/** 
	 *@说明 将爬取到的页面的标题和爬取时间更新到数据库
	 */
	@Override
	public void pageFetched(WebPage webPage) {
		webPageService.savePage(webPage);
	}
}
