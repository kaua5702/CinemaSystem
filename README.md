## 🎬 CinemaSystem
Um sistema simples de gerenciamento de cinema em Java.
Permite criar sessões de filmes, visualizar assentos disponíveis em formato de matriz, reservar assentos e gerar ingressos (com opção de meia-entrada).

---

## 📌 Funcionalidades
- Criar filmes e sessões com preço base.
- Mostrar mapa de assentos em formato de matriz (fileiras A–P, 10 assentos por fileira).
- Reservar assentos com validação de disponibilidade.
- Gerar ingressos com preço final (inteira ou meia-entrada).
- Exibir mapa atualizado após cada reserva.
- Simulação com delays para parecer um sistema real.

---

## 🚀 Como executar
- Clone ou baixe o projeto.
- Compile os arquivos Java:
```
javac -d target/classes src/com/kauabiscotto/CinemaSystem/*.java
```
- Execute o programa principal:
```
java -cp target/classes com.kauabiscotto.CinemaSystem.Main
```

---

## 🖥️ Exemplo de saída

Welcome to the Cinema!

Session of movie: Matrix | Room: 1 | Hour: Wed Mar 18 22:26:33 GMT-03:00 2026 | Price: R$20.0



Loading seat map...

A | [A1] [A2] [A3] [A4] [A5] [A6] [A7] [A8] [A9] [A10] 

...

P | [P1] [P2] [P3] [P4] [P5] [P6] [P7] [P8] [P9] [P10] 



Enter the seat you want to reserve: N8

Is it a half-price ticket? (y/n): y



Generating ticket...

Ticket generated:

Ticket: Movie Matrix | Room 1 | Hour Wed Mar 18 22:26:33 GMT-03:00 2026 | Seat N8 | Price R$10.0



Updating seat map...

N | [N1] [N2] [N3] [N4] [N5] [N6] [N7] [X] [N9] [N10]

---

## 📂 Estrutura do projeto

CinemaSystem/

 ├── src/com/kauabiscotto/CinemaSystem/
 
 │    ├── Main.java        # Classe principal
 
 │    ├── Movie.java       # Representa um filme
 
 │    ├── MovieGenre.java  # Enum de gêneros
 
 │    ├── Session.java     # Representa uma sessão de cinema
 
 │    ├── Ticket.java      # Representa um ingresso
 
 └── target/classes/       # Arquivos compilados

---


