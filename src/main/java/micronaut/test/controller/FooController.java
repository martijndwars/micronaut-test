package micronaut.test.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

@Controller("/foo")
public class FooController {

  @Get("/{id}")
  public String get(@QueryValue long id) {
    return "foo id = " + id;
  }
}
