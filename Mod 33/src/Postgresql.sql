CREATE TABLE acessorio (
  id SERIAL PRIMARY KEY,
  nome VARCHAR(255),
  carro_id BIGINT UNIQUE,
  FOREIGN KEY (carro_id) REFERENCES carro(id)
);

CREATE TABLE carro (
  id SERIAL PRIMARY KEY,
  modelo VARCHAR(255),
  acessorio_id BIGINT UNIQUE,
  marca_id BIGINT,
  FOREIGN KEY (acessorio_id) REFERENCES acessorio(id),
  FOREIGN KEY (marca_id) REFERENCES marca(id)
);

CREATE TABLE marca (
  id SERIAL PRIMARY KEY,
  nome VARCHAR(255)
);

