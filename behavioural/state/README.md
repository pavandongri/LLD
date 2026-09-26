# State Pattern — Vending Machine

The **State** pattern lets an object change its behaviour when its internal state changes. Instead of one class full of `if (state == ...)` checks, each state becomes its own class, and the object hands every request to whichever state it is in right now.

This example models a vending machine. The same four buttons (select, insert money, dispense, refund) behave differently depending on where the customer is in the purchase.

## Structure

| File | Role |
| --- | --- |
| [VendingMachineState.java](VendingMachineState.java) | The state interface. Declares the four actions every state must handle. |
| [VendingMachine.java](VendingMachine.java) | The context. Holds the current state, the selected product and the balance, and passes each action to the current state. |
| [SelectProductState.java](SelectProductState.java) | Idle. Waiting for the customer to pick a product. |
| [AwaitingPaymentState.java](AwaitingPaymentState.java) | A product is chosen. Collecting money until the price is covered. |
| [ProductDispenseState.java](ProductDispenseState.java) | Fully paid. Ready to hand over the product. |
| [RefundState.java](RefundState.java) | Product dispensed, but change is still owed. |
| [Product.java](Product.java) | Enum of products with a code, name and price. |
| [Main.java](Main.java) | Demo that runs several customer scenarios. |

## State transitions

```
                selectProduct(valid code)
 SelectProduct ─────────────────────────────► AwaitingPayment
      ▲                                          │      │
      │            getRefund()                   │      │ insertAmount() until
      ├──────────────────────────────────────────┘      │ balance >= price
      │                                                 ▼
      │   dispenseProduct() with no change         ProductDispense
      ├─────────────────────────────────────────────────┤
      │                                                 │ dispenseProduct()
      │            getRefund()                          │ with change owed
      └──────────────────────────────── Refund ◄────────┘
```

What each action does in each state:

| Action | SelectProduct | AwaitingPayment | ProductDispense | Refund |
| --- | --- | --- | --- | --- |
| `selectProduct` | Selects product → AwaitingPayment | Rejected | Rejected | Rejected |
| `insertAmount` | Rejected | Adds to balance; → ProductDispense once paid | Rejected | Rejected |
| `dispenseProduct` | Rejected | Rejected (shows amount still due) | Dispenses; → Refund if change owed, else reset | Rejected |
| `getRefund` | Rejected | Cancels order, returns money, reset | Cancels order, returns money, reset | Returns change, reset |

## Design notes

- **One instance per state.** The states store no data of their own, so `VendingMachine` creates each one once in its constructor and reuses it.
- **States drive the transitions.** Each state decides what comes next and calls `vendingMachine.setState(...)`. The machine itself never checks which state it is in.
- **Package-private internals.** `setState`, the balance methods and the state getters have no access modifier, so only classes in `behavioural.state` can use them. Outside code can only use the public customer actions: `selectProduct`, `insertAmount`, `dispenseProduct`, `getRefund` and `showMenu`.
- **Adding a state** means writing one new class that implements `VendingMachineState`, plus wiring its transitions. The other states stay untouched.

## Running

From the repository root:

```bash
./run.sh behavioural/state
```

The demo covers:

1. Invalid actions before a product is selected.
2. Paying in parts, overpaying and collecting change.
3. Paying the exact amount, so no refund step is needed.
4. Cancelling after inserting money.

Every state change is printed as `[state -> ...]`, so you can follow the transitions in the output.
