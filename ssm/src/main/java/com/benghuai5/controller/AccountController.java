package com.benghuai5.controller;

import com.benghuai5.domain.Account;
import com.benghuai5.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户控制器
 *
 * springf成功整合springmvc的标志是:能在controller成功操作service
 *
 *
 *
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    /**
     * 测试查询
     */
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("findAll....");
        //调用service方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("save....");
        accountService.savaAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return ;
    }







}
