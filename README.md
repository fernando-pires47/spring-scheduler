# Spring Scheduler
Example Scheduler in spring application

### Dependencies
* Docker
* Docker Compose
* Java 17

### To Run

Execute in root directory:

```bash
sudo docker-compose up -d 
```

To see project logs run

```bash
sudo docker-compose logs spring-scheduler -f
```

### Schedulers 

fixedRate : makes Spring run the task on periodic intervals even if the last invocation may still be running.
fixedDelay : specifically controls the next execution time when the last execution finishes.
cronJob: automating tasks that run on the background periodically

To use cron

@Scheduled(cron = “1 2 3 4 5 6")

* 1: Second (0-59)
* 2: Minute (0-59)
* 3: Hour (0-23)
* 4: Day (0-31)
* 5: Month (1-12)
* 6: Day of the week (0-6)


Example use cases

* "0 0 * * * *" = the top of every hour of every day.
* "*/10 * * * * *" = every ten seconds.
* "0 0 8-10 * * *" = 8, 9 and 10 o'clock of every day.
* "0 0 8,10 * * *" = 8 and 10 o'clock of every day.
* "0 0/30 8-10 * * *" = 8:00, 8:30, 9:00, 9:30 and 10 o'clock every day.
* "0 0 9-17 * * MON-FRI" = on the hour nine-to-five weekdays
* "0 0 0 25 12 ?" = every Christmas Day at midnight

## License

This application is available under the
[MIT license](https://opensource.org/licenses/MIT).
