package com.easylab.service.services.impl;

import com.easylab.service.dto.InquiryDto;
import com.easylab.service.entity.Inquiry;
import com.easylab.service.exception.NotFoundException;
import com.easylab.service.repsoitory.InquiryRepository;
import com.easylab.service.services.InquiryService;

import static com.easylab.service.util.ObjectUtilMapper.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Nasruddin
 */
@Service
@Transactional
public class InquiryServiceImpl implements InquiryService {
    private final InquiryRepository inquiryRepository;

    @Autowired
    public InquiryServiceImpl(InquiryRepository inquiryRepository) {
        this.inquiryRepository = inquiryRepository;
    }

    /**
     * @param inquiryDto
     * @return
     */
    @Override
    public InquiryDto addInquiry(InquiryDto inquiryDto) {
        Inquiry inquiry = map(inquiryDto, Inquiry.class);
        inquiry = inquiryRepository.save(inquiry);
        return map(inquiry, InquiryDto.class);
    }

    /**
     * @param inqId
     * @return
     */
    @Override
    public InquiryDto findByInquiryId(Long inqId) {
        Inquiry inquiry = inquiryRepository.findById(inqId).orElseThrow(() ->
                new NotFoundException(inqId + "inquiry not found"));
        return map(inquiry, InquiryDto.class);
    }

    /**
     * @param inquiryDto
     * @param inqId
     * @return
     */
    @Override
    public InquiryDto updateInquiry(InquiryDto inquiryDto, Long inqId) {
        findByInquiryId(inqId);
        inquiryDto.setInqId(inqId);
        return addInquiry(inquiryDto);
    }
}
