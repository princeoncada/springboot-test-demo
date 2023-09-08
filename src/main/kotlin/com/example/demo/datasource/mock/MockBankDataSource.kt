package com.example.demo.datasource.mock

import com.example.demo.datasource.BankDataSource
import com.example.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {

    val banks = listOf(
            Bank("1234", 3.14, 17),
            Bank("3243", 132.14, 134),
            Bank("2312", 543.134, 1709)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}