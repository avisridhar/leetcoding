package com.code.vendingmachine;

public class ChangeDispenseState implements VendingMachineState {


    @Override
    public void collectCash(VendingMachineContext nextState, int cash) {

    }

    @Override
    public void dispenseChange(VendingMachineContext nextState, String productCode) {

    }

    @Override
    public void dispenseItem(VendingMachineContext nextState, String productCode) {

    }

    @Override
    public void cancelTransaction(VendingMachineContext nextState) {

    }

    @Override
    public void selectProduct(VendingMachineContext context, String product) {

    }
}
