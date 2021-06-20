Class FCFSQueue

    - Uma Fila Geral
    - Ao receber uma nova tarefa do taker, insere a mesma na fila geral
    - Cada thread irá buscar, uma de cada vez e por ordem de chegada, o id das tasks da fila geral
    - Referente ao First Come First Served, utilizando ReentrantLock definido a true e seus métodos para tal
    - Uma lock Geral

    addScript(Id Tarefa Execucao e Conteudo do Script){

        add(task) // adiciona a task a fila de espera que determinou ser a com menos carga

        up(sem)
    }
	
	addToQueue(Id tarefa ) {
        queue.add(id tarefa); // adiciona a task à fila de espera geral
        
		lock.notify // Usado como up de semáforo para wait
    }
	
	peekQueue() {
		lock() // Usado como down de semáforo, usado para bloquear acessos múltiplos à queue partilhada
		
		queue.getFirst() // Vê o primeiro da queue
		
		unlock() // Usado como up de semáforo
	}
	

    removeFromQueue(){

	    if(queue is empty){
            lock.wait() // funciona como down semáforo até receber notify
        }

        return queue.remove() // vai buscar um id de tarefa à queue geral
    }