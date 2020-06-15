package com.code.vendingmachine;

public interface VendingMachineState {
    public void collectCash(int cash);
    public void dispenseChange(String productCode);
    public void dispenseItem(String productCode);
    public void cancelTransaction();
}
