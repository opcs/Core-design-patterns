
package com.syn.dp.creational.builder;
public class TruckSupplyChainBuilder implements SupplyChainBuilder {

    private SupplyChain supplyChain;

    public TruckSupplyChainBuilder() {
        supplyChain = new SupplyChain();
    }

    @Override
    public void buildStartStep() {
        supplyChain.setStartStep("build truck startStep");
    }

    @Override
    public void buildTransportStep() {
        supplyChain.setTransportStep("build truck transportStep");

    }

    @Override
    public void buildEndStep() {
        supplyChain.setEndStep("build truck endStep");

    }
    @Override
    public SupplyChain getSupplyChain() {
        return this.supplyChain;
    }

}
