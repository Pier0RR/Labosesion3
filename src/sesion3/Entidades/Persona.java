/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion3.Entidades;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;

    private String telefono;
    private String direccion;
    private String correo;

    private String usuario;
    private String contraseña;
    private String email;

    public Persona(String nombre, String apellido, String dni,
            String telefono, String direccion, String correo, String usuario, String contraseña, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona() {
    }
    
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public static Persona Marcos(){
    return new Persona("Marcos");
    }
    
    public static Persona Carlos(){
        return new Persona("Carlos");
    }
    public static Persona Juanita(){
        return new Persona("Juana"); 
    }
}
