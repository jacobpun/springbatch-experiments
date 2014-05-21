springbatch-experiments
=======================
SpringBatchPartitionerExperiment
--------------------------------
Execution Steps
1.  Start Derby DB (startNetworkServer -noSecurityManager)
2.  Start Active MQ
3.  Start Master Profile in port 8080 (mvn jetty:run with VM Argument -Dspring.profiles.active="master")
4.  Start Slave Profile in another port (mvn jetty:run with VM Arguments -Dspring.profiles.active="slave" -Djetty.port=8081)
5.  Execute the job via SpringBatch admin
