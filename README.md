# SpringBatch
SpringBatch in PCF using callable

cf push -p <path of jar> <APPNAME>
e.g cf push -p <path of jar> Spring-Batch
  
Commands to run the batch in PCF using schedule calls

This will create the call 
cf create-call APP-NAME CALL-NAME URL
e.g cf create-call Spring-Batch batchStart <routename>/batchService/start
  
RUN the call: This will run the batch job only once.
cf run-call CALL-NAME
e.g cf run-call batchStart

SCHEDULE the call: This will schedule the call
cf schedule-call CALL-NAME "* * * * *"
e.g. cf schedule-call batchStart "0 12 ? * *"
This example will run thejo every day at 12:00 PM.

VIEW call
cf calls

VIEW SCHEDULE for all calls
cf call-schedules

VIEW Call History of a particlar call
cf call-history my-call
e.g . cf call-history batchStart

DELETE a call
cf delete-call my-call
e.g. cf delete-call batchStart

DELETE Schedule call
cf delete-call-schedule <GUID>
  
GUID for schedule call can be retreved from the below command
cf call-schedules
