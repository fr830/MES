package com.numberONe.entity;

public class MatertialBasicInfor {
	private String itemId;//料号ID
	private String dosage;//单数量
	private String wasteRate;//损耗率
	private String reqNum;//总数
	private String itemName;//类型名字
	private String itemSpc;//备注
	private String itemUnit;//单位
	private String itemParam;//原材料 辅料 半成品
	private String taxPrice;//含税价
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getWasteRate() {
		return wasteRate;
	}
	public void setWasteRate(String wasteRate) {
		this.wasteRate = wasteRate;
	}
	public String getReqNum() {
		return reqNum;
	}
	public void setReqNum(String reqNum) {
		this.reqNum = reqNum;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemSpc() {
		return itemSpc;
	}
	public void setItemSpc(String itemSpc) {
		this.itemSpc = itemSpc;
	}
	public String getItemUnit() {
		return itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	public String getItemParam() {
		return itemParam;
	}
	public void setItemParam(String itemParam) {
		this.itemParam = itemParam;
	}
	public String getTaxPrice() {
		return taxPrice;
	}
	public void setTaxPrice(String taxPrice) {
		this.taxPrice = taxPrice;
	}
	@Override
	public String toString() {
		return "MatertialBasicInfor [itemId=" + itemId + ", dosage=" + dosage + ", wasteRate=" + wasteRate + ", reqNum="
				+ reqNum + ", itemName=" + itemName + ", itemSpc=" + itemSpc + ", itemUnit=" + itemUnit + ", itemParam="
				+ itemParam + ", taxPrice=" + taxPrice + "]";
	}
	
}
