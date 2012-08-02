package umbook

class UsuarioController {

//    def index = { }
//

	def scaffold = Usuario	
	
	def login = {} //NOS VA A MOSTRAR LA IMAGEN POR DEFECTO
	
      def authenticate = {
	  
	  def usuario = Usuario.findByUsuarioAndPassword(params.usuario, params.password)
	  if(usuario){
		session.usuario = usuario
		flash.message = "Bienvenido ${params.usuario}!"
		redirect(action:"list")
		
		//redirect(controller:"usuario", action:"list")
	  }else{
		flash.message = "Perdona, ${params.usuario}.INGRESA CORRECTAMENTE TUS DATOS"
		redirect(action:"login")
	  }
	}
	
	def logout = {
	  flash.message = "ADIOS ${session.usuario.nombre}"
	  session.usuario = null
	  redirect(controller:"usuario", action:"login")
	}
//	def verdatos() {
//		def ver = Usuario.get(params.nombre)
//		ver.nombre = Nombre.get(params["nombre.nombre"])
//		ver.save()
//
//		// redirect to a scaffolded action
//		redirect(action:show)
//	}
//	def changeAuthor() {
//		def b = Book.get(params.id)
//		b.author = Author.get(params["author.id"])
//		b.save()
//
//		// redirect to a scaffolded action
//		redirect(action:show)
//	}
}
