/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion3.Entidades;

public class Persona2 {

    private PersonasDatosBasicos dataB;
    private PersonaDatosContactos dataC;
    private PersonaDatoRegistros dataR;

    public Persona2(PersonasDatosBasicos dataB, PersonaDatosContactos dataC, PersonaDatoRegistros dataR) {
        this.dataB = dataB;
        this.dataC = dataC;
        this.dataR = dataR;
    }

    public PersonasDatosBasicos getDataB() {
        return dataB;
    }

    public void setDataB(PersonasDatosBasicos dataB) {
        this.dataB = dataB;
    }

    public PersonaDatosContactos getDataC() {
        return dataC;
    }

    public void setDataC(PersonaDatosContactos dataC) {
        this.dataC = dataC;
    }

    public PersonaDatoRegistros getDataR() {
        return dataR;
    }

    public void setDataR(PersonaDatoRegistros dataR) {
        this.dataR = dataR;
    }
    public Persona2(){}
    
    
}
