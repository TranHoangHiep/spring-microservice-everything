package com.hoanghiep.accounts.service.impl;

import com.hoanghiep.accounts.dto.CustomerDto;
import com.hoanghiep.accounts.repository.AccountsRepository;
import com.hoanghiep.accounts.repository.CustomerRepository;
import com.hoanghiep.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
