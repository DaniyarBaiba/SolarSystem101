package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SolarSystem FactorX=new SolarSystem();
        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Planet="2";
        FactorX.Stars="10000";

        // ading features to our sun
        FeatureSun Xfact = new FeatureSun();
        Xfact.color="green";
        Xfact.radius="100000000km";
        Xfact.heat="3093249344898km";
    }
}
