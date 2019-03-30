package com.general;

class Alien {
String invade(short ships) { return "a few"; }
String invade(short... ships) { return "many"; }
}
class Defender {
public static void main(String [] args) {
	Byte a = 12;
	Short b = 12;
	Float c = 12.0f;
	byte d = a.byteValue();
	short e = b.shortValue();
	float f = c.floatValue();
	System.out.println(d+e+f);
	System.out.println(new Alien().invade((short) 7));
}
}

