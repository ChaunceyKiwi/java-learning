## Life Cycle 
* New − A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. It is also referred to as a born thread.
* Runnable − After a newly born thread is started, the thread becomes runnable. A thread in this state is considered to be executing its task.
* Waiting − Sometimes, a thread transitions to the waiting state while the thread waits for another thread to perform a task. A thread transitions back to the runnable state only when another thread signals the waiting thread to continue executing.
* Timed Waiting − A runnable thread can enter the timed waiting state for a specified interval of time. A thread in this state transitions back to the runnable state when that time interval expires or when the event it is waiting for occurs.
* Terminated (Dead) − A runnable thread enters the terminated state when it completes its task or otherwise terminates.

```mermaid
flowchart TD;
    Start("New Thread()") --> A("New")-->|"start()"|B("Runnable")-->|"run()"|C("Running")-->|"sleep(), wait()"|D("Waiting")-->E("Dead");
    C --> |"End of execution"|E
    A --> E

    style Start stroke-width:0px,fill-opacity:0
```
