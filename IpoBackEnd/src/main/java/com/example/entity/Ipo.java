package com.example.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Ipo_detail")
public class Ipo {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int issueSize;
	private int priceRange;
	private int minAmt;
	private int lotsize;
	private int listedPrice;
	private Date issueDate;
	private Date listedDate;
	private int listingGain;
	public Ipo(int id, String name, int issueSize, int priceRange, int minAmt, int lotsize, int listedPrice,
			Date issueDate, Date listedDate, int listingGain) {
		super();
		this.id = id;
		this.name = name;
		this.issueSize = issueSize;
		this.priceRange = priceRange;
		this.minAmt = minAmt;
		this.lotsize = lotsize;
		this.listedPrice = listedPrice;
		this.issueDate = issueDate;
		this.listedDate = listedDate;
		this.listingGain = listingGain;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIssueSize() {
		return issueSize;
	}
	public void setIssueSize(int issueSize) {
		this.issueSize = issueSize;
	}
	public int getPriceRange() {
		return priceRange;
	}
	public void setPriceRange(int priceRange) {
		this.priceRange = priceRange;
	}
	public int getListingGain() {
		return listingGain;
	}
	public void setListingGain(int listingGain) {
		this.listingGain = listingGain;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRange() {
		return priceRange;
	}
	public void setRange(int range) {
		this.priceRange
		= range;
	}
	public int getMinAmt() {
		return minAmt;
	}
	public void setMinAmt(int minAmt) {
		this.minAmt = minAmt;
	}
	public int getLotsize() {
		return lotsize;
	}
	public void setLotsize(int lotsize) {
		this.lotsize = lotsize;
	}
	public int getListedPrice() {
		return listedPrice;
	}
	public void setListedPrice(int listedPrice) {
		this.listedPrice = listedPrice;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getListedDate() {
		return listedDate;
	}
	public void setListedDate(Date listedDate) {
		this.listedDate = listedDate;
	}
	public Ipo(String name, int range, int minAmt, int lotsize, int listedPrice, Date issueDate, Date listedDate) {
		super();
		this.name = name;
		this.priceRange = range;
		this.minAmt = minAmt;
		this.lotsize = lotsize;
		this.listedPrice = listedPrice;
		this.issueDate = issueDate;
		this.listedDate = listedDate;
	}
	public Ipo() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
}
