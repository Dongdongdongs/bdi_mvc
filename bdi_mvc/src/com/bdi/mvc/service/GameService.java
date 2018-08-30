package com.bdi.mvc.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.bdi.mvc.vo.Game;

public interface GameService {
	
	public List<Game> gameList(Game game) throws SQLException;
	public Map<String, Object> gameInsert(Game game) throws SQLException;
	public Map<String, Object> gameUpdate(Game game) throws SQLException;
	public Map<String, Object> gameDelete(Game game) throws SQLException;
	public Game gameView(Game game) throws SQLException;
}
