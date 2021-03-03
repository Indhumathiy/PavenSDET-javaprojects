package enumeration;

public enum enum1 {
chicken_biriyani(120),
mutton_biriyani(180),
prawn_biriyani(130);
	
	int price;
enum1(int price)
{
	this.price=price;
	}

public int getPrice()
{
	return price;
}
}




