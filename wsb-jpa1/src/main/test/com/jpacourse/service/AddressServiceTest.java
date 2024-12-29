package com.jpacourse.service;

import com.jpacourse.dto.AddressTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressServiceTest {

    @Autowired
    private AddressService addressService;

    @Transactional
    @Test
    public void testShouldFindAddressById() {
        // given
        // when
        AddressTO addressTO = addressService.findById(1L);
        // then
        assertThat(addressTO).isNotNull();
        assertThat(addressTO.getId()).isEqualTo(1L);
    }

}
