package com.easylab.service.services;

import com.easylab.service.dto.InquiryDto;

public interface InquiryService {
    InquiryDto addInquiry(InquiryDto inquiryDto);

    InquiryDto findByInquiryId(Long inqId);
}
