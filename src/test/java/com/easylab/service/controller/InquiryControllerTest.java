package com.easylab.service.controller;

import com.easylab.service.dto.InquiryDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class InquiryControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private static final String NAME = "Nasruddin";
    private static final String MOBILE_NO = "9987353738";

    @Test
    void addInquiry() {

        InquiryDto inquiryDto = InquiryDto.builder().companyId(2L).emailId("nasruddinkhan44@gmail.com")
                .inqId(1L)
                .mobileNo("9987353738").status("Y").name("Nasruddin").build();
        URI targetUrl = UriComponentsBuilder.fromUriString("/api/enquiry/add")
                .build()
                .encode()
                .toUri();
        inquiryDto = restTemplate.postForObject(targetUrl, inquiryDto, InquiryDto.class);
        assertEquals(MOBILE_NO, inquiryDto.getMobileNo());

    }

    @Test
    void getInquiryById() {
        URI targetUrl = UriComponentsBuilder.fromUriString("/api/enquiry/1")
                .build()
                .encode()
                .toUri();
        InquiryDto inquiryDto = restTemplate.getForObject(targetUrl, InquiryDto.class);

        assertEquals(NAME, inquiryDto.getName());
    }

    @Test
    void updateInquiry() {
        String mobileNo = "9594757518";
        InquiryDto inquiryDto = InquiryDto.builder().companyId(2L).emailId("nasruddinkhan44@gmail.com")
                .mobileNo("9594757518").status("Y").name("Nasruddin").build();
        URI targetUrl = UriComponentsBuilder.fromUriString("/api/enquiry/1")
                .build()
                .encode()
                .toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<InquiryDto> entity = new HttpEntity<InquiryDto>(inquiryDto, headers);

        inquiryDto = restTemplate.exchange(targetUrl, HttpMethod.PUT, entity, InquiryDto.class).getBody();
        assertEquals(mobileNo, inquiryDto.getMobileNo());
    }
}