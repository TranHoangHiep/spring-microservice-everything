package com.hoanghiep.accounts.service;

import com.hoanghiep.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     * Create a new account
     *
     * @param customerDto the customer to create the account for
     */
    void createAccount(CustomerDto customerDto);


    CustomerDto fetchAccount(String mobileNumber);


    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
