jit-examples
============

Without warmup:
    WorkIt took 95 ms. pi = 3.13652

With warmup:
    Warming up took 7496 ms. pi = 3.14118959999987
    WorkIt took 75 ms. pi = 3.13224

(95 - 75) / 95 = 21% boost

Using: -Djava.compiler=NONE 
    WorkIt took 279 ms. pi = 3.14604

-XX:CompileThreshold=100:
WorkIt took 143 ms. pi = 3.13716

-XX:CompileThreshold=500:
WorkIt took 102 ms. pi = 3.14064

-XX:CompileThreshold=1000:
WorkIt took 93 ms. pi = 3.13996

-XX:CompileThreshold=20000
WorkIt took 102 ms. pi = 3.13612

