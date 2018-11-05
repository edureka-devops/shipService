package org.edureka.shipping;

import java.util.Date;

public class Shipment {
	int resourceId;
	Date shipmentDate;
	Date expiryDate;
	String deliveryText;
	Order order;
	ShipmentLocation shipmentLocation;
	Date deliveryDate;
	int trackigNumber;
	int chargeAmount;

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public Date getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getDeliveryText() {
		return deliveryText;
	}

	public void setDeliveryText(String deliveryText) {
		this.deliveryText = deliveryText;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public ShipmentLocation getShipmentLocation() {
		return shipmentLocation;
	}

	public void setShipmentLocation(ShipmentLocation shipmentLocation) {
		this.shipmentLocation = shipmentLocation;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public int getTrackigNumber() {
		return trackigNumber;
	}

	public void setTrackigNumber(int trackigNumber) {
		this.trackigNumber = trackigNumber;
	}

	public int getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(int chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	static class ShipmentLocation {
		String firstName;
		String lastName;
		String streetAddress;
		int Pincode;
	}

	static class Order {
		int resourceId;
	}

}
