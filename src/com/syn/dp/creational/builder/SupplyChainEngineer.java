
package com.syn.dp.creational.builder;

public class SupplyChainEngineer {

    private SupplyChainBuilder supplyChainBuilder;

    public SupplyChainEngineer(SupplyChainBuilder supplyChainBuilder) {
        this.supplyChainBuilder = supplyChainBuilder;
    }

    public void constructSupplyChain() {
        this.supplyChainBuilder.buildStartStep();
        this.supplyChainBuilder.buildTransportStep();
        this.supplyChainBuilder.buildEndStep();
    }

    public SupplyChain getSupplyChain() {
        return this.supplyChainBuilder.getSupplyChain();
    }
}
