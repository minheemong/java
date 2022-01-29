package com.ezenac.controller;

import com.ezenac.controller.action.Action;
import com.ezenac.controller.action.CartDelete;
import com.ezenac.controller.action.CartInsertAction;
import com.ezenac.controller.action.CartListAction;
import com.ezenac.controller.action.CategoryAction;
import com.ezenac.controller.action.ContractAction;
import com.ezenac.controller.action.FindIdForm;
import com.ezenac.controller.action.FindIdPwdAction;
import com.ezenac.controller.action.FindIdStep1Action;
import com.ezenac.controller.action.FindIdStep2Action;
import com.ezenac.controller.action.FindPwFormAction;
import com.ezenac.controller.action.FindPwStep1Action;
import com.ezenac.controller.action.FindPwStep2Action;
import com.ezenac.controller.action.FindZipNumAction;
import com.ezenac.controller.action.IdCheckFormAction;
import com.ezenac.controller.action.IndexAction;
import com.ezenac.controller.action.JoinAction;
import com.ezenac.controller.action.JoinFormAction;
import com.ezenac.controller.action.LoginAction;
import com.ezenac.controller.action.LoginFormAction;
import com.ezenac.controller.action.LogoutAction;
import com.ezenac.controller.action.MEditFormAction;
import com.ezenac.controller.action.MemberUpdateAction;
import com.ezenac.controller.action.MyPageAction;
import com.ezenac.controller.action.OrderAllAction;
import com.ezenac.controller.action.OrderDetailAction;
import com.ezenac.controller.action.OrderInsertAction;
import com.ezenac.controller.action.OrderListAction;
import com.ezenac.controller.action.ProductDetailAction;
import com.ezenac.controller.action.QnaListAction;
import com.ezenac.controller.action.QnaViewAction;
import com.ezenac.controller.action.QnaWriteAction;
import com.ezenac.controller.action.QnaWriteFormAction;
import com.ezenac.controller.action.ResetPwAction;
import com.ezenac.controller.admin.action.AdminAction;
import com.ezenac.controller.admin.action.AdminLoginAction;
import com.ezenac.controller.admin.action.AdminOrderListAction;
import com.ezenac.controller.admin.action.AdminOrderSaveAction;
import com.ezenac.controller.admin.action.AdminProductDetailAction;
import com.ezenac.controller.admin.action.AdminProductListAction;
import com.ezenac.controller.admin.action.AdminProductUpdateAction;
import com.ezenac.controller.admin.action.AdminProductUpdateFormAction;
import com.ezenac.controller.admin.action.AdminProductWriteAction;
import com.ezenac.controller.admin.action.AdminProductWriteFormAction;
import com.ezenac.controller.admin.action.AdminQnaDetailAction;
import com.ezenac.controller.admin.action.AdminQnaListAction;
import com.ezenac.controller.admin.action.AdminQnaRepsaveAction;

public class ActionFactory {
	private ActionFactory() {}
	private static ActionFactory ist = new ActionFactory();
	public static ActionFactory getInstance() {return ist;}
	
	public Action getAction(String command) {
		Action ac = null;

		if(command.equals("index")) ac = new IndexAction();
		else if (command.equals("loginForm")) ac = new LoginFormAction();
		else if (command.equals("login")) ac = new LoginAction();
		else if (command.equals("contract")) ac = new ContractAction();
		else if (command.equals("joinForm")) ac = new JoinFormAction();
		else if (command.equals("idCheckForm")) ac = new IdCheckFormAction();
		else if (command.equals("findZipNum")) ac = new FindZipNumAction();
		else if (command.equals("join")) ac = new JoinAction();
		else if (command.equals("logout")) ac = new LogoutAction();
		else if (command.equals("mEditForm")) ac = new MEditFormAction();
		else if (command.equals("memberUpdate")) ac = new MemberUpdateAction();
		else if (command.equals("findIdPwd")) ac = new FindIdPwdAction();
		else if(command.equals("findIdForm")) ac = new FindIdForm();
		else if(command.equals("findIdStep1")) ac = new FindIdStep1Action();
		else if(command.equals("findIdStep2")) ac = new FindIdStep2Action();
		else if(command.equals("findPwForm")) ac = new FindPwFormAction();
		else if(command.equals("findPwStep1")) ac = new FindPwStep1Action();
		else if(command.equals("findPwStep2")) ac = new FindPwStep2Action();
		else if(command.equals("resetPw")) ac = new ResetPwAction();
		else if(command.equals("productDetail")) ac = new ProductDetailAction();
		else if(command.equals("category")) ac = new CategoryAction();
		else if(command.equals("cartInsert")) ac = new CartInsertAction();
		else if(command.equals("cartList")) ac = new CartListAction();
		else if(command.equals("cartDelete")) ac = new CartDelete();
		else if(command.equals("orderInsert")) ac = new OrderInsertAction();
		else if(command.equals("orderList")) ac = new OrderListAction();
		else if(command.equals("myPage")) ac = new MyPageAction();
		else if(command.equals("orderAll")) ac = new OrderAllAction();
		else if(command.equals("qnaList")) ac = new QnaListAction();
		else if(command.equals("qnaWriteForm")) ac = new QnaWriteFormAction();
		else if(command.equals("qnaWrite")) ac = new QnaWriteAction();
		else if(command.equals("qnaView")) ac = new QnaViewAction();
		else if(command.equals("orderDetail")) ac = new OrderDetailAction();
		else if(command.equals("admin")) ac = new AdminAction();
		else if(command.equals("adminLogin")) ac = new AdminLoginAction();
		else if(command.equals("adminProductList")) ac = new AdminProductListAction();
		else if(command.equals("adminProductWriteForm")) ac = new AdminProductWriteFormAction();
		else if(command.equals("adminProductList")) ac = new AdminProductListAction();
		else if(command.equals("adminProductWrite")) ac = new AdminProductWriteAction();
		else if(command.equals("adminProductDetail")) ac = new AdminProductDetailAction();
		else if(command.equals("adminProductUpdateForm")) ac = new AdminProductUpdateFormAction();
		else if(command.equals("adminProductUpdate")) ac = new AdminProductUpdateAction();
		else if(command.equals("adminOrderList")) ac = new AdminOrderListAction();
		else if(command.equals("adminOrderSave")) ac = new AdminOrderSaveAction();
		else if(command.equals("adminQnaList")) ac = new AdminQnaListAction();
		else if(command.equals("adminQnaDetail")) ac = new AdminQnaDetailAction();
		else if(command.equals("adminQnaRepsave")) ac = new AdminQnaRepsaveAction();
				
		
		return ac;
	}
}
