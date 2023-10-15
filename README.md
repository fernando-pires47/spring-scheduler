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

## License

This application is available under the
[MIT license](https://opensource.org/licenses/MIT).
