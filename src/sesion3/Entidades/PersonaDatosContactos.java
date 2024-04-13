/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion3.Entidades;

/**
 *
 * @author Estudiante
 */
public class PersonaDatosContactos {

        
    private String telefono;
    private String dirrecion;
    private String correo;

    public PersonaDatosContactos(String telefono, String dirrecion, String correo) {
        this.telefono = telefono;
        this.dirrecion = dirrecion;
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


}
