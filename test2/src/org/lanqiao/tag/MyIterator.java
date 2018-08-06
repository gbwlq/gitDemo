package org.lanqiao.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class MyIterator extends TagSupport{
	
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public int doStartTag() throws JspException{
		return Tag.EVAL_BODY_INCLUDE;
	}
	public int doAferBody() throws JspException{
		num--;
		return num>0? EVAL_BODY_AGAIN:SKIP_BODY;
	}
	
}
