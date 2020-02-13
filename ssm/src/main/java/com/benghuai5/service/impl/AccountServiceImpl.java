package com.benghuai5.service.impl;

import com.benghuai5.dao.AccountDao;
import com.benghuai5.domain.Account;
import com.benghuai5.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * spring成功整合myBatis的标志:能在service成功操作dao
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层:查询所有用户");
        List<Account> list = accountDao.findAll();
        return list;
    }

    @Override
    public void savaAccount(Account account) {
        System.out.println("业务层:保存新用户");
        accountDao.savaAccount(account);
    }
}
