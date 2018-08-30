package com.bdi.mvc.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdi.mvc.common.DBCon;
import com.bdi.mvc.service.GameService;
import com.bdi.mvc.service.impl.GameServiceImpl;
import com.bdi.mvc.vo.Game;
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	GameService gs = new GameServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = "/views" + request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/")+1);
		try {
			if(cmd.equals("gameList")) {
					request.setAttribute("gameList", gs.gameList(null));
			} else if(cmd.equals("gameView") || cmd.equals("gameUpdate")) {
				String gcNumstr = request.getParameter("gcNum");
				Game game = new Game();
				game.setGcNum(Integer.parseInt(gcNumstr));
				request.setAttribute("game", gs.gameView(game));				
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = "/views" + request.getRequestURI();
		String cmd = uri.substring(uri.lastIndexOf("/")+1); 
		request.setCharacterEncoding("utf-8");
		try {
			if(cmd.equals("gameInsert")) {
				String gcName = request.getParameter("gcName");
				int gcPrice = Integer.parseInt(request.getParameter("gcPrice"));
				String gcVender = request.getParameter("gcVender");
				int gcOrder = Integer.parseInt(request.getParameter("gcOrder"));
				String gcDesc = request.getParameter("gcDesc");
				String gcImg = request.getParameter("gcImg");
				Game game = new Game(0, gcName, gcPrice, gcVender, gcOrder, gcDesc, gcImg);
				
				request.setAttribute("rMap", gs.gameInsert(game));
			}else if(cmd.equals("나")){
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}

}
