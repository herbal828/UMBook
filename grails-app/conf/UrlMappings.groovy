class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"()
		"/"(controller:'usuario',action:'login')
		//"/"(view:"/index")
		"500"(view:'/error')
		
		"/home/login/validar" (controller: "home", parseRequest:true){
			action = [POST: "loginValidar"]
		}
		
		"/home" (controller: "home", parseRequest:true){
			action = [GET: "index"]	
		}
		
	}
}
