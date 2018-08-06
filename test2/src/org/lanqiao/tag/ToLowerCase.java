package org.lanqiao.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class ToLowerCase extends BodyTagSupport{
	@Override
	public int doEndTag() throws JspException {
		String content=getBodyContent().getString();
		content=content.toLowerCase();
		try {
			bodyContent.getEnclosingWriter().write(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doEndTag();
	}
}
