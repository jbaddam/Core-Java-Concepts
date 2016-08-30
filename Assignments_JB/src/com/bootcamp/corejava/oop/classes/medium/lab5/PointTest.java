package com.bootcamp.corejava.oop.classes.medium.lab5;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Jagan Reddy 
 * JUnit Test cases for Point Class
 */
public class PointTest {

	@Test
	public void testDistanceFromAnotherPoint() {

		Point p = new Point();

		p.setX(3);
		p.setY(4);

		int[] temp = { -1, 1 };

		int actual = p.distanceFromAnotherPoint(temp);

		int expected = 13;

		assertEquals(expected, actual);

	}

	@Test
	public void testSlopeWithAnotherPoint() {

		Point p = new Point();

		p.setX(4);
		p.setY(3);

		int[] temp = { -2, 1 };

		int actual = p.slopeWithAnotherPoint(temp);

		int expected = 2;

		assertEquals(expected, actual);

	}

	@Test
	public void testIsCollinear() {

		Point p = new Point();

		p.setX(1);
		p.setY(9);

		int[] temp = { 7, 3 };
		int[] temp1 = { 10, 0 };

		boolean actual = p.isCollinear(temp, temp1);

		assertTrue(actual);

	}

	@Test
	public void testMidPoint() {

		Point p = new Point();

		p.setX(-1);
		p.setY(2);
		int[] temp = { 3, -6 };

		int[] actuals = p.midPoint(temp);

		int[] expecteds = { 1, -2 };

		assertArrayEquals(expecteds, actuals);

	}

	@Test
	public void testDistanceFromOrigin() {

		Point p = new Point();

		p.setX(5);
		p.setY(10);

		int actual = p.distanceFromOrigin();

		int expected = 11;

		assertEquals(expected, actual);

	}

	@Test
	public void testIsVertical() {

		Point p = new Point();

		p.setX(5);
		p.setY(10);

		assertFalse(p.isVertical());

	}

	@Test
	public void testIsHorizontal() {

		Point p = new Point();

		p.setX(5);
		p.setY(0);

		assertTrue(p.isHorizontal());

	}

	@Test
	public void testQuadrant() {

		Point p = new Point();

		p.setX(5);
		p.setY(0);

		String actual = p.quadrant();

		String expected = " Q1 ";

		assertEquals(expected, actual);

	}

}