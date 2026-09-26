# Design Patterns in Java

Small, runnable Java examples of the classic Gang of Four design patterns, written for low-level design (LLD) practice. Each pattern lives in its own folder with a `Main.java` that demonstrates it with a real-world scenario.

## Patterns

### Creational — how objects get created

| Pattern | Folder | Example |
| --- | --- | --- |
| Simple Factory | [Creational/simplefactory](Creational/simplefactory) | One static factory method returns an email or push notification based on a string. |
| Factory Method | [Creational/factory](Creational/factory) | Each `Notifier` subclass decides which `Notification` it creates. |
| Abstract Factory | [Creational/abstractfactory](Creational/abstractfactory) | Windows and Mac factories each produce a matching PDF reader and video player. |
| Builder | [Creational/builder](Creational/builder) | A separate `HttpRequestBuilder` assembles an `HttpRequest` and checks required fields at `build()`. |
| Nested Builder | [Creational/nestedbuilder](Creational/nestedbuilder) | The same HTTP request, with the builder as a static inner class `HttpRequest.Builder`. |
| Prototype | [Creational/prototype](Creational/prototype) | Game characters are cloned with a deep copy of their inventory. |
| Singleton | [Creational/singleton](Creational/singleton) | Eager, lazy, synchronized and double-checked variants, with notes on the trade-offs of each. |

### Structural — how objects are composed

| Pattern | Folder | Example |
| --- | --- | --- |
| Adapter | [Structural/adapter](Structural/adapter) | A WhatsApp service with its own method signature is wrapped to look like any other `Notification`. |
| Bridge | [Structural/bridge](Structural/bridge) | Alert and reminder notifications are kept separate from the SMS and email channels, so the two vary independently. |
| Composite | [Structural/composite](Structural/composite) | Files and folders are treated the same way in a file-system tree. |
| Decorator | [Structural/decorator](Structural/decorator) | Milk and sugar decorators stack on top of a coffee, each adding to its name and cost. |
| Facade | [Structural/facade](Structural/facade) | One `checkout()` call hides the steps and rollback of several subsystems. |
| Flyweight | [Structural/flyweight](Structural/flyweight) | Trees share cached `TreeType` objects instead of each storing its own copy. |
| Proxy | [Structural/proxy](Structural/proxy) | A proxy image loads from disk only when it is first printed, then reuses it. |

### Behavioural — how objects communicate

| Pattern | Folder | Example |
| --- | --- | --- |
| Chain of Responsibility | [behavioural/chainofresponsibility](behavioural/chainofresponsibility) | A leave request passes from team lead to manager to director until someone can approve it. |
| Command | [behavioural/command](behavioural/command) | A remote runs turn-on and turn-off commands for a light, without knowing how the light works. |
| Iterator | [behavioural/iterator](behavioural/iterator) | A playlist iterator walks songs forwards and backwards. |
| Mediator | [behavioural/mediator](behavioural/mediator) | Users send direct and broadcast messages through a chat room, never to each other directly. |
| Memento | [behavioural/memento](behavioural/memento) | A text editor saves snapshots to a history so it can undo. |
| Observer | [behavioural/observer](behavioural/observer) | Subscribers are notified when a YouTube channel uploads a video. |
| State | [behavioural/state](behavioural/state) | A vending machine behaves differently in its select, payment, dispense and refund states. |
| Strategy | [behavioural/strategy](behavioural/strategy) | A restaurant switches between bike and drone delivery at runtime. |
| Template Method | [behavioural/template](behavioural/template) | JSON and CSV processors share one fixed processing sequence and override only the steps that differ. |
| Visitor | [behavioural/visitor](behavioural/visitor) | Area and SVG visitors add new operations to circles and rectangles without changing the shape classes. |

## Running an example

Requires a JDK (17 or later). From the repository root, pass the pattern folder to `run.sh`:

```bash
./run.sh behavioural/state
./run.sh Structural/decorator
./run.sh Creational/builder
```

The script compiles the folder into `bin/` and runs its `Main` class. The singleton folder has no `Main`, so read its source files directly.

## Formatting and linting

[Prettier](https://prettier.io/) with the Java plugin is used for formatting. Install it once:

```bash
npm install
```

Then:

```bash
npm run format        # format all .java files
npm run format:check  # check formatting without changing files
npm run lint          # compile everything with all warnings as errors, then check formatting
```

## Layout

```
.
├── Creational/     creational patterns
├── Structural/     structural patterns
├── behavioural/    behavioural patterns
├── run.sh          compile and run one pattern
└── package.json    Prettier and lint scripts
```

Each folder's package name matches its path, for example `behavioural.state`, so `Main` runs as `behavioural.state.Main`.
