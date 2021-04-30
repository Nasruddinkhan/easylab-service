package com.easylab.service.services;

import com.easylab.service.dto.InquiryDto;

import java.util.List;

/**
 * @author Nasruddin
 */
public interface InquiryService {
    InquiryDto addInquiry(InquiryDto inquiryDto);

    InquiryDto findByInquiryId(Long inqId);

    InquiryDto updateInquiry(InquiryDto inquiryDto, Long inqId);

    void deleteInquiry(Long inqId);

    List<InquiryDto> findAllInquires();
}
