A.What is your design and implementation?


The Queue Object can only be shared with two thread running within same programme:
if we want to run two saparate programme then we can not share Object without Marshalling(send it by converting it in binary and send via disk or local port) it,and if we Marshalle it we can not update it on both end.

so come up with simple solution by using Thread.

       Prime(thread-1) ===== Randomizer(thread-2) (both class share two Queue) 

now Both can acess Queue.


B:Sample Output:

689863550 : false
-1613191796 : true
-728887353 : true
-1411371960 : true
774572433 : false
1338315065 : false
1130393670 : false
-1127272475 : true
664029380 : false
1487008650 : false
21941075 : false
-1151893964 : true
-599345791 : true
299265750 : false
-1042428115 : true
206115433 : true


c : Further work – if you have all the time in the world how would you implement
=>JMS is the best option for Java and RabbitMQ for cross Plateform.
=>if we want to distribute Queue within local thread then java.util.concurrent.BlockingDeque is best solution.

