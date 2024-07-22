RequestHandler: Define a interface para os manipuladores e mantém uma referência para o próximo manipulador na cadeia.
ConcreteHandler1 e ConcreteHandler2: Implementam manipuladores concretos que podem processar solicitações de tipos específicos. Se não puderem lidar com a solicitação, a passam para o próximo manipulador na cadeia.
Main: Configura a cadeia de manipuladores e cria diferentes tipos de solicitações para demonstrar o padrão.
