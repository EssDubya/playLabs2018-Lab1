// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Sue/Downloads/helloworld/conf/routes
// @DATE:Sun Apr 01 11:41:16 BST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
