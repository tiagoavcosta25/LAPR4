function refreshPendingTasks() {
	var request = new XMLHttpRequest();
        var vBoard=document.getElementById("pendingTasks");
        
        request.onload = function() {
            vBoard.innerHTML = this.responseText;
            vBoard.style.color="black";
            setTimeout(pendingTasks, 2000);
            };
            
        request.ontimeout = function() {
            vBoard.innerHTML = "Server timeout, still trying ...";
            vBoard.style.color="red";
            setTimeout(pendingTasks, 100);
        };
        
        request.onerror = function() { 
            vBoard.innerHTML = "No server reply, still trying ...";
            vBoard.style.color="red";
            setTimeout(pendingTasks, 5000);
        };
        
  	request.open("GET", "/tasks", true);
	request.timeout = 5000;
  	request.send();
	}
	

