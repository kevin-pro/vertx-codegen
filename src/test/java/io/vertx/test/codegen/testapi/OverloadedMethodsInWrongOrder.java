package io.vertx.test.codegen.testapi;

import io.vertx.codegen.annotations.VertxGen;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface OverloadedMethodsInWrongOrder {

  void foo(String str, int i, double d);

  void foo(String str, double d);
}
