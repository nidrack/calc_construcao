package entities;

public class House {

	private Double area;
	private Double cub;
	private Double bdi;

	public House() {
	}

	public House(Double area, Double cub, Double bdi) {
		this.area = area;
		this.cub = cub;
		this.bdi = bdi;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getCub() {
		return cub;
	}

	public void setCub(Double cub) {
		this.cub = cub;
	}

	public Double getBdi() {
		return bdi;
	}

	public void setBdi(Double bdi) {
		this.bdi = bdi;
	}
	
	public double price() {
		return area * cub;
	}

	public double finalPrice() {
		return area * cub * (1 + bdi / 100);
	}

}
