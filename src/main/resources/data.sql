CREATE TABLE task (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL
);

INSERT INTO task (name, description) VALUES
  ('Task1', 'Primeira tarefa'),
  ('Task2', 'Segunda tarefa'),
  ('Task3', 'Terceira tarefa');