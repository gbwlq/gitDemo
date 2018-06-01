package org.lanqiao.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MySimpleIterator extends SimpleTagSupport{
	private int num ;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	//对标签进行逻辑处理
	@Override
	public void doTag() throws JspException, IOException {
		//获取标签体
		JspFragment fragment=super.getJspBody();
		for(int i=0;i<num;i++) {
			fragment.invoke(null);
		}
		
		super.doTag();
	}
}
