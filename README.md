# Sistema de Gerenciamento de Companhia Aérea

Este projeto é um sistema orientado a objetos desenvolvido para gerenciar as principais operações de uma companhia aérea, desde a compra de passagens até o momento do embarque.

## Arquitetura e Diagrama de Classes

A estrutura do sistema foi projetada para garantir modularidade e baixo acoplamento, utilizando interfaces e separação clara de responsabilidades.

![Diagrama de Classes da Companhia Aérea](CompanhiaAerea%20(1)_page-0001.jpg)

## 🚀 Funcionalidades Principais

* **Serviço de Compra (`ServicoCompra`):** 
  * Busca de voos disponíveis por origem, destino e data.
  * Realização de compra de passagens.
  * Integração com a interface `IPagamento` para processar diferentes formas de pagamento (`PagamentoCartaoCredito`, `PagamentoPix`).
* **Serviço de Check-in (`ServicoCheckin`):** 
  * Validação e confirmação de check-in utilizando o código localizador.
  * Visualização de assentos disponíveis na aeronave.
* **Serviço de Embarque (`ServicoEmbarque`):** 
  * Autorização de embarque do passageiro.
  * Fechamento do embarque do voo.
  * Emissão do cartão de embarque via interface `IEmissaoCartaoEmbarque`.
* **Gestão de Voos e Aeronaves (`Voo`, `Aviao`):** 
  * Controle de capacidade de assentos e status do avião.
  * Alocação de aeronaves para voos e controle de tripulação.
* **Gestão de Bagagens (`Bagagem`):** 
  * Verificação de limite de peso.
  * Cálculo de taxas extras utilizando a interface `IRegraTaxaBagagem`.

## 🛠️ Tecnologias e Padrões Estruturais

* **Linguagem:** Programação Orientada a Objetos (ex: Java, Python).
* **Design Patterns Aplicados:**
  * **Strategy:** Evidenciado no uso de interfaces como `IPagamento` (permitindo múltiplas estratégias de pagamento sem alterar o núcleo do sistema) e `IRegraTaxaBagagem`.
  * **Responsabilidade Única (SRP):** Separação de serviços como `ServicoCheckin` e `ServicoEmbarque` das classes de modelo (Voo, Passagem, Passageiro).

## 📦 Como Executar

1. Clone o repositório para sua máquina local.
2. Abra o projeto na sua IDE preferida.
3. Compile as dependências e execute a classe principal para iniciar o fluxo do sistema.
