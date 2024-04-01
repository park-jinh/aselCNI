package com.aselcni.lhs.service;

import java.util.List;

import com.aselcni.lhs.model.CustMst;

public interface CustMstService {

	int insertCust(CustMst custmst);

	int selectCntCust(CustMst custmst);

	List<CustMst> selectListCust(CustMst custMst);

	CustMst selectOneCust(CustMst custmst);

	int deleteOneCust(CustMst custMst);

	int updateOneCust(CustMst custMst);
	
}
