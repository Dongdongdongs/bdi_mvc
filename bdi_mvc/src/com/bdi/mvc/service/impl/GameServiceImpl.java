package com.bdi.mvc.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bdi.mvc.common.DBCon;
import com.bdi.mvc.dao.GameDAO;
import com.bdi.mvc.dao.impl.GameDAOImpl;
import com.bdi.mvc.service.GameService;
import com.bdi.mvc.vo.Game;

public class GameServiceImpl implements GameService {
	GameDAO gd = new GameDAOImpl();
	@Override
	public List<Game> gameList(Game game) throws SQLException {
		gd.setConnection(DBCon.getCon());
		return gd.gameList(null);
	}
	@Override
	public Map<String, Object> gameInsert(Game game) throws SQLException {
		gd.setConnection(DBCon.getCon());
		try {
			int cnt = gd.gameInsert(game);
			Map<String, Object> rMap = new HashMap<String, Object>();
			rMap.put("cnt", cnt);
			rMap.put("msg", "저장이 실패했어요");
			if(cnt==1) {
				rMap.put("msg", "저장 성공했어요~~");
			}
			return rMap;
		} catch(SQLException e) {
			throw e;
		}
		finally {
			DBCon.close();
		}
	}
	@Override
	public Map<String, Object> gameUpdate(Game game) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<String, Object> gameDelete(Game game) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Game gameView(Game game) throws SQLException {
		gd.setConnection(DBCon.getCon());
		try {
			return gd.gameView(game);
		} catch(SQLException e) {
			throw e;
		}
		finally {
			DBCon.close();
		}
		
	}
}
