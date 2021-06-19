Class ScriptQueueScheduler

    - Uma Fila Por Thread
    - Ao receber uma nova tarefa do taker, insere a mesma na fila da thread com maior disponibilidade e menor carga
    - Referente ao Algoritmo Scheduler
    - Uma lock por Thread

    addScript(Id Tarefa Execucao e Conteudo do Script){

	    for each QUEUE in QUEUE_LIST{
            if(queue.size() < currentMinumumSize){
               // esta thread tem menos carga atual na sua lista 
            }
        }

        add(task) // adiciona a task a fila de espera que determinou ser a com menos carga

        up(sem[Thread Com Menor Carga])
    }

    getScriptForExecution(Numero da Thread){

	    if(myQueue is empty){
            down(sem[Numero da Thread])
        }

        myQueue.remove() // vai buscar uma tarefa a queue da thread
    }

---

Class ScriptQueueFCFS

    - Uma Fila Geral
    - Ao receber uma nova tarefa do taker, insere a mesma na fila geral
    - Cada thread irá buscar, uma de cada vez e por ordem de chegada, as tasks da fila geral
    - Referente ao First Come First Served
    - Uma lock Geral

    addScript(Id Tarefa Execucao e Conteudo do Script){

        add(task) // adiciona a task a fila de espera que determinou ser a com menos carga

        up(sem)
    }

    getScriptForExecution(Numero da Thread){

	    if(queue is empty){
            down(sem)
        }

        queue.remove() // vai buscar uma tarefa a queue geral
    }