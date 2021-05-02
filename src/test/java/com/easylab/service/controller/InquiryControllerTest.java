package com.easylab.service.controller;

import com.easylab.service.dto.InquiryDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.web.util.UriComponentsBuilder.fromUriString;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class InquiryControllerTest {
    private final TestRestTemplate restTemplate;
    private transient static final String NAME = "Nasruddin";
    private transient static final String MOBILE_NO = "9987353738";

    @Autowired
    InquiryControllerTest(TestRestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Test
    void addInquiry() {

        InquiryDto inquiryDto;
        InquiryDto.InquiryDtoBuilder builder = InquiryDto.builder();
        builder.companyId(2L);
        builder.emailId("nasruddinkhan44@gmail.com");
        builder.inqId(1L);
        builder.mobileNo("9987353738");
        builder.status("Y");
        builder.name("Nasruddin");
        inquiryDto = builder.build();
        final URI targetUrl = fromUriString("/api/enquiry/add")
                .build()
                .encode()
                .toUri();
        inquiryDto = restTemplate.postForObject(targetUrl, inquiryDto, InquiryDto.class);
        assertEquals(MOBILE_NO, inquiryDto.getMobileNo());

    }

    @Test
    void getInquiryById() {
        URI targetUrl = fromUriString("/api/enquiry/1")
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
        URI targetUrl = fromUriString("/api/enquiry/1")
                .build()
                .encode()
                .toUri();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<InquiryDto> entity = new HttpEntity<>(inquiryDto, headers);

        inquiryDto = restTemplate.exchange(targetUrl, HttpMethod.PUT, entity, InquiryDto.class).getBody();
        assert inquiryDto != null;
        assertEquals(mobileNo,
                inquiryDto.getMobileNo());
    }
}