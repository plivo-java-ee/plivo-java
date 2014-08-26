package org.plivo.ee.helper.api.response.application;

import java.io.Serializable;

public class ApplicationMeta implements Serializable {

	private static final long serialVersionUID = 1L;
    private String previous;
    private Integer total_count;
    private Integer offset;
    private Integer limit;
    private String next;
    
    public ApplicationMeta() {
    }

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public Integer getTotal_count() {
		return total_count;
	}

	public void setTotal_count(Integer total_count) {
		this.total_count = total_count;
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
