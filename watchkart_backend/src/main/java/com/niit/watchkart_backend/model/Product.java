package com.niit.watchkart_backend.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Entity
@Component
@Table(name="Product")
public class Product  {
	
	@Id
	private String pid;
	private String pname;
	private String pprice;
	private String pcategoryid;
	private String pstatus;
	private String poffer;
	private String psupplierid;
	@Transient
	private MultipartFile img;
	
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPprice() {
		return pprice;
	}
	public void setPprice(String pprice) {
		this.pprice = pprice;
	}
	public String getPcategoryid() {
		return pcategoryid;
	}
	public void setPcategoryid(String pcategoryid) {
		this.pcategoryid = pcategoryid;
	}
	public String getPstatus() {
		return pstatus;
	}
	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}
	public String getPoffer() {
		return poffer;
	}
	public void setPoffer(String poffer) {
		this.poffer = poffer;
	}
	public String getPsupplierid() {
		return psupplierid;
	}
	public void setPsupplierid(String psupplierid) {
		this.psupplierid = psupplierid;
	}
	public MultipartFile getImg() {
		return img;
	}
	public void setImg(MultipartFile img) {
		this.img = img;
	}
	
}

