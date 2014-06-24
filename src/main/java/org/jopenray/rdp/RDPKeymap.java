package org.jopenray.rdp;

import java.awt.event.KeyEvent;

public class RDPKeymap {
	/**
	 * Return the scancode associated to the keyCode (from KeyEvent)
	 * Depend of the installed keyboard, here is French mapping
	 * */
	public static int getScancode(int keyCode) {
		int scancode;
		/*
 1
 bksp=
 qa
 wz..
 \[enter]
 ;m
 'ù
 [enter]*

 zw
 m,
 1paragraph sign
 numpad 2: shift
 3*
 4alt
 5space

 */
 int[] m = new int[]{
 	KeyEvent.VK_DEAD_TILDE,
	KeyEvent.VK_ESCAPE,//esc
	KeyEvent.VK_AMPERSAND,//&
	0,//accented
	KeyEvent.VK_QUOTEDBL,//doublequote
	KeyEvent.VK_QUOTE,//singlequote
	KeyEvent.VK_LEFT_PARENTHESIS,//(
	KeyEvent.VK_MINUS,//-
	0,//è
	KeyEvent.VK_UNDERSCORE,//_
	0,//ç (0)
	0,
	0,
	KeyEvent.VK_EQUALS,//= (backspace)
	0, //tab
	KeyEvent.VK_TAB,
	KeyEvent.VK_A,//a
	KeyEvent.VK_Z,//z
	KeyEvent.VK_E,
	KeyEvent.VK_R,
	KeyEvent.VK_T,
	KeyEvent.VK_Y,
	KeyEvent.VK_U,
	KeyEvent.VK_I,
	KeyEvent.VK_O,
	KeyEvent.VK_P,
	KeyEvent.VK_BRACELEFT,//nothing
	KeyEvent.VK_BRACERIGHT,//nothing
	KeyEvent.VK_ENTER,//enter
	0, //caps lock
	KeyEvent.VK_Q,//q
	KeyEvent.VK_S,
	KeyEvent.VK_D,
	KeyEvent.VK_F,
	KeyEvent.VK_G,
	KeyEvent.VK_H,
	KeyEvent.VK_J,
	KeyEvent.VK_K,
	KeyEvent.VK_L,
	KeyEvent.VK_M,//m
	0,//ù
	KeyEvent.VK_SEMICOLON,//;
	KeyEvent.VK_QUOTE,//'
	KeyEvent.VK_MULTIPLY,//*
	KeyEvent.VK_W,//w
	KeyEvent.VK_X,
	KeyEvent.VK_C,
	KeyEvent.VK_V,
	KeyEvent.VK_B,
	KeyEvent.VK_N,
	KeyEvent.VK_COMMA,//comma
	KeyEvent.VK_SEMICOLON,//semicolon
	0,
	KeyEvent.VK_EXCLAMATION_MARK,//!
	KeyEvent.VK_SHIFT,//shift
	KeyEvent.VK_MULTIPLY,//*
	KeyEvent.VK_ALT,//alt
	KeyEvent.VK_SPACE,//space
	KeyEvent.VK_CAPS_LOCK,//capslock
	KeyEvent.VK_NUMPAD7,//nothing
	KeyEvent.VK_NUMPAD8,//nothing
	KeyEvent.VK_NUMPAD9//nothing

 };

for(int i=1; i<m.length; i++) {
	if(m[i] == keyCode) {
		System.out.println("**\n*\n*\n*keyCode "+keyCode+" i "+i+" mi "+m[i]);
		return i;
	}
}
return 0;
/*
		switch (keyCode) {
		
		case KeyEvent.VK_1:
			scancode = 2;
			break;
		case KeyEvent.VK_2:
			scancode = 3;
			break;
		case KeyEvent.VK_3:
			scancode = 4;
			break;
		case KeyEvent.VK_4:
			scancode = 5;
			break;
		case KeyEvent.VK_5:
			scancode = 6;
			break;
		case KeyEvent.VK_6:
			scancode = 7;
			break;
		case KeyEvent.VK_7:
			scancode = 8;
			break;
		case KeyEvent.VK_8:
			scancode = 9;
			break;
		case KeyEvent.VK_9:
			scancode = 10;
			break;
		
		case KeyEvent.VK_BACK_SPACE:
			scancode = 13;
			break;
		case KeyEvent.VK_TAB:
			scancode = 15;
			break;
		case KeyEvent.VK_Q:
			scancode = 16;
			break;
		case KeyEvent.VK_W:
			scancode = 17;
			break;
		case KeyEvent.VK_E:
			scancode = 18;
			break;
		case KeyEvent.VK_R:
			scancode = 19;
			break;
		case KeyEvent.VK_T:
			scancode = 20;
			break;
		case KeyEvent.VK_Y:
			scancode = 21;
			break;
		case KeyEvent.VK_U:
			scancode = 22;
			break;
		case KeyEvent.VK_I:
			scancode = 23;
			break;
		case KeyEvent.VK_O:
			scancode = 24;
			break;
		case KeyEvent.VK_P:
			scancode = 25;
			break;
		case KeyEvent.VK_BRACELEFT:
			scancode = 26;
			break;
		case KeyEvent.VK_BRACERIGHT:
			scancode = 27;
			break;
		case KeyEvent.VK_BACK_SLASH:
			scancode = 28;
			break;
		case KeyEvent.VK_A:
			scancode = 30;
			break;
		case KeyEvent.VK_S:
			scancode = 31;
			break;
		case KeyEvent.VK_D:
			scancode = 32;
			break;
		case KeyEvent.VK_F:
			scancode = 33;
			break;
		case KeyEvent.VK_G:
			scancode = 34;
			break;
		case KeyEvent.VK_H:
			scancode = 35;
			break;
		case KeyEvent.VK_J:
			scancode = 36;
			break;
		case KeyEvent.VK_K:
			scancode = 37;
			break;
		case KeyEvent.VK_L:
			scancode = 38;
			break;
		case KeyEvent.VK_SEMICOLON:
			scancode = 39;
			break;
		case KeyEvent.VK_COLON:
			scancode = 39;
			break;
		case KeyEvent.VK_QUOTE:
			scancode = 40;
			break;
		case KeyEvent.VK_ENTER:
			scancode = 43;
			break;
		case KeyEvent.VK_Z:
			scancode = 44;
			break;
		case KeyEvent.VK_X:
			scancode = 45;
			break;
		case KeyEvent.VK_C:
			scancode = 46;
			break;
		case KeyEvent.VK_V:
			scancode = 47;
			break;
		case KeyEvent.VK_B:
			scancode = 48;
			break;
		case KeyEvent.VK_N:
			scancode = 49;
			break;
		case KeyEvent.VK_M:
			scancode = 50;
			break;
		case KeyEvent.VK_COMMA:
			scancode = 51;
			break;
		//test
		//case KeyEvent.VK_M:
		//	scancode = 52;
		//	break;
		case KeyEvent.VK_NUMPAD1:
			scancode = 53;
			break;
		case KeyEvent.VK_NUMPAD2:
			scancode = 54;
			break;
		case KeyEvent.VK_NUMPAD3:
			scancode = 55;
			break;
		case KeyEvent.VK_NUMPAD4:
			scancode = 56;
			break;
		case KeyEvent.VK_NUMPAD5:
			scancode = 57;
			break;
		case KeyEvent.VK_NUMPAD6:
			scancode = 58;
			break;
		case KeyEvent.VK_NUMPAD7:
			scancode = 59;
			break;
		case KeyEvent.VK_NUMPAD8:
			scancode = 60;
			break;
		case KeyEvent.VK_NUMPAD9:
			scancode = 61;
			break;
		default:
			scancode = 0;
			break;
		}
		return scancode;*/
	}
}
