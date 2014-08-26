package org.plivo.ee.helper.api.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "meta")
public class ApiReponseMeta {
	public String limit;
	public String next;
	public String offset;
	public String previous;
	public String total_count;

	@Override
	public String toString() {
		return "ApiReponseMeta ["
				+ (limit != null ? "limit=" + limit + ", " : "")
				+ (next != null ? "next=" + next + ", " : "")
				+ (offset != null ? "offset=" + offset + ", " : "")
				+ (previous != null ? "previous=" + previous + ", " : "")
				+ (total_count != null ? "total_count=" + total_count : "")
				+ "]";
	}

}
