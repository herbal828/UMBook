package umbook
import umbook.LoginController

class HomeController {
	
    def index = { 
		//log.error("En el index. params.logeado (${params})")
		if (!params.containsKey("logeado")){
			//redirect(action: login)
			redirect(controller:"usuario", action:"login")
		}else{
			
			redirect(controller: "usuario", action: "show")
				}	
	}
		
	
}
