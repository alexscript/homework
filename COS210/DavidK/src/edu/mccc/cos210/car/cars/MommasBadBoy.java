package edu.mccc.cos210.car.cars;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import edu.mccc.cos210.car.*;
import com.cbthinkx.util.Debug;
import java.awt.font.*;

public class MommasBadBoy extends Car {

    final private static int PICTURE_WIDTH  = 600;
    final private static int PICTURE_HEIGHT = 313;
    
    final private static double TIRE_WIDTH  = 0.26;
    final private static double TIRE_HEIGHT = 0.29;
    final private static double TIRE_ARC_X  = 0.037;
    final private static double TIRE_ARC_Y  = 0.051;
    
    final private static Color DARK_RED  = new Color(0x18, 0x10, 0x10);
    final private static Color DARK_TAN  = new Color(0x18, 0x14, 0x10);
    final private static Color DARK_PURPLE  = new Color(0x13, 0x0D, 0x11);
    final private static Color DARK_GRAY  = new Color(0x0C, 0x0A, 0x0A);
    final private static Color SHADOW_GRAY  = new Color(0x08, 0x04, 0x00);

    final private static Color TIRE_COLOR  = SHADOW_GRAY;
    final private static Color BODY_COLOR  = DARK_GRAY;
    final private static Color ACCENT_COLOR  = DARK_PURPLE;
    final private static Color DRIVER_COLOR  = DARK_TAN;
    final private static Color HIGHLIGHT_COLOR  = Color.DARK_GRAY;
    
    final private static Font REAR_FONT  = new Font("Helvetica", Font.PLAIN,  22);

	protected void paintTop(JPanel jp, Graphics2D g2d, AffineTransform at) {
		Debug.println("MommasBadBoy:paintTop()");

        Path2D p2d;
        Shape s;
		
        //Tires
        //Front driver
        RoundRectangle2D.Double rr2d = new RoundRectangle2D.Double(
            -0.4633,
            0.7833,
            TIRE_WIDTH,
            TIRE_HEIGHT,
            TIRE_ARC_X,
            TIRE_ARC_Y
        );
		g2d.setPaint(Color.BLACK);
		s = at.createTransformedShape(rr2d);
        g2d.draw(s);
		g2d.setPaint(TIRE_COLOR);
		g2d.fill(s);

        //Front pass
        rr2d = new RoundRectangle2D.Double(
            0.4633 - TIRE_WIDTH,
            0.7833,
            TIRE_WIDTH,
            TIRE_HEIGHT,
            TIRE_ARC_X,
            TIRE_ARC_Y
        );
		g2d.setPaint(Color.BLACK);
		s = at.createTransformedShape(rr2d);
        g2d.draw(s);
		g2d.setPaint(TIRE_COLOR);
		g2d.fill(s);
        
        //Rear driver
        rr2d = new RoundRectangle2D.Double(
            -0.52,
            -0.4333,
            TIRE_WIDTH,
            TIRE_HEIGHT,
            TIRE_ARC_X,
            TIRE_ARC_Y
        );
		g2d.setPaint(Color.BLACK);
		s = at.createTransformedShape(rr2d);
        g2d.draw(s);
		g2d.setPaint(TIRE_COLOR);
		g2d.fill(s);

        //Rear pass
        rr2d = new RoundRectangle2D.Double(
            0.52 - TIRE_WIDTH,
            -0.4333,
            TIRE_WIDTH,
            TIRE_HEIGHT,
            TIRE_ARC_X,
            TIRE_ARC_Y
        );
		g2d.setPaint(Color.BLACK);
		s = at.createTransformedShape(rr2d);
        g2d.draw(s);
		g2d.setPaint(TIRE_COLOR);
		g2d.fill(s);

        //CHIN SPOILER
		p2d = new Path2D.Double();
        //Left side 
		p2d.moveTo(-0.0733, 0.8167);
		p2d.lineTo(-0.12, 0.81);
		p2d.lineTo(-0.1233, 0.8467);
		p2d.lineTo(-0.17, 0.8433);
		p2d.lineTo(-0.1733, 0.81);
		p2d.quadTo(-0.2, 0.80667,
                -0.1867, 0.80667
        );
		p2d.lineTo(-0.2, 0.8433);
		p2d.lineTo(-0.2233, 0.8433);
		p2d.lineTo(-0.23, 0.8233);
		p2d.lineTo(-0.2533, 0.8233);
		p2d.lineTo(-0.2533, 0.79);
		p2d.lineTo(-0.28, 0.7967);
		p2d.lineTo(-0.2933, 0.9633);
		p2d.lineTo(-0.2633, 0.98);
		p2d.lineTo(-0.0600, 0.9767);

        //Right side
		p2d.lineTo(0.0600, 0.9767);
		p2d.lineTo(0.2633, 0.98);
		p2d.lineTo(0.2933, 0.9633);
		p2d.lineTo(0.28, 0.7967);
		p2d.lineTo(0.2533, 0.79);
		p2d.lineTo(0.2533, 0.8233);
		p2d.lineTo(0.23, 0.8233);
		p2d.lineTo(0.2233, 0.8433);
		p2d.lineTo(0.2, 0.8433);

		p2d.quadTo(0.2, 0.80667,
                0.1867, 0.80667
        );
		p2d.lineTo(0.1733, 0.81);
		p2d.lineTo(0.17, 0.8433);
		p2d.lineTo(0.1233, 0.8467);
		p2d.lineTo(0.12, 0.81);
		p2d.lineTo(0.0733, 0.8167);
		
        s = p2d.createTransformedShape(at);
        g2d.setPaint(Color.GRAY);
		g2d.draw(s);
        g2d.setPaint(ACCENT_COLOR);
		g2d.fill(s);

        //TRIM
		p2d = new Path2D.Double();
        //Left side
		p2d.moveTo(-0.3133, 0.1566);
		p2d.lineTo(-0.1167, 0.52); //make quad
		p2d.lineTo(-0.23, 0.6133); 
		p2d.lineTo(-0.2533, 0.6133); 
		p2d.lineTo(-0.25, 0.7167); 
		p2d.lineTo(-0.2367, 0.73); 
		p2d.lineTo(-0.1833, 0.73); 
		p2d.lineTo(-0.1833, 0.7733); 
		p2d.lineTo(-0.1533, 0.78); 
		p2d.lineTo(-0.1033, 0.7733); 
		p2d.lineTo(-0.0733, 0.8067); 

        //Right side
		p2d.lineTo(0.0733, 0.8067); 
		p2d.lineTo(0.1033, 0.7733); 
		p2d.lineTo(0.1533, 0.78); 
		p2d.lineTo(0.1833, 0.7733); 
		p2d.lineTo(0.1833, 0.73); 
        p2d.lineTo(0.2367, 0.73); 
        p2d.lineTo(0.25, 0.7167); 
		p2d.lineTo(0.2533, 0.6133); 
		p2d.lineTo(0.23, 0.6133); 
		p2d.lineTo(0.1167, 0.52); //make quad
		p2d.lineTo(0.3133, 0.1566);

        s = p2d.createTransformedShape(at);
        g2d.setPaint(HIGHLIGHT_COLOR);
		g2d.draw(s);
        g2d.setPaint(SHADOW_GRAY);
		g2d.fill(s);


        //BODY
		p2d = new Path2D.Double();
        //Left corner, above flames
		p2d.moveTo(-0.31, 0.1533);
		p2d.lineTo(-0.19, 0.19);
		p2d.lineTo(-0.1167, 0.29); //curve?
		p2d.lineTo(-0.09, 0.5567); 
		p2d.lineTo(-0.2267, 0.6533); 
		p2d.lineTo(-0.2267, 0.6967); 
		p2d.lineTo(-0.08, 0.7167); 
		p2d.lineTo(-0.05, 0.9967); 
		p2d.lineTo(0.0, 1.0); 
		p2d.lineTo(0.05, 0.9967); 
		p2d.lineTo(0.08, 0.7167); 
		p2d.lineTo(0.2267, 0.6967); 
		p2d.lineTo(0.2267, 0.6533); 
        p2d.lineTo(0.09, 0.5567); 
		p2d.lineTo(0.1167, 0.29); //curve?
		p2d.lineTo(0.19, 0.19);
        //right corner, above flames
		p2d.lineTo(0.31, 0.1533);
		p2d.lineTo(0.32, -0.0467);
		p2d.lineTo(0.3367, -0.08);
		p2d.lineTo(0.34, -0.3267);
		p2d.lineTo(0.3767, -0.46);
		p2d.lineTo(0.38, -0.5167);
		p2d.lineTo(0.31, -0.566);
		p2d.lineTo(0.27, -0.69);
		p2d.lineTo(0.28, -0.71);
		p2d.lineTo(0.1833, -0.7367);
		p2d.lineTo(0.18, -0.7533);
		p2d.lineTo(0.15, -0.7767);

		p2d.lineTo(-0.15, -0.7767);
		p2d.lineTo(-0.18, -0.7533);
		p2d.lineTo(-0.1833, -0.7367);
		p2d.lineTo(-0.28, -0.71);
        p2d.lineTo(-0.27, -0.69);
		p2d.lineTo(-0.31, -0.566); 
		p2d.lineTo(-0.38, -0.5167);
		p2d.lineTo(-0.3767, -0.46);
		p2d.lineTo(-0.34, -0.3267);
		p2d.lineTo(-0.3367, -0.08);
		p2d.lineTo(-0.32, -0.0467);
		p2d.lineTo(-0.31, 0.1533);

        s = p2d.createTransformedShape(at);
        g2d.setPaint(HIGHLIGHT_COLOR);
		g2d.draw(s);
        g2d.setPaint(BODY_COLOR);
		g2d.fill(s);


        //SPOILER
		p2d = new Path2D.Double();
        //Bottom left, above bump
		p2d.moveTo(-0.3033, -0.9867);
		p2d.lineTo(-0.28, -0.8233);
		p2d.lineTo(-0.28, -0.7867);
		p2d.quadTo(
                -0.2467, -0.7867,
                -0.2667, -0.7867
        );

        //Top right, left of bump
		p2d.lineTo(0.2533, -0.7867);
		p2d.quadTo(
                0.29, -0.7867,
                0.2733, -0.7867
        );
        p2d.lineTo(0.28, -0.8233);
        p2d.lineTo(0.303, -0.9867);
		//right bump
        p2d.quadTo(0.2733, -0.9767,
                0.2933, -0.9733
        );
        //bottom left
        p2d.lineTo(-0.27, -0.9733);
        p2d.quadTo(-0.2733, -0.9767,
                -0.2933, -0.9733
        );
        
		g2d.setPaint(Color.GRAY);
		s = p2d.createTransformedShape(at);
		g2d.draw(s);
		g2d.setPaint(BODY_COLOR);
		g2d.fill(s);

        //Rear logo
        Ellipse2D.Double e2d = new Ellipse2D.Double(
            -0.2, -0.9333,
            0.4, 0.11
        );
		g2d.setPaint(Color.GRAY);
		s = at.createTransformedShape(e2d);
		g2d.draw(s);
		g2d.setPaint(Color.WHITE);
		g2d.fill(s);

        //Front oval
        e2d = new Ellipse2D.Double(
            -0.0333, 0.99,
            0.060, 0.04
        );
		g2d.setPaint(Color.GRAY);
		s = at.createTransformedShape(e2d);
		g2d.draw(s);
		g2d.setPaint(Color.WHITE);
		g2d.fill(s);

        //Driver
        rr2d = new RoundRectangle2D.Double(
            -0.0733, 
            0.0066,
            0.0733 * 2,
            0.3167 - 0.0066,
            TIRE_ARC_X,
            TIRE_ARC_Y
        );
		g2d.setPaint(Color.BLACK);
		s = at.createTransformedShape(rr2d);
        g2d.draw(s);
		g2d.setPaint(SHADOW_GRAY);
		g2d.fill(s);

        //Steering wheel
        rr2d = new RoundRectangle2D.Double(
            -0.0333,
            0.2667,
            0.0333 * 2,
            0.0167,
            TIRE_ARC_X,
            TIRE_ARC_Y
        );
		g2d.setPaint(Color.BLACK);
		s = at.createTransformedShape(rr2d);
        g2d.draw(s);
		g2d.setPaint(DARK_RED);
		g2d.fill(s);

        //body
		p2d = new Path2D.Double();
        //left shoulder, rear
		p2d.moveTo(-0.02, 0.0233);
		p2d.lineTo(-0.0433, 0.05);
		p2d.lineTo(-0.0467, 0.17);
		p2d.lineTo(-0.0433, 0.2467);
		p2d.lineTo(-0.0267, 0.27);
		p2d.lineTo(-0.0067, 0.0267);
		p2d.lineTo(-0.0267, 0.24);
		p2d.lineTo(-0.03, 0.1067);

        //middle
		//p2d.lineTo(0, 0.0867);

		p2d.lineTo(0.03, 0.1067);
		p2d.lineTo(0.0267, 0.24);
		p2d.lineTo(0.0067, 0.0267);
        p2d.lineTo(0.0267, 0.27);
		p2d.lineTo(0.0433, 0.2467);
		p2d.lineTo(0.0467, 0.17);
		p2d.lineTo(0.0433, 0.05);
		p2d.lineTo(0.02, 0.0233);
        p2d.closePath();

		g2d.setPaint(HIGHLIGHT_COLOR);
		s = p2d.createTransformedShape(at);
		g2d.draw(s);
		g2d.setPaint(DRIVER_COLOR);
		g2d.fill(s);

        //head
		e2d = new Ellipse2D.Double(
                -0.0333, 0.0333,
                0.0333*2, 0.07
        );
		s = at.createTransformedShape(e2d);
		g2d.setPaint(DRIVER_COLOR);
		g2d.fill(s);
		g2d.setPaint(Color.GRAY);
		g2d.draw(s);

        //Scoop mount
		p2d = new Path2D.Double();
		p2d.moveTo(0, -0.7033);
		p2d.lineTo(-0.0733, -0.35);
		p2d.lineTo(-0.1367, -0.12);
		p2d.lineTo(-0.1267, 0.1233);
		p2d.lineTo(-0.0867, 0.2433);
		p2d.lineTo(-0.0867, 0.3);
		p2d.lineTo(-0.0733, 0.3233);

        //right side
		p2d.lineTo(0.0733, 0.3233);
		p2d.lineTo(0.0867, 0.3);
		p2d.lineTo(0.0867, 0.2433);
		p2d.lineTo(0.1267, 0.1233);
		p2d.lineTo(0.1367, -0.12);
		p2d.lineTo(0.0733, -0.35);
		p2d.lineTo(0, -0.7033);

        p2d.closePath();
        s = p2d.createTransformedShape(at);
        g2d.setPaint(Color.GRAY);
		g2d.draw(s);
        g2d.setPaint(ACCENT_COLOR);
		//g2d.fill(s);

        //Intake scoop
		p2d = new Path2D.Double();
		p2d.moveTo(-0.06, -0.0233);
		p2d.lineTo(-0.0667, -0.23);
		p2d.lineTo(0, -0.6567);
		p2d.lineTo(0.0667, -0.23);
		p2d.lineTo(0.06, -0.0233);

        p2d.closePath();
        s = p2d.createTransformedShape(at);
        g2d.setPaint(Color.GRAY);
		g2d.draw(s);
        g2d.setPaint(ACCENT_COLOR);
		g2d.fill(s);

        //Flames 
		p2d = new Path2D.Double();
        //Left
		p2d.moveTo(-0.2833, 0.15);
		p2d.lineTo(-0.2833, 0.13);
		p2d.curveTo(
            -0.3033, 0.11,
            -0.2967, 0.0633,
            -0.28, 0.0567
        ); //left baby tip
		p2d.quadTo(
            //-0.27, 0.0667,
            -0.26, 0.0467,
            -0.2667, 0.05
        ); //end parabola nook
		p2d.curveTo(
            -0.2667, 0.01,       
            -0.3267, -0.0167,
            -0.2633, -0.0667
        ); //tip left
		p2d.quadTo(
            -0.25, -0.04,
            -0.26, -0.0467
        ); //end nook
		p2d.curveTo(
            -0.2367, -0.0433,   
            -0.2867, -0.1167,
            -0.2267, -0.16
        ); //front tip
		p2d.curveTo(
            -0.2633, -0.12,
            -0.24, -0.0633,
            -0.2233, -0.0767
        ); //end first right curve
		p2d.curveTo(
            -0.2633, 0.0233,   
            -0.22, 0.09,
            -0.2267, 0.08333
        ); //top right hump
		p2d.quadTo(
            -0.2367, 0.0833,
            -0.2367, 0.15 
        ); //top right corner
        p2d.closePath();
        s = p2d.createTransformedShape(at);
        g2d.setPaint(Color.RED);
		g2d.draw(s);
        g2d.setPaint(Color.ORANGE);
		g2d.fill(s);

        //Right
		p2d = new Path2D.Double();
		p2d.moveTo(0.2833, 0.15);
		p2d.lineTo(0.2833, 0.13);
		p2d.curveTo(
            0.3033, 0.11,
            0.2967, 0.0633,
            0.28, 0.0567
        ); //left baby tip
		p2d.quadTo(
            0.26, 0.0467,
            0.2667, 0.05
        ); //end parabola nook
		p2d.curveTo(
            0.2667, 0.01,       
            0.3267, -0.0167,
            0.2633, -0.0667
        ); //tip left
		p2d.quadTo(
            0.25, -0.04,
            0.26, -0.0467
        ); //end nook
		p2d.curveTo(
            0.2367, -0.0433,   
            0.2867, -0.1167,
            0.2267, -0.16
        ); //front tip
		p2d.curveTo(
            0.2633, -0.12,
            0.24, -0.0633,
            0.2233, -0.0767
        ); //end first right curve
		p2d.curveTo(
            0.2633, 0.0233,   
            0.22, 0.09,
            0.2267, 0.08333
        ); //top right hump
		p2d.quadTo(
            0.2367, 0.0833,
            0.2367, 0.15 
        ); //top right corner
        p2d.closePath();
        s = p2d.createTransformedShape(at);
        g2d.setPaint(Color.RED);
		g2d.draw(s);
        g2d.setPaint(Color.ORANGE);
		g2d.fill(s);


        /*
        //Text Logo
        AffineTransform textAt = getTextTransform(-0.2,-0.933);
        //g2d.drawString("First", -0.2f, -0.933f);
		s = at.createTransformedShape(
            //getTextShape(g2d, "First", REAR_FONT)
            getTextShape(g2d, textAt , "First", REAR_FONT)
        );
        s = textAt.createTransformedShape(s);
		g2d.setPaint(Color.BLUE);
		g2d.draw(s);
		g2d.fill(s);
        */
	}
    private void paintGuidesSide(JPanel jp, Graphics2D g2d, AffineTransform at) {

		Shape s;
		Path2D p2d;
        //arrow
		p2d = new Path2D.Double();
		p2d.moveTo(0.75, 0.25);
		p2d.lineTo(0.5, 0.5);
		p2d.moveTo(0.75, 0.25);
		p2d.lineTo(0.5, 0.0);
		p2d.moveTo(0.75, 0.25);
		p2d.lineTo(-0.75, 0.25);
		g2d.setPaint(HIGHLIGHT_COLOR);
		s = p2d.createTransformedShape(at);
		g2d.draw(s);


    }

    private void paintGuidesTop(JPanel jp, Graphics2D g2d, AffineTransform at) {
        Path2D p2d;
        Shape s;

        //Blue box
		p2d = new Path2D.Double();
		p2d.moveTo(-0.5, 0.75);
		p2d.lineTo(0.5, 0.75);
		p2d.lineTo(0.5, -0.75);
		p2d.lineTo(-0.5, -0.75);
		p2d.closePath();
		g2d.setPaint(Color.BLUE);
		s = p2d.createTransformedShape(at);
		g2d.fill(s);

        //Arrow
		p2d = new Path2D.Double();
		p2d.moveTo(0.0, 0.75);
		p2d.lineTo(0.5, 0.5);
		p2d.moveTo(0.0, 0.75);
		p2d.lineTo(-0.5, 0.5);
		p2d.moveTo(0.0, 0.75);
		p2d.lineTo(0.0, -0.75);
		g2d.setPaint(HIGHLIGHT_COLOR);
		s = p2d.createTransformedShape(at);
		g2d.draw(s);
		
        Ellipse2D origin = new Ellipse2D.Double(-0.025, -0.025, 0.05, 0.05);
		g2d.setPaint(Color.GREEN);
		s = at.createTransformedShape(origin);
		g2d.fill(s);
    }

	protected void paintSide(JPanel jp, Graphics2D g2d, AffineTransform at) {
		Debug.println("MommasBadBoy:paintSide()");
		Path2D p2d;
		Shape s;
        p2d = new Path2D.Double();
		p2d.moveTo(-0.75, 0.5);
		p2d.lineTo(0.75, 0.5);
		p2d.lineTo(0.75, 0.0);
		p2d.lineTo(-0.75, 0.0);
		p2d.closePath();
		g2d.setPaint(Color.BLUE);
        s = p2d.createTransformedShape(at);
		g2d.fill(s);

		Ellipse2D origin = new Ellipse2D.Double(-0.025, -0.025, 0.05, 0.05);
		g2d.setPaint(Color.RED);
		s = at.createTransformedShape(origin);
		g2d.fill(s);

        //Body
		p2d = new Path2D.Double();
        //Rear tire, just above
		p2d.moveTo(-0.675, 0.2375);
		p2d.lineTo(-0.65, 0.3325);
		p2d.lineTo(-0.7425, 0.315);
		p2d.lineTo(-0.7425, 0.49);
		p2d.lineTo(-0.6025, 0.4825);
		p2d.lineTo(-0.6, 0.4325);
        p2d.lineTo(-0.53, 0.4175);
        p2d.lineTo(-0.53, 0.3825);
        p2d.lineTo(-0.4175, 0.36);
        p2d.curveTo(
            -0.37,   0.4325,
            -0.1625, 0.485,
            -0.17,   0.445
        );
        p2d.lineTo(-0.1775, 0.4125);
        p2d.lineTo(-0.1875, 0.375);
        p2d.lineTo(-0.0075, 0.3425);
        p2d.lineTo(0.0275, 0.345);
        p2d.lineTo(0.0675, 0.325);
        p2d.lineTo(0.175, 0.3275);
        p2d.curveTo(
            0.235, 0.3475,
            0.6075, 0.225,
            0.655, 0.17
        );
        p2d.lineTo(0.63, 0.09);
        p2d.lineTo(0.3925, 0.0925);

        p2d.closePath();
        s = p2d.createTransformedShape(at);
        g2d.setPaint(HIGHLIGHT_COLOR);
		g2d.draw(s);
        g2d.setPaint(SHADOW_GRAY);
		g2d.fill(s);

        //Accents
		p2d = new Path2D.Double();
        p2d.moveTo(0.0525, 0.13);
        p2d.lineTo(0.06, 0.1775);
        p2d.lineTo(0.3025, 0.2425);
        p2d.lineTo(0.2925, 0.1025);
        

        p2d.closePath();
        s = p2d.createTransformedShape(at);
        g2d.setPaint(HIGHLIGHT_COLOR);
		g2d.draw(s);


        //Rear tire
        Ellipse2D.Double e2d = new Ellipse2D.Double(
            -0.74, 0.0,
            0.3, 0.2625
        );
		g2d.setPaint(HIGHLIGHT_COLOR);
		s = at.createTransformedShape(e2d);
		g2d.draw(s);
		g2d.setPaint(TIRE_COLOR);
		g2d.fill(s);

        //Front tire
        //FIXME resize this
         e2d = new Ellipse2D.Double(
            0.405, 0.005,
            0.23, 0.22
        );
		g2d.setPaint(HIGHLIGHT_COLOR);
		s = at.createTransformedShape(e2d);
		g2d.draw(s);
		g2d.setPaint(TIRE_COLOR);
		g2d.fill(s);

        drawHubCap(g2d, at, true);
        drawHubCap(g2d, at, false);
	}

    private void drawHubCap(Graphics2D g2d, AffineTransform gat, boolean front) {
        AffineTransform at = new AffineTransform();
        if (front) {
            //at.translate(0.4025, 0.2175);
            at.translate(0.5225, 0.1175);
        } else {
            //at.translate(-0.6025, 0.1275);
            at.translate(-0.5925, 0.1275);
            at.scale(
                    1.3, 
                    1.3
            );
        }
        for (int i = 1; i <= 8; i++) {
        //for (int i = 1; i <= 2; i++) {
            Shape s = new RoundRectangle2D.Double(
                0.01,
                0.0,
                0.08,
                0.01,
                TIRE_ARC_X,
                TIRE_ARC_Y
            );
            
            s = at.createTransformedShape(s);
            s = gat.createTransformedShape(s);
            g2d.setPaint(Color.RED);
            g2d.draw(s);
            g2d.setPaint(Color.GREEN);
            g2d.fill(s);

            at.rotate(
                Math.toRadians(45)
            );
        }

    }

    /**
     * Takes a string and font and creates a shape, for ease of rendering
     *
     * Taken from www.exampledepot.com
     */
    private Shape getTextShape(Graphics2D g2d, AffineTransform at, String str, Font font) {
        FontRenderContext frc = g2d.getFontRenderContext();
        TextLayout tl = new TextLayout(str, font, frc);
        //return tl.getOutline(at);
        return tl.getOutline(null);
    } 

    private AffineTransform getTextTransform(double x, double y) {
        AffineTransform at = new AffineTransform();
        final double scale_x = 1.0;
        final double scale_y = 1.0;
        try {
            at.translate(
                x,
                x
            );
            at.scale(
                scale_x,
                scale_y
            );
        } catch (NumberFormatException ex) {
        }
        return at;
    }

	public void paintShifter(JPanel jp, Graphics2D g2d, int gear, int maxGear) {
		Debug.println("MyCar:paintShifter()");
		String value = String.valueOf(gear);
		String maxValue = String.valueOf(maxGear);
		int w = SwingUtilities.computeStringWidth(
			g2d.getFontMetrics(),
			value
		);
		g2d.setPaint(Color.BLACK);
		g2d.drawString(
			value,
			jp.getWidth() / 2 - w / 2,
			jp.getHeight() / 2 + 8
		);
	}
}
