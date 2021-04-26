package com.easylab.service.controller;

import static com.easylab.service.constant.ApiConstant.CREATE_INQUIRY;
import static com.easylab.service.constant.ApiConstant.CREATED_STATUS;


import com.easylab.service.dto.InquiryDto;
import com.easylab.service.services.InquiryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController
@Tag(name = "InquiryController", description = "the InquiryController API with documentation annotations")
@RequestMapping("/api/enquiry")
@Slf4j
public class InquiryController {

    private final InquiryService inquiryService;

    @Autowired
    public InquiryController(InquiryService inquiryService) {
        this.inquiryService = inquiryService;
    }

    @Operation(summary = CREATE_INQUIRY)
    @ApiResponses(value = {
            @ApiResponse(responseCode = CREATED_STATUS, description = "inquiry created", content = {@
                    Content(mediaType = "application/json", schema = @Schema(implementation = InquiryDto.class))}),
            @ApiResponse(responseCode = "404", description = "Bad request", content = @Content)})
    @PostMapping("/add")
    public ResponseEntity<InquiryDto> addInquiry(@RequestBody @Valid InquiryDto inquiryDto) {
        HttpHeaders httpHeaders = new HttpHeaders();
        inquiryDto = inquiryService.addInquiry(inquiryDto);
        httpHeaders.setLocation(linkTo(InquiryController.class).slash(inquiryDto.getInqId()).toUri());
        return new ResponseEntity<>(inquiryDto, httpHeaders, HttpStatus.CREATED);
    }

    @Operation(summary = "Get a Inquiry by Inquiry id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "found the Inquiry", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = InquiryDto.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied", content = @Content),
            @ApiResponse(responseCode = "404", description = "Inquiry not found", content = @Content)})
    @GetMapping("/{inqId}")
    public ResponseEntity<InquiryDto> getInquiryById(@Parameter(description = "InqId of Inquiry to be searched")
                                                     @PathVariable Long inqId) {
        InquiryDto inquiryDto = inquiryService.findByInquiryId(inqId);
        return new ResponseEntity<>(inquiryDto, HttpStatus.OK);
    }
}
