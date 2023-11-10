package com.banc.accounts.service;

import com.banc.accounts.dto.CustomerDto;
import com.banc.accounts.entities.Customer;

public interface IAccountService {
    /**
     *
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
