
package com.syn.dp.creational.builder;

public interface SupplyChainBuilder {

    public void buildStartStep();

    public void buildTransportStep();

    public void buildEndStep();

    public SupplyChain getSupplyChain();
}
