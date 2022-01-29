package com.ezen.board.controller;

import com.ezen.board.controller.action.Action;
import com.ezen.board.controller.action.AddReplyAction;
import com.ezen.board.controller.action.BoardCheckPassAction;
import com.ezen.board.controller.action.BoardDeleteAction;
import com.ezen.board.controller.action.BoardListAction;
import com.ezen.board.controller.action.BoardPassFormAction;
import com.ezen.board.controller.action.BoardUpdateAction;
import com.ezen.board.controller.action.BoardUpdateFormAction;
import com.ezen.board.controller.action.BoardViewAction;
import com.ezen.board.controller.action.BoardViewWithoutCountAction;
import com.ezen.board.controller.action.BoardWriteAction;
import com.ezen.board.controller.action.BoardWriteFormAction;
import com.ezen.board.controller.action.DeleteReplyAction;
import com.ezen.board.controller.action.EditAction;
import com.ezen.board.controller.action.EditFormAction;
import com.ezen.board.controller.action.IdCheckAction;
import com.ezen.board.controller.action.JoinAction;
import com.ezen.board.controller.action.JoinFromAction;
import com.ezen.board.controller.action.LoginAction;
import com.ezen.board.controller.action.LoginFormAction;
import com.ezen.board.controller.action.LogoutAction;

public class ActionFactory {

	private ActionFactory() {}
	private static ActionFactory ist = new ActionFactory();
	public static ActionFactory getInstance() { return ist;}
	
	public Action getAction(String command) {
		Action ac = null;
		
		if( command.equals("loginForm")) ac = new LoginFormAction();
		else if( command.equals("login") ) ac = new LoginAction();
		else if( command.equals("boardlist") ) ac = new BoardListAction();
		else if( command.equals("joinForm") ) ac = new JoinFromAction();
		else if( command.equals("join") ) ac = new JoinAction();
		else if( command.equals("idcheck") ) ac = new IdCheckAction();
		else if( command.equals("editMemberForm")) ac = new EditFormAction();
		else if( command.equals("editMember")) ac = new EditAction();
		else if( command.equals("logout")) ac = new LogoutAction();
		else if( command.equals("boardWriteForm")) ac = new BoardWriteFormAction();
		else if( command.equals("boardwrite")) ac = new BoardWriteAction();
		else if( command.equals("boardView")) ac = new BoardViewAction();
		else if( command.equals("boardPassForm") ) ac = new BoardPassFormAction();
		else if( command.equals("boardCheckPass") ) ac = new BoardCheckPassAction();
		else if( command.equals("boardUpdateForm") ) ac = new BoardUpdateFormAction();
		else if( command.equals("boardviewwithoutcount")) ac = new BoardViewWithoutCountAction();
		else if( command.equals("boardupdate") ) ac = new BoardUpdateAction();
		else if( command.equals("boardDelete") ) ac = new BoardDeleteAction();
		else if( command.equals("addreply") ) ac = new AddReplyAction();
		else if( command.equals("deleteReply") ) ac = new DeleteReplyAction();
		
		return ac;
	}
	
	
}
