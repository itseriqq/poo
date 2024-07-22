compilar:

javac {nome do arquivo.java}

para rodar:

java {nome do arquivo.class (sem colocar o .class)}

- mkdir build (Cria o repositorio build) ou -mkdir ../build (Cria repositorio build fora da src)

javac -d build App.java (constroi o app.class no diretorio build dado que o -d passa o diretorio)
java -cp build / App ( o -cp eh 'class pass', ou seja, estamos passando qual o nome do arquivo que deve ser rodado)
ou java -cp ../build/ App (../build/ pra pegar o .class na build criada fora da src)


pasta doc é referente a aula08, que foi pautada na documentação do código, portanto, basta abrir com LiveServer e abrir a pasta doc, assim será possível verificar como fica a documentação e os 'comentarios' deixados ao longo do código 'Estudante.java' dentro do package 'universidade' para explicar a classe e seus métodos.
