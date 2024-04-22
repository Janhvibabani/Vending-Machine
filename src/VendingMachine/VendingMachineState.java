package VendingMachine;

import coins.*;
import item.*;
import java.util.*;

public class VendingMachineState {
    public VendingMachineState()
    {
        System.out.println("Currently machine is in Idle state");
    }

    public void clickOnStartProductSelectionButton()
    {
        System.out.println("Vending machine is in HasMoneState");
    }

    public void insertCoin(VendingMachine vendingMachine, Coins coin)
    {
        System.out.println("Vending machine is in HasMoneyState");
        System.out.println("Accepted the coin");
        vendingMachine.getCoinList().add(coin);
    }

    public ArrayList<Coins> refundFullMoney(VendingMachine vendingMachine)
    {
        System.out.println("Return the full amount back in the coin dispense tray");
        vendingMachine.setVendingMachineState(new VendingMachineState());
        return vendingMachine.getCoinList();
    }

    public void dispenseProduct(VendingMachine vendingMachine, Item item,  int itemCodeNumber)
    {
        System.out.println("Currently vending machine is in Dispense State");
        System.out.println("Product has been dispensed");
        vendingMachine.getInventory().updateSoldOutItem(itemCodeNumber);
        vendingMachine.setVendingMachineState(new VendingMachineState());
    }

    public void chooseProduct(VendingMachine vendingMachine, int itemCodeNumber)
    {
        Item item = vendingMachine.getInventory().getItem(itemCodeNumber);

        int paidByUser=0;
        for(Coins coin: vendingMachine.getCoinList())
        {
            paidByUser+=coin.getValue();
        }

        if(item.getPrice()>paidByUser)
        {
            refundFullMoney(vendingMachine);
        }

        else
        {
            getChange(item.getPrice(), paidByUser);
            dispenseProduct(vendingMachine, item, itemCodeNumber);
            return;
        }
    }

    public void getChange(int itemPrice, int paidByUser) 
    {
        System.out.println("Returned the change in the Coin Dispense Tray: " + (paidByUser- itemPrice));
    }  
}
