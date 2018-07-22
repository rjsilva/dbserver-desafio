$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/realizar-compra/realizar-comprar.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#Author: Ronaldo silva"
    },
    {
      "line": 3,
      "value": "#Version: 1.0"
    },
    {
      "line": 4,
      "value": "#Encoding: UTF-8"
    }
  ],
  "line": 5,
  "name": "- realizar compras loja virtual",
  "description": "",
  "id": "--realizar-compras-loja-virtual",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 2761043636,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "CT001 - realizar uma compra produto qualquer no loja virtual",
  "description": "",
  "id": "--realizar-compras-loja-virtual;ct001---realizar-uma-compra-produto-qualquer-no-loja-virtual",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@chrome"
    },
    {
      "line": 7,
      "name": "@CTRCON001"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que eu estiver no site da loja virtual",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "escolho um produto qualquer na loja e adiciono o produto ao carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "realize o cadastro do cliente preenchendo todos os campos obrigatorios dos formularios",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "aceito os termos de servico e clico em prosseguir",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "selecione um metodo de pagamento e clico em prosseguir",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "devo visualizar uma mensagem \"your order on my store is complete\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "RealizarCompraLojaVirtualSteps.queEuEstiverNoSiteDaLojaVirtual()"
});
formatter.result({
  "duration": 16009257251,
  "status": "passed"
});
formatter.match({
  "location": "RealizarCompraLojaVirtualSteps.escolhoUmProdutoQualquerNaLojaEAdicionoOProdutoAoCarrinho()"
});
formatter.result({
  "duration": 32179881121,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.38.552518 (183d19265345f54ce39cbb94cf81ba5f15905011),platform\u003dMac OS X 10.12.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027192.168.0.104\u0027, ip: \u0027fe80:0:0:0:453:881f:7045:8c70%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552518 (183d19265345f5..., userDataDir: /var/folders/fl/ghlxsmxx7bq...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.99, webStorageEnabled: true}\nSession ID: 3d584f85b92eda00eaafca1df67d66bd\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:482)\n\tat br.com.dbserver.commons.SeleniumRobot.scroll(SeleniumRobot.java:42)\n\tat br.com.dbserver.functionality.RealizarCompraOnlineFuncionalidade.chooseProduct(RealizarCompraOnlineFuncionalidade.java:49)\n\tat br.com.dbserver.steps.RealizarCompraLojaVirtualSteps.escolhoUmProdutoQualquerNaLojaEAdicionoOProdutoAoCarrinho(RealizarCompraLojaVirtualSteps.java:34)\n\tat ✽.E escolho um produto qualquer na loja e adiciono o produto ao carrinho(features/realizar-compra/realizar-comprar.feature:10)\n",
  "status": "failed"
});
formatter.match({
  "location": "RealizarCompraLojaVirtualSteps.realizeOCadastroDoClientePreenchendoTodosOsCamposObrigatoriosDosFormularios()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RealizarCompraLojaVirtualSteps.aceitoOsTermosDeServicoEClicoEmProsseguir()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RealizarCompraLojaVirtualSteps.selecioneUmMetodoDePagamentoEClicoEmProsseguir()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "your order on my store is complete",
      "offset": 30
    }
  ],
  "location": "RealizarCompraLojaVirtualSteps.devoVisualizarUmaMensagem(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 146953735,
  "status": "passed"
});
});