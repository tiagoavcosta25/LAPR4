Class ScriptHandler

    - Abstrata
    - Trata e executa uma tarefa automatica
    - É criada como uma thread cada vez que o servidor do executor recebe um request
    - Faz a comunicacao com o Fluxo

    executeTask(Id Tarefa Execucao e Conteudo do Script){

	    task = findByID(id) // pesquisar a tarefa execucao a datebase

        ticket = getTicketByTaskExec(id) // pesquisa o pedido referente a esta tarefa execucao

	    executeAutoTask(ticket, script) // executa o script conforme a gramatica desenvolvida pela equipa

        task.setResult(resultado da execucao) // define o resultado da execucao

        save(task) // persiste o na database
    }

---

Class ScriptHandlerScheduler extende ScriptHandler

    - Trata e executa uma tarefa automatica
    - É criada como uma thread cada vez que o servidor do executor recebe um request
    - Faz a comunicacao com o Fluxo

    run(){

	    while(true){
            tarefa = queue.getScriptForExecution(numeroThread) //vai buscar a proxima tarefa na sua fila de espera (unica a esta thread)

            executeTask(Id Tarefa Execucao e Conteudo do Script) //invoca o metodo da superclasse
        }
    }