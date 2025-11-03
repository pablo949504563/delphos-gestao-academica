package com.delphos.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) {
    vertx.createHttpServer().requestHandler(req -> {
        req.response()
          .putHeader("content-type", "text/plain")
          .end("Hello from Vert.x!");
      }).listen(8888)
      .onSuccess(http -> {
        System.out.println("HTTP server started on port 8888");
        startPromise.complete();
      })
      .onFailure(startPromise::fail);
  }
}
