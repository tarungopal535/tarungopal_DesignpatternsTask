package BehaviouralPatterns;

public class GlassHouse extends HouseTemplate{
	@Override
	public void buildWall() {
		System.out.println("Building Glass Walls");
	}

	@Override
	public void buildPillar() {
		System.out.println("Building Pillar with glass coating");
	}

}