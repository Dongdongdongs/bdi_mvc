package com.bdi.mvc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.bdi.mvc.vo.Game;

public interface GameDAO {

	public void setConnection(Connection con);
	public List<Game> gameList(Game game) throws SQLException;
	public int gameInsert(Game game) throws SQLException;
	public int gameUpdate(Game game) throws SQLException;
	public int gameDelete(Game game) throws SQLException;
	public Game gameView(Game game) throws SQLException;
}
