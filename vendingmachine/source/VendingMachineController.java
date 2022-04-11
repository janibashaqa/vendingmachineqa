package vendingmachine.source;

public interface VendingMachineController {

    CoinBundle calculateChange(VendingMachineRequest request);
}
