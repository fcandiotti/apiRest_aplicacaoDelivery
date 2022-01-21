<h1> **API Rest Simulando um Sistema de Delivery** 🛵 📲 </h1>
---

## Tecnologias Utilizadas: 💻

- Java 11
- Spring Boot 2.4.1
- Spring Web
- Spring JPA
- Banco de Dados H2
- Banco de Dados PostegresSQL
- Spring Security
---

## Setup inicial do projeto: 🧾

>- Dependências
>- Arquivos . properties
>- Configuração de segurança(Preparado para integração com frontend)
>- Modelo de domínio
>- Entidades e relacionamentos
>- Mapeamento objeto-relacional
>- Seed
>- Criar endpoints
>- Trás todos os produtos por ordenados pelo nome(ASC)
>- Trás todos os pedidos ordenando pela situação(Pendente, entregue)
>- Cria um novo pedido(Situação Pendente de entrega)
>- Atualiza pedido para "Entregue"
>- Validar perfil dev
>- Base de dados Postgres local
---

## Dicas para utilização com banco PostgressSQL: 💡

<p>1- Necessário alterar o applications.properties para perfil: **dev**</p>
<p>2- Descomentar na primeira utilização as linhas applications-dev para criar o arquivo create.sql</p>
<p>3- No applications-dev, configurar de acordo com o seu banco de dados(senha, username)</p>
<p>4- Criar as tabelas no PostgressSQL com bate no arquivo create.sql</p>
<p>5- Inserir a carga de dados que inicial no PostgressSQL</p>
<p>6- Após feito todas as etapas anteriores, comentar novamente os comandos e excluir o arquivo create.sql.</p>
---

## Testes com o Postman: 🛠

###### Filtrar todos os produtos por em ordem ASC de nome:
`curl --location --request GET 'http://localhost:8080/products'`

###### Filtrar todos os pedidos por em ordem da situação de entrega(Pendente, Entregue):
`curl --location --request GET 'http://localhost:8080/orders'`

###### Cadastrar um novo pedido(Por padrão a situação é pendente:
`curl --location --request POST 'http://localhost:8080/orders' \
--header 'Content-Type: application/json' \
--data-raw '{
"address": "Avenida Paulista, 1500",
"latitude": -23.56168,
"longitude": -46.656139,
"products": [
{
"id": 2
},
{
"id": 5
}
]
}'`

###### Alterar a situação do pedido para finalizado:
`curl --location --request PUT 'http://localhost:8080/orders/3/delivered`


