package application;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

// To decide the shape and fill color
public class Shape {
     Rectangle a;
     Rectangle b;
     Rectangle c;
     Rectangle d;
     Color color;
     private String name;
 	public int form = 1;

 	public Shape(Rectangle a, Rectangle b, Rectangle c, Rectangle d) {
 		this.a = a;
 		this.b = b;
 		this.c = c;
 		this.d = d;
 	}

 	public Shape(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
 		this.a = a;
 		this.b = b;
 		this.c = c;
 		this.d = d;
 		this.name = name;

 		switch (name) {
 		case "j":
 			color = Color.SLATEGRAY;
 			break;
 		case "l":
 			color = Color.DARKGOLDENROD;
 			break;
 		case "o":
 			color = Color.INDIANRED;
 			break;
 		case "s":
 			color = Color.FORESTGREEN;
 			break;
 		case "t":
 			color = Color.CADETBLUE;
 			break;
 		case "z":
 			color = Color.HOTPINK;
 			break;
 		case "i":
 			color = Color.SANDYBROWN;
 			break;

 		}
 		this.a.setFill(color);
 		this.b.setFill(color);
 		this.c.setFill(color);
 		this.d.setFill(color);
 	}


 	public String getName() {
 		return name;
 	}


 	public void changeForm() { // change shape
 		if (form != 4) { // for curr shape form identification
 			form++;
 		} else {
 			form = 1;
 		}
 	}
}
