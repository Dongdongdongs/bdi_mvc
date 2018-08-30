package com.bdi.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bdi.mvc.common.DBCon;
import com.bdi.mvc.dao.GameDAO;
import com.bdi.mvc.vo.Game;



public class GameDAOImpl implements GameDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	@Override
	public void setConnection(Connection con) {
		this.con = con;
	}
	@Override
	public List<Game> gameList(Game game) throws SQLException{
		List<Game> gl = new ArrayList<Game>();
		
		try {
			String sql = "select * from game_chart";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Game g = new Game(rs.getInt("gcNum"), rs.getString("gcName"), rs.getInt("gcPrice"), rs.getString("gcVender"),
						rs.getInt("gcOrder"), rs.getString("gcDesc"), rs.getString("gcImg"));
				gl.add(g);
			}
		return gl;
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}

	@Override
	public int gameInsert(Game game) throws SQLException {
		try {
			String sql = "insert into game_chart(gcName, gcPrice, gcVender, gcOrder, gcDesc, gcImg) ";
			sql += "values(?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, game.getGcName());
			ps.setInt(2, game.getGcPrice());
			ps.setString(3, game.getGcVender());
			ps.setInt(4, game.getGcOrder());
			ps.setString(5, game.getGcDesc());
			ps.setString(6, game.getGcImg());
			return ps.executeUpdate();
		} catch(SQLException e){
			throw e;
		}
	}

	@Override
	public int gameUpdate(Game game) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int gameDelete(Game game) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Game gameView(Game game) throws SQLException {
		try {
			String sql = "select * from game_chart where gcNum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, game.getGcNum());
			rs = ps.executeQuery();
			if(rs.next()) {
				return new Game(rs.getInt("gcNum"), rs.getString("gcName"), rs.getInt("gcPrice"), rs.getString("gcVender"),
						rs.getInt("gcOrder"), rs.getString("gcDesc"), rs.getString("gcImg"));
				}	
		} catch(SQLException e) {
			throw e;
		}
		return null;
	}
}

