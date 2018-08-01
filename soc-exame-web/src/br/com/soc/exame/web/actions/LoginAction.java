package br.com.soc.exame.web.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;


@Action(value = "login", results = {
		@Result(name = "SUCCESS", location = "/welcome.jsp"),
		@Result(name = "ERROR", location = "/error.jsp") })
@Namespaces(value={@Namespace("/User"),@Namespace("/")})
public class LoginAction {

	private String name;
	private String pwd;

	public String execute() throws Exception {
		if("admin".equals(getName()) && "admin".equals(getPwd()))
		return "SUCCESS";
		else return "ERROR";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
