//Idan Hur 318247822
package house;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String color;

		Triangle roof = new Triangle(null, null, null);
		do {
			System.out.println(
					"First provide me with the roof detailes\nEnter roof base information\nplease enter (x1,y1)(x2,y2) and the color: \n");

			Point p1 = new Point(s.nextInt(), s.nextInt());
			Point p2 = new Point(s.nextInt(), s.nextInt());
			color = s.next();
			Line roofB = new Line(p1, p2, color);
			System.out.println("Enter roof right side information \nplease enter (x1,y1)(x2,y2) and the color: \n");
			Point p3 = new Point(s.nextInt(), s.nextInt());
			Point p4 = new Point(s.nextInt(), s.nextInt());
			color = s.next();
			Line roofR = new Line(p3, p4, color);
			System.out.println("Enter roof left side information \nplease enter (x1,y1)(x2,y2) and the color: \n");
			Point p5 = new Point(s.nextInt(), s.nextInt());
			Point p6 = new Point(s.nextInt(), s.nextInt());
			color = s.next();
			Line roofL = new Line(p5, p6, color);
			roof.setBase(roofB);
			roof.setLeft(roofL);
			roof.setRight(roofR);
			if (!roof.isTriangle()) {
				System.out.println("The roof is not good try again");
			}
		} while (!roof.isTriangle());

		Square base = new Square(null, null, null, null);
		do {
			System.out.println(
					"And now, lets build the home main part! \nFirst provide me the home base detailes \nEnter the home lower base side information \nenter (x1,y1)(x2,y2) and the color:");
			Point b1 = new Point(s.nextInt(), s.nextInt());
			Point b2 = new Point(s.nextInt(), s.nextInt());
			color = s.next();
			Line LB = new Line(b1, b2, color);
			System.out.println("Enter home upper base information \nenter (x1,y1)(x2,y2) and the color: ");
			Point b3 = new Point(s.nextInt(), s.nextInt());
			Point b4 = new Point(s.nextInt(), s.nextInt());
			color = s.next();
			Line UB = new Line(b3, b4, color);
			System.out.println("Enter home right base information \nenter (x1,y1)(x2,y2) and the color:");
			Point b5 = new Point(s.nextInt(), s.nextInt());
			Point b6 = new Point(s.nextInt(), s.nextInt());
			color = s.next();
			Line RB = new Line(b5, b6, color);
			System.out.println("Enter home left base information \nenter (x1,y1)(x2,y2) and the color:");
			Point b7 = new Point(s.nextInt(), s.nextInt());
			Point b8 = new Point(s.nextInt(), s.nextInt());
			color = s.next();
			Line LSB = new Line(b7, b8, color);
			base.setLeft(LSB);
			base.setLower(LB);
			base.setUpper(UB);
			base.setRight(RB);
			if (!base.isSquare()) {
				System.out.println("The base is not good try again");
			}
		} while (!base.isSquare());
		Home home1 = new Home(roof, base);
		if (!home1.isHome()) {
			System.out.println("The house you built isnt good!");
		}
		if (home1.isHome()) {
			System.out.println(home1.toString());
			System.out.println("Good construction!! You have succeeded to build your home");
			System.out.println("Please enter a number for moving home vertically");
			int moveX = s.nextInt();
			home1.moveHouseX(moveX);
			System.out.println("The new home location and details are: ");
			System.out.println(home1.toString());
			System.out.println("Please enter a number for moving home horizonlly:");
			int moveY = s.nextInt();
			home1.moveHouseY(moveY);
			System.out.println("The new home location and details are:");
			System.out.println(home1.toString());

			Triangle roof1 = new Triangle(null, null, null);
			do {
				System.out.println(
						"First provide me with the roof detailes\nEnter roof base information\nplease enter (x1,y1)(x2,y2) and the color: \n");

				Point p11 = new Point(s.nextInt(), s.nextInt());
				Point p21 = new Point(s.nextInt(), s.nextInt());
				color = s.next();
				Line roofB1 = new Line(p11, p21, color);
				System.out.println("Enter roof right side information \nplease enter (x1,y1)(x2,y2) and the color: \n");
				Point p31 = new Point(s.nextInt(), s.nextInt());
				Point p41 = new Point(s.nextInt(), s.nextInt());
				color = s.next();
				Line roofR1 = new Line(p31, p41, color);
				System.out.println("Enter roof left side information \nplease enter (x1,y1)(x2,y2) and the color: \n");
				Point p51 = new Point(s.nextInt(), s.nextInt());
				Point p61 = new Point(s.nextInt(), s.nextInt());
				color = s.next();
				Line roofL1 = new Line(p51, p61, color);
				roof1.setBase(roofB1);
				roof1.setLeft(roofL1);
				roof1.setRight(roofR1);
				if (!roof1.isTriangle()) {
					System.out.println("The roof is not good try again");
				}
			} while (!roof1.isTriangle());

			Square base1 = new Square(null, null, null, null);
			do {
				System.out.println(
						"And now, lets build the home main part! \nFirst provide me the home base detailes \nEnter the home lower base side information \nenter (x1,y1)(x2,y2) and the color:");
				Point b11 = new Point(s.nextInt(), s.nextInt());
				Point b21 = new Point(s.nextInt(), s.nextInt());
				color = s.next();
				Line LB1 = new Line(b11, b21, color);
				System.out.println("Enter home upper base information \nenter (x1,y1)(x2,y2) and the color: ");
				Point b31 = new Point(s.nextInt(), s.nextInt());
				Point b41 = new Point(s.nextInt(), s.nextInt());
				color = s.next();
				Line UB1 = new Line(b31, b41, color);
				System.out.println("Enter home right base information \nenter (x1,y1)(x2,y2) and the color:");
				Point b51 = new Point(s.nextInt(), s.nextInt());
				Point b61 = new Point(s.nextInt(), s.nextInt());
				color = s.next();
				Line RB1 = new Line(b51, b61, color);
				System.out.println("Enter home left base information \nenter (x1,y1)(x2,y2) and the color:");
				Point b71 = new Point(s.nextInt(), s.nextInt());
				Point b81 = new Point(s.nextInt(), s.nextInt());
				color = s.next();
				Line LSB1 = new Line(b71, b81, color);
				base1.setLeft(LSB1);
				base1.setLower(LB1);
				base1.setUpper(UB1);
				base1.setRight(RB1);
				if (!base1.isSquare()) {
					System.out.println("The base is not good try again");
				}
			} while (!base1.isSquare());
			Home home11 = new Home(roof1, base1);
			if (!home1.isHome()) {
				System.out.println("The house you built isnt good!");
			}
			if (home11.isHome()) {
				System.out.println(home11.toString());
				System.out.println("Good construction!! You have succeeded to build your home");
				if (home1.homeEquals(home11)) {
					System.out.println("The 2 houses are actually  the same house!");
				}
				if (!home1.homeEquals(home11)) {
					System.out.println("The 2 houses are not the same house!");
				}
			}
		}
	}
}
