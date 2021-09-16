package entities;

public class Terrain {

	private Double area;
	private Double cost;
	private Double sum;
	
	public Terrain () {
	}

	public Terrain(Double area, Double cost) {
		this.area = area;
		this.cost = cost;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public double price() {
		return area * cost;
	}
	
	public String toString() {
		return String.format("%.2f", price());
	}

}
