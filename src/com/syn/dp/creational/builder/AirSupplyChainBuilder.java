
package com.syn.dp.creational.builder;
public class AirSupplyChainBuilder implements SupplyChainBuilder {

    private SupplyChain supplyChain;

    public AirSupplyChainBuilder() {
        supplyChain = new SupplyChain();
    }

    @Override
    public void buildStartStep() {
        supplyChain.setStartStep("build air startStep");
    }

    @Override
    public void buildTransportStep() {
        supplyChain.setTransportStep("build air transportStep");

    }

    @Override
    public void buildEndStep() {
        supplyChain.setEndStep("build air endStep");

    }
    @Override
    public SupplyChain getSupplyChain() {
        return this.supplyChain;
    }

}
