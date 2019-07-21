package com.basic.object;

import java.io.Serializable;

import org.apache.log4j.Logger;

public class TestJavaClone {

	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(TestJavaClone.class);	
		
		Rectangle rec = new Rectangle(30,60);
		System.out.println("Rec : "+rec);
		Rectangle copyRec = null;
		
		try {
			logger.info("Creating Copy of this object using Clone method");
			copyRec = (Rectangle) rec.clone();
			logger.debug("CopyRec : "+copyRec);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("copyRec : "+copyRec);
		
		
		//Clone Test
		//===========
		logger.info("Clone Test:");
		logger.info("copyRec != rec : " + (copyRec != rec));
        logger.info("copyRec.getClass() == rec.getClass() : " + (copyRec.getClass() == rec.getClass()));
        logger.info("copyRec.equals(rec) : " + copyRec.equals(rec));
	}

}

class Rectangle implements Cloneable,Serializable
{
	
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle \n[\n width=" + width + "\n height=" + height + "\n getWidth()=" + getWidth() + "\n getHeight()="
				+ getHeight() + "\n getClass()=" + getClass() + "\n hashCode()=" + hashCode() + "\n toString()="
				+ super.toString() + "\n]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Rectangle other = (Rectangle) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		
		return true;
	}
	
	@Override
	protected Rectangle clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Rectangle)super.clone();
	}
	
}
