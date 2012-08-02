package umbook

class Usuario {
	
	String nombre
	String apellido
	String email
	String direccion
	Long telefono
	String usuario
	String password
	Date fechaNac
	
	
    static constraints = {
		
		nombre(maxSize:20, nullable:false, blank:false)
		apellido(maxSize:25, nullable:false, blank:false)
		email(maxSize:50, nullable:false, blank:false)
		direccion(maxSize:40, nullable:false, blank:false)
		usuario(unique:true, maxSize:20, nullable:false, blank:false)
		password(password:true, maxSize:20, nullable:false, blank:false)
		fechaNac(blank:false, attributes: [precision: "day"])
		//nombre()
    }

	static mapping = {
		table 'USUARIO'
			}
	
	}
