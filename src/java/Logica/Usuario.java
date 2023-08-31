
package Logica;




public class Usuario {
    
    private String nombre;
    private String celular;
    private String correoElectronico;
    private String contraseña;
    
    public Usuario(){
    
}

    public Usuario( String nombre, String celular, String correoElectronico, String contraseña) {
        
        this.nombre = nombre;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
    }

    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    
    
}


