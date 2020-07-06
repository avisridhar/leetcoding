package com.code.vendingmachine;

public interface VendingMachineState {
    public void collectCash(VendingMachineContext nextState, int cash);
    public void dispenseChange(VendingMachineContext nextState, String productCode);
    public void dispenseItem(VendingMachineContext nextState, String productCode);
    public void cancelTransaction(VendingMachineContext nextState);
    public void selectProduct(VendingMachineContext context, String product);

}
