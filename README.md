🎓 Plataforma EAD - Educação a Distância com Microsserviços (Spring Boot)

📘 Visão Geral

Este projeto tem como objetivo desenvolver uma plataforma de Educação a Distância (EAD) robusta, escalável e de alta disponibilidade, utilizando arquitetura de microsserviços com Spring Boot.

A plataforma foi pensada para atender instituições de ensino, professores e alunos, oferecendo funcionalidades como:

Gestão de cursos e matrículas

Controle de acesso e autenticação

Acompanhamento do progresso dos alunos

Emissão de certificados

Gerenciamento de conteúdo educacional

🧩 Arquitetura de Microsserviços

A aplicação é composta por diversos microsserviços independentes e intercomunicáveis:

Serviços principais:

Auth Service: Autenticação e autorização via OAuth2/JWT

User Service: Gerenciamento de perfis de usuários (alunos, professores, admins)

Course Service: Cadastro de cursos, disciplinas e módulos

Enrollment Service: Controle de matrículas e progresso do aluno

Content Service: Gestão de conteúdos (vídeos, PDFs, quizzes, etc)

Notification Service: Envio de e-mails e notificações

Certificate Service: Emissão e validação de certificados

🚀 Tecnologias Utilizadas

Java 21

Spring Boot 3

Spring Cloud (Gateway, Config Server, Eureka)

OAuth2 / JWT

RabbitMQ

PostgreSQL / MongoDB

Docker / Docker Compose

Gradle

Swagger / OpenAPI

Grafana + Prometheus (monitoramento)

⚙️ Benefícios da Arquitetura

Deploys independentes

Escalabilidade individual por serviço

Melhor organização por domínio de negócio

Baixo acoplamento e alta coesão

Integração facilitada com sistemas externos

📌 Casos de Uso

Professores podem criar e gerenciar cursos e materiais.

Alunos podem se matricular e acompanhar aulas.

A plataforma emite certificados automaticamente.

Notificações são enviadas em eventos relevantes.

Admins têm acesso a painéis e relatórios de controle.

📂 Organização do Repositório

