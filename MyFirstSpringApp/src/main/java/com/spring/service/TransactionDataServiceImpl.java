package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.spring.VO.TransactionVO;
import com.spring.repositories.TransactionRepository;

@Service
public class TransactionDataServiceImpl {
	
	@Autowired
	private TransactionRepository txnRepository;
	
	public Page<TransactionVO> getAllTransactions(Pageable pageable) {
		return txnRepository.findAll(pageable).map(transaction->{
			TransactionVO vo=new TransactionVO();
			vo.setTransactionId(transaction.getTransactionId());
			vo.setTransactionType(transaction.getTransactionType());
			vo.setStatus(transaction.getStatus());
			vo.setHealth(transaction.getHealth());
			vo.setCriticality(transaction.getCriticality());
			return vo;
		});
	}
}
