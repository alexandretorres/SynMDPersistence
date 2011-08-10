Para execução dentro do ambiente Eclipse:

- Instalar Java runtime (se ainda não estiver instalado)
- Instalar o eclipse (http://www.eclipse.org)
- Executar eclipse pela primeira vez, escolher a pasta de workspace.
- Copiar este diretório para a pasta workspace.
- Vá em eclipse->import. Escolhe Import existing projects. Selecione a pasta deste projeto.
- Clique com o botao da direita nos arquivos .launch e selecione o menu Run As... 
  OU
  expanda a pasta src até o arquivo de exemplo a executar, clique com o botao da direita, selecione Run As e escolha Java Application
  
Para execução por linha de comando

- Instalar Java runtime (se ainda não estiver instalado)
- Descompactar o projeto (por exemplo c:\dev\aula ou /users/ATorres )
- Abra a linha de comando
- Chame o java runtime machine passando como parâmetro o classpath e o projeto:
	java -cp <CLASSPATH> <CAMINHO COMPLETO PARA A CLASSE>
	
	sendo que o classpath deve apontar para a pasta "bin"
	
	No Windows:
	java -cp c:\dev\aula\AtivDidat\bin br.ufrgs.inf.ex1.Exemplo1
	No (Li)(U)nix:
	java -cp /users/ATorres/AtivDidat/bin br.ufrgs.inf.ex2.Exemplo2

	A classe deve ter o método MAIN ou ocorrerá um erro.
	Atenção para utilizar corretamente maiusculas e minusculas.


