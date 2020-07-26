package BehaviouralPatterns;

public abstract class HouseTemplate {
	public final void buildHouse(){
		buildFoundation();
		buildPillar();
		buildWall();
		buildWindows();
		System.out.println("House is built.");
	}

	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}
	public abstract void buildWall();
	public abstract void buildPillar();

	private void buildFoundation() {
		System.out.println("Building foundation with cement,iron rods and sand");
	}

}