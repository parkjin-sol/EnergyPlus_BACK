package com.kh.ecolog.mymarket.model.dto;

import java.sql.Date;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MyMarketDTO {
	private Long marketNo;
    private Long userId;
    private String userName;
    private String marketTitle;
    private String marketContent;
    private Date marketDate;
    private String marketStatus;
    private Long marketPrice;
    private String marketStatusLabel;
    private String thumbnailUrl;
    private List<MyMarketImageDTO> imageList;
    private List<String> keepImageUrls;
}
