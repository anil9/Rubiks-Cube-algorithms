public class Side{
	

public String c1;
public String c2;
public String c3;
public String c4;
public String c5;
public String c6;
public String c7;
public String c8;
public String c9;

public Side(String[] colors){
	c1 = colors[0];
	c2 = colors[1];
	c3 = colors[2];
	c4 = colors[3];
	c5 = colors[4];
	c6 = colors[5];
	c7 = colors[6];
	c8 = colors[7];
	c9 = colors[8];
}

public Side(Side side){
	c1 = side.c1;
	c2 = side.c2;
	c3 = side.c3;
	c4 = side.c4;
	c5 = side.c5;
	c6 = side.c6;
	c7 = side.c7;
	c8 = side.c8;
	c9 = side.c9;
}

public String[] getColors(){
	String[] colors = new String[]{c1, c2, c3, c4, c5, c6, c7, c8, c9};
	return colors;
}

public String toString(){

	StringBuilder sb = new StringBuilder();
	sb.append(c1 + " " + c2 + " " + c3 +"\n");
	sb.append(c4 + " " + c5 + " " + c6 + "\n");
	sb.append(c7 + " " + c8 + " " + c9);
	return sb.toString();

}

public String getC(int i){
	switch(i){
		case 1:
		return c1;
		case 2:
		return c2;
		case 3:
		return c3;
		case 4: 
		return c4;
		case 5:
		return c5; // OBS finns inte alltid
		case 6:
		return c6;
		case 7:
		return c7;
		case 8:
		return c8;
		case 9:
		return c9;
		default:
		return "";
	}
}







}