package StructuralPatterns;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{
private List<Shape> shape = new ArrayList<Shape>();
	
	@Override
	public void draw(String fillColor) {
		for(Shape sh : shape)
		{
			sh.draw(fillColor);
		}
	}
	
	//adding shape to drawing
	public void add(Shape s){
		this.shape.add(s);
	}
	
	//removing shape from drawing
	public void remove(Shape s){
		shape.remove(s);
	}
	
	//removing all the shapes
	public void clear(){
		System.out.println("Clearing all shapes from drawing");
		this.shape.clear();
	}

}