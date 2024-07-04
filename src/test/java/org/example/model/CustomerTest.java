package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author chankokwai
 * @project SimpleJavaAppForAutomate
 * @date 4/7/24
 */
class CustomerTest {
    private Customer testCustomer;

    @BeforeEach
    void setUp() {
        testCustomer = createCustomer();
    }

    @Test
    void Get_FirstName_From_Customer() {
        String expectedFirstName = "Lawrence";
        assertEquals(expectedFirstName, testCustomer.getFirstName());
    }

    @Test
    void Get_LastName_From_Customer() {
        String expectedLastName = "Chan";
        assertEquals(expectedLastName, testCustomer.getLastName());
    }

    @Test
    void Get_BirthDate_From_Customer() {
        LocalDate expectedBirthDate = LocalDate.of(1980, 7, 21);
        assertEquals(expectedBirthDate, testCustomer.getBirthDate());
    }

    @Test
    void Get_Address_From_Customer() {
        String expectedBlk = "232C";
        int expectedStorey = 7;
        int expectedUnit = 367;
        String expectedStreet = "Sumang Lane";
        int expectedZipCode = 823232;

        assertEquals(expectedBlk, testCustomer.getAddress().getBlkNum());
        assertEquals(expectedStorey, testCustomer.getAddress().getStorey());
        assertEquals(expectedUnit, testCustomer.getAddress().getUnitNum());
        assertEquals(expectedStreet, testCustomer.getAddress().getStreet());
        assertEquals(expectedZipCode, testCustomer.getAddress().getZipCode());
    }

    private Customer createCustomer() {
        Customer customer = new Customer();
        customer.setFirstName("Lawrence");
        customer.setLastName("Chan");

        Address address = createAddress();
        customer.setAddress(address);

        customer.setBirthDate(LocalDate.of(1980, 7, 21));
        return customer;
    }

    private Address createAddress() {
        Address address = new Address();
        address.setBlkNum("232C");
        address.setStorey(7);
        address.setUnitNum(367);
        address.setStreet("Sumang Lane");
        address.setZipCode(823232);

        return address;
    }
}