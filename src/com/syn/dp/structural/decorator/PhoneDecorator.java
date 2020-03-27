package com.syn.dp.structural.decorator;

public class PhoneDecorator implements Phone {

    public Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void printModel() {
        this.phone.printModel();
    }
}
