
#Use Case Document

Use Case:  Set Appointment

Id:  1

Description
A scheduler will set a drive appointment.

Level: User Goal

Primary Actor
Scheduler

Pre-Conditions
A scheduler will set a drive appointment.

Post Conditions

Success end condition
Instructor will be notified.

Failure end condition:
Scheduler will not be able to setup appointment.

Trigger
Scheduler clicks create.

_________________________________________________________________________

Use Case:  Accept Appointment

Id:  2

Description
Instructor will accept appointment.

Level: User Goal

Primary Actor
Instructor

Pre-Conditions
Instructor must download app, scheduler must have set drive appointment.

Post Conditions

Success end condition
Scheduler will be notified of acceptance.

Failure end condition:
Scheduler and Instructor will not have appointment in drive.

Trigger
Instructor clicks accept.

_________________________________________________________________________

Use Case:  Schedule student for drive

Id:  3

Description
Scheduler will schedule a time for a student to drive

Level: User Goal

Primary Actor
Scheduler

Pre-Conditions
Instructor has accepted appointment

Post Conditions

Success end condition
Student will be notified of appointment.

Failure end condition:
Scheduler and Instructor will not have appointment in drive.

Trigger
Scheduler clicks manage drive.

_________________________________________________________________________

Use Case:  Schedule accepts appointment

Id:  4

Description
Student accepts time to drive.

Level: User Goal

Primary Actor
Student

Pre-Conditions
Student has appointment scheduled.

Post Conditions

Success end condition
Instructor is notified.

Failure end condition:
Instructor never receives notification.

Trigger
Scheduler clicks accept.

_________________________________________________________________________

Use Case:  Student cancels appointment

Id:  5

Description
Student cancels time on drive

Level: User Goal

Primary Actor
Student

Pre-Conditions
Student has appointment cancelled.

Post Conditions

Success end condition
Instructor is notified.

Failure end condition:
Student will still have appointment in drive.

Trigger
Student clicks delete.

