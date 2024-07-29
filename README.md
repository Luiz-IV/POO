Classe Suporte:

    É a classe abstrata base para todos os níveis de suporte.
    Contém uma referência ao próximo objeto Suporte na cadeia, chamado proximoSuporte.
    Define o método abstrato tratarProblema, que deve ser implementado pelas subclasses para tratar problemas específicos.

Classe SuporteBasico:

    Representa o primeiro nível de suporte, responsável por problemas básicos.
    Implementa o método tratarProblema, resolvendo problemas simples ou passando a responsabilidade para o próximo nível na cadeia.

Classe SuporteTecnico:

    Representa o segundo nível de suporte, responsável por problemas técnicos.
    Implementa o método tratarProblema, resolvendo problemas técnicos ou passando a responsabilidade para o próximo nível na cadeia.

Classe SuporteEspecializado:

    Representa o nível mais alto de suporte, responsável por problemas especializados.
    Implementa o método tratarProblema, resolvendo problemas especializados ou indicando que o problema não pode ser resolvido.

Classe ChainOfResponsibilityDemo:

    Classe principal para demonstrar o uso do padrão Chain of Responsibility.
    Configura a cadeia de suporte e testa a passagem de problemas através dos diferentes níveis de suporte.