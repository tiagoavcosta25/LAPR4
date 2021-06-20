Class FCFSHandler

    - Representa um colaborador
    - Uma thread é criada por colaborador existente
	- Faz parte do fluxo, então após dar assign, o fluxo avança

    assignTask(Id Tarefa Execucao ){

	    task = findByID(id) // pesquisar a tarefa execucao na datebase

        mte.assignCollaborator(this.collab) // Dá assign da tarefa ao colaborador que a thread representa

        save(task) // persiste a task na database
    }
