package imooc.listener;

import imooc.entity.User;
import imooc.util.SessionUtil;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.ArrayList;

@WebListener
public class MyHttpSessionListener implements HttpSessionListener {
	
	private int userNumber = 0;
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		userNumber++;
		arg0.getSession().getServletContext().setAttribute("userNumber", userNumber);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		userNumber--;
		arg0.getSession().getServletContext().setAttribute("userNumber", userNumber);
		
		ArrayList<User> userList = null;
		
		userList = (ArrayList<User>)arg0.getSession().getServletContext().getAttribute("userList");
		
		if(SessionUtil.getUserBySessionId(userList, arg0.getSession().getId())!=null){
			userList.remove(SessionUtil.getUserBySessionId(userList, arg0.getSession().getId()));
		}
	}
}
