package com.example.demo.repository;

import com.example.demo.model.dto.request.AddRecordDto;
import com.example.demo.model.dto.request.ChangeRecordDto;
import com.example.demo.model.dto.response.SelectRecordResponseDto;

import java.util.List;

public interface RecordRepository {
    void save (AddRecordDto record);
    List<SelectRecordResponseDto> findByRecordSelectDto(int StudentId, String subject, int year);
    List<SelectRecordResponseDto> findByExamId(int examId);
    void update (ChangeRecordDto dto);
    void delete(int recordId);
}