package micronaut.test.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

@Controller("/bar")
public class BarController {

  @Get("/{id}")
  public String get(@QueryValue long id) {
    return "bar id = " + id;
  }
}
