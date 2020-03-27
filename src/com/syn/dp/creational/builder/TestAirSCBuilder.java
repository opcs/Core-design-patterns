
package com.syn.dp.creational.builder;
public class TestAirSCBuilder {

    public static void main(String[] args) {
        AirSupplyChainBuilder builder = new AirSupplyChainBuilder();
        SupplyChainEngineer engineer = new SupplyChainEngineer(builder);
        engineer.constructSupplyChain();
        final SupplyChain supplyChain = engineer.getSupplyChain();
        System.out.println("supply chain created: " + supplyChain);
    }

}
