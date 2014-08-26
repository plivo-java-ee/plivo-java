package org.plivo.ee.helper.api.response.call;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class CDRMeta implements Serializable {

	private static final long serialVersionUID = 1L;

	private String previous;

	@SerializedName("total_count")
	private Integer totalCount;

	private Integer offset;

	private Integer limit;

	private String next;

	public CDRMeta() {
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}
}
