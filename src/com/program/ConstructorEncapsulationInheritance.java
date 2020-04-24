package com.program;

class ParentClass{
	public ParentClass(){
		System.out.println("Parent constructor executed");
	}
	private ParentClass parent;

	public ParentClass getParent() {
		return parent;
	}

	public void setParent(ParentClass parent) {
		this.parent = parent;
	}
}

public class ConstructorEncapsulationInheritance extends ParentClass{
	
	public ConstructorEncapsulationInheritance(){
		System.out.println("child constructor executed");
	}
	public static void main(String[] args) {
		ConstructorEncapsulationInheritance obj=new ConstructorEncapsulationInheritance();
		obj.setParent(obj);

	}
	@Override
	public ParentClass getParent() {
		return super.getParent();
	}
	@Override
	public void setParent(ParentClass child) {
		super.setParent(child);
	}

}

/*Output
Parent constructor executed
child constructor executed
*/
