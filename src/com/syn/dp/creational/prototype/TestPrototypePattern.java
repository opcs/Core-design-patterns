package com.syn.dp.creational.prototype;

public class TestPrototypePattern {

	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("cloned Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("cloned Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("cloned Shape : " + clonedShape3.getType());
	}
}
