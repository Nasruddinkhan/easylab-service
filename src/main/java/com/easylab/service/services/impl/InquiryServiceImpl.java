package com.easylab.service.services.impl;

import com.easylab.service.dto.InquiryDto;
import com.easylab.service.entity.Inquiry;
import com.easylab.service.enums.ApplicationErrors;
import com.easylab.service.enums.ApplicationStatus;
import com.easylab.service.exception.NotFoundException;
import com.easylab.service.repsoitory.InquiryRepository;
import com.easylab.service.services.InquiryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.easylab.service.util.ObjectUtilMapper.map;
import static com.easylab.service.util.ObjectUtilMapper.mapAll;

/**
 * @author Nasruddin
 */
@Service
@Transactional
@Slf4j
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

    private Inquiry findInquiryById(Long inqId) {
        return inquiryRepository.findById(inqId).orElseThrow(() ->
                new NotFoundException(ApplicationErrors.INQ_ID_NOT_FOUND.getValue()));
    }

    /**
     * @param inqId
     * @return
     */
    @Override
    public InquiryDto findByInquiryId(Long inqId) {
        Inquiry inquiry = findInquiryById(inqId);
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

    /**
     * @param inqId
     */
    @Override
    public void deleteInquiry(Long inqId) {
        Inquiry inquiry = findInquiryById(inqId);
        inquiry.setStatus(ApplicationStatus.INACTIVE.getValue());
        inquiryRepository.save(inquiry);
    }

    @Override
    public List<InquiryDto> findAllInquires() {
        List<Inquiry> inquiries = inquiryRepository.findAll();
        return mapAll(inquiries, InquiryDto.class);
    }
}
