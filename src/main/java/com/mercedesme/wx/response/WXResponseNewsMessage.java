package com.mercedesme.wx.response;

import java.util.List;

import com.mercedesme.wx.XStreamCDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 图文消息
 *
 */
@XStreamAlias("xml")
public class WXResponseNewsMessage extends WXResponseBaseMessage {

	private static final long serialVersionUID = -3862269883647758328L;

	@XStreamAlias("ArticleCount")
	@XStreamConverter(value = XStreamCDataConverter.class)
	private int articleCount;// 图文消息个数，限制为10条以内

	@XStreamAlias("Articles")
	@XStreamConverter(value = XStreamCDataConverter.class)
	private List<Article> articles;// 多条图文消息信息，默认第一个item为大图

	public int getArticleCount() {
		return this.articleCount;
	}

	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}

	public List<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
