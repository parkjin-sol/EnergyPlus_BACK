package com.kh.ecolog.market.report.model.dao;

import org.apache.ibatis.annotations.Mapper;

import com.kh.ecolog.market.report.model.dto.MarketReportDTO;


@Mapper
public interface MarketReportMapper {
	void insertMarketReport(MarketReportDTO dto);
}
