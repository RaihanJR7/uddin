package com.bit.test;

import org.junit.Test;

import Pages.HomePage;
import Pages.ShirtPage;

public class SmokeTest extends BaseTest{
	HomePage hp;
	ShirtPage sp;
	
	@Test
	public void buyShirt() {
		
		hp = new HomePage(dr);
		hp.hoverOverMainmanu();
		hp.clickAllshirtSubManu();
		
		sp = hp.clickAllshirtSubManu();
	}

}
