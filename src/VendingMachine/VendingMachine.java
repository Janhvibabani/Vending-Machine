package VendingMachine;


import java.util.ArrayList;

import coins.*;
import inventory.*;

public class VendingMachine {
    private VendingMachineState vendingMachineState;
    private Inventory inventory;
    private ArrayList<Coins> coinList;

    public VendingMachine()
    {
        vendingMachineState=new VendingMachineState();
        inventory=new Inventory(10);
        coinList=new ArrayList<>();
    }

    public VendingMachineState getVendingMachineState()
    {
        return this.vendingMachineState;
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState)
    {
        this.vendingMachineState=vendingMachineState;
    }

    public Inventory getInventory()
    {
        return this.inventory;
    }

    public void setInventory(Inventory inventory)
    {
        this.inventory=inventory;
    }

    public ArrayList<Coins> getCoinList()
    {
        return this.coinList;
    }

    public void setCoinList(ArrayList<Coins> coinList)
    {
        this.coinList=coinList;
    }
}
