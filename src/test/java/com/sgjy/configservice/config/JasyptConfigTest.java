package com.sgjy.configservice.config;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class JasyptConfigTest {
    @Autowired
    private StringEncryptor jasyptStringEncryptor;

    @Test
    void _0_testInit() {
        assertThat( jasyptStringEncryptor ).isNotNull();
    }

    @Test
    void _1_encrypt_decrypt() {

        String orgText = "file://${user.home}/DEV/YsDeveloper/msa/git-local-repo";

        String encText = jasyptStringEncryptor.encrypt( orgText );

        log.error( "encText:: {}", encText );

        String decrypt = jasyptStringEncryptor.decrypt( encText );

        log.error( "decrypt:: {}", decrypt );

        assertEquals( orgText, decrypt );

    }
}