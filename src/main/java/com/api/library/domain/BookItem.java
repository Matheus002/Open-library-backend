package com.api.library.domain;

import java.util.Date;

import com.api.library.domain.enums.Format;
import com.api.library.domain.enums.Language;

public class BookItem {
	
	private Integer id;
	private String barcode;
	private String tag;
	private String isbn;
	private String subject;
	private String title;
	private Boolean isReferenceOnly;
	private Language language;
	private Integer numberOfPages;
	private Format format;
	private Date borrowed;
	private Integer loanPeriod;
	private Date dueDate;
	

}
