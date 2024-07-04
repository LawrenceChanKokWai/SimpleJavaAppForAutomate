package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author chankokwai
 * @project SimpleJavaAppForAutomate
 * @date 4/7/24
 */
class AddressTest {
    private Address testAddress;

    @BeforeEach
    void setUp() {
        testAddress = createAddress();
    }

    @Test
    void Get_Blk_From_Address() {
        String expectedBlk = "232C";
        assertEquals(expectedBlk, testAddress.getBlkNum());
    }

    @Test
    void Get_Storey_From_Address() {
        int expectedStorey = 7;
        assertEquals(expectedStorey, testAddress.getStorey());
    }

    @Test
    void Get_Unit_From_Address() {
        int expectedUnit = 367;
        assertEquals(expectedUnit, testAddress.getUnitNum());
    }

    @Test
    void Get_Street_From_Address() {
        String expectedAddress = "Sumang Lane";
        assertEquals(expectedAddress, testAddress.getStreet());
    }

    @Test
    void Get_ZipCode_From_Address() {
        int expectedZipCode = 823232;
        assertEquals(expectedZipCode, testAddress.getZipCode());
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