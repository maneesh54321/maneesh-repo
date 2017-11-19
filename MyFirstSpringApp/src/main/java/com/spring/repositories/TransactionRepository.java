package com.spring.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.spring.model.Transaction;

public interface TransactionRepository extends ElasticsearchRepository<Transaction, String>{

}
