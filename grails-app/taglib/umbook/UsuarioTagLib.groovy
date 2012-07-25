package umbook

class UsuarioTagLib {

	def loginControl = {
		if(session.usuario){
		  out << "HOLA ${session.usuario.nombre} "
		  out << """[${link(action:"logout", controller:"usuario"){"Logout"}}]"""
		} else {
		  out << """[${link(action:"login", controller:"usuario"){"Login"}}]"""
		}
	  }
}
