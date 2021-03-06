package com.hanains.mysite.http.action.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.http.HttpUtil;
import com.hanains.http.action.Action;
import com.hanains.mysite.dao.BoardDao;
import com.hanains.mysite.vo.BoardVo;

public class ModifyAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
Long no = new Long( request.getParameter( "no" ) );
		
		// 게시물 가져오기
		BoardDao dao = new BoardDao();
		BoardVo vo = dao.get( no );
		
		request.setAttribute( "board", vo );
		HttpUtil.forwarding(request, response, "/WEB-INF/views/board/modify.jsp");
	}

}
