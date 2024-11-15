package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.joda.time.Days;
import org.joda.time.LocalDate;

@RestController
public class MyController{

    @GetMapping("/")
        public String index() {
            return "Greetings from SpringBoot!";
        }

/*@GetMapping("/")
    public Days daysToNewYear(LocalDate fromDate) {
        LocalDate newYear = fromDate.plusYears(1).withDayOfYear(1);
        return Days.daysBetween(fromDate, newYear);
    }

 */
}
