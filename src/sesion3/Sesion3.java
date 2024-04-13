/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion3;

import sesion3.Entidades.Persona;
import sesion3.Entidades.Persona2;
import sesion3.Entidades.PersonaDatoRegistros;
import sesion3.Entidades.PersonaDatosContactos;
import sesion3.Entidades.PersonasDatosBasicos;

public class Sesion3 {

    
    public static void main(String[] args) {
        
        
        Persona per=new Persona();
            
            per.setNombre("Juan");
            per.setApellido("Paz");
            per.setDni("0005554");
            per.setTelefono("995165156");
            per.setDireccion("Calle Mazanita 45");
            per.setCorreo("juancito@gmail.com");
            per.setUsuario("juanito123");
            per.setContraseña("123456");
            per.setEmail("juanjuan1@pepito.com");
            
            PersonasDatosBasicos dataB= new PersonasDatosBasicos("Juan","Paz","0005554");
            PersonaDatosContactos dataC= new PersonaDatosContactos("995165156","Calle Mazanita 45","juancito@gmail.com");
            PersonaDatoRegistros dataR= new PersonaDatoRegistros("juanito123","123456","juanjuan1@pepito.com"); 
            
            Persona2 per2= new Persona2(dataB,dataC,dataR);
            
            Persona carlitos = Persona.Carlos();
            Persona marco = Persona.Marcos();
            Persona juana = Persona.Juanita();
    }
    
}
