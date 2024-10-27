CREATE database restauranteBD;

USE restauranteBD;

CREATE TABLE forma_pagamento (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
);

CREATE TABLE status_entrega (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
);

CREATE TABLE restaurante (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    categoriaId INT,

    FOREIGN KEY (categoriaId) REFERENCES categoria(id)
);

CREATE TABLE categoria (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
);

CREATE TABLE restaurante_pagamento (
	id INT AUTO_INCREMENT PRIMARY KEY,
    restauranteId INT,
    formaPagamentoId INT,
    
    FOREIGN KEY (restauranteId) REFERENCES restaurante(id),
    FOREIGN KEY (formaPagamentoId) REFERENCES forma_pagamento(id)
);

CREATE TABLE produto (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    preco FLOAT NOT NULL
);

CREATE TABLE acompanhamento (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    preco FLOAT NOT NULL
);

CREATE TABLE produto_acompanhamento (
	id INT AUTO_INCREMENT PRIMARY KEY,
    produtoId INT,
    acompanhamentoId INT,
    
    FOREIGN KEY (produtoId) REFERENCES produto(id),
    FOREIGN KEY (acompanhamentoId) REFERENCES acompanhamento(id)
);

CREATE TABLE endereco (
	id INT AUTO_INCREMENT PRIMARY KEY,
    cep VARCHAR(255) NOT NULL,
    estado VARCHAR(255) NOT NULL,
    cidade VARCHAR(255) NOT NULL,
    bairro VARCHAR(255) NOT NULL,
    rua VARCHAR(255) NOT NULL
);

CREATE TABLE produto_carrinho (
	id INT AUTO_INCREMENT PRIMARY KEY,
    produtoId INT,
    pedidoId INT,

    FOREIGN KEY (produtoId) REFERENCES produto(id)
    FOREIGN KEY (pedidoId) REFERENCES pedido(id)
);

CREATE TABLE produto_carrinho_acompanhamento (
	id INT AUTO_INCREMENT PRIMARY KEY,
    produtoAcompanhamentoId INT,
    pedidoId INT,

    FOREIGN KEY (produtoAcompanhamentoId) REFERENCES produto_acompanhamento(id),
    FOREIGN KEY (pedidoId) REFERENCES pedido(id)
);

CREATE TABLE pedido (
	id INT AUTO_INCREMENT PRIMARY KEY,
    enderecoId INT,
    formaPagamentoId INT,
    statusEntregaId INT,
    valorTotal FLOAT
);

CREATE TABLE avaliacao(
	id INT AUTO_INCREMENT PRIMARY KEY,
    restauranteId INT,
    descricao VARCHAR(255),
    nota INT,
    
    FOREIGN KEY (restauranteId) REFERENCES restaurante(id)
);

CREATE TABLE promocao(
	id INT AUTO_INCREMENT PRIMARY KEY,
    restauranteId INT,
    produtoId INT,
	descontoPorcentagem FLOAT,
    
    FOREIGN KEY (restauranteId) REFERENCES restaurante(id),
    FOREIGN KEY (produtoId) REFERENCES produto(id)
);

CREATE TABLE historico_pagamento(
	id INT AUTO_INCREMENT PRIMARY KEY,
    pedidoId INT,
    restauranteId INT,
    formaPagamentoId INT,
    promocaoId INT,
    dataPagamento DATE,
    horarioPagamento TIME,
    
    FOREIGN KEY (pedidoId) REFERENCES pedido(id),
    FOREIGN KEY (restauranteId) REFERENCES restaurante(id),
    FOREIGN KEY (formaPagamentoId) REFERENCES forma_pagamento(id),
    FOREIGN KEY (promocaoId) REFERENCES promocao(id)
);

CREATE TABLE historico_entrega(
	id INT AUTO_INCREMENT PRIMARY KEY,
    pedidoId INT,
    restauranteId INT,
    statusEntregaId INT,
    dataEntrega DATE,
    horarioEntrega TIME,
    
    FOREIGN KEY (pedidoId) REFERENCES pedido(id),
    FOREIGN KEY (restauranteId) REFERENCES restaurante(id),
    FOREIGN KEY (statusEntregaId) REFERENCES status_entrega(id)
);
