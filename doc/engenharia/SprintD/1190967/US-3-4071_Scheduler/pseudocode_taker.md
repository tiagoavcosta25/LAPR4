Class ScriptTaker

    - Adiciona um Script à Fila de Espera
    - É criada como uma thread cada vez que o servidor do executor recebe um request
    - Faz a comunicacao com o Fluxo

    run(){

	    receberRequest() // recebe um script e um id de execucao de tarefa 

	    queue.addScript(id, script) // adiciona a uma fila a tarefa para executar
	
	    enviarResponse() // enviar uma resposta ao servidor do fluxo a mencionar que a tarefa foi adicionada a fila de execucao

    }