package com.benghuai5.service;

import com.benghuai5.domain.Account;

import java.util.List;

public interface AccountService {

    //查询所有账户信息
    public List<Account> findAll();

    //保存账户信息
    public void savaAccount(Account account);


}