
package cl.modelo;
public class Persona {
    private String nombre;
    private int edad;
    private String cedula;
    private String genero;
    private float peso;
    private float altura;
    private String nutri;
    
    public Persona(){
     this.nombre = "";
     this.edad = 0;
     this.cedula = "";
     this.genero = "hombre";
     this.peso = 0.0f;
     this.altura = 0.0f;
     this.nutri= "";
        
    }
    
    public Persona(String nombre, int edad, String cedula, String genero,float peso,float altura, String nutri){
     this.nombre = nombre;
     this.edad = edad;
     this.cedula = cedula;
     this.genero = genero;
     this.peso = peso;
     this.altura = altura;
     this.nutri = nutri;    
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getCedula(){
        return this.cedula;
    }
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String Genero){
        this.genero = genero;
    }
    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public String getNutricion(){
        return this.nutri;
    }
    public void setNutricion(String nutri){
        this.nutri = nutri;
    }
    
    public float imc(){
        float imc;
        imc = getPeso()/(float)Math.pow(getAltura(),2);
        return imc;
    }
    
    public String estadoNutricional(){
        String valor = "";
        if(imc()<18.50){
            if(imc() < 16.00)
            valor = "Delgadez Severa";  
            else if(imc()>=16.00 && imc()<=16.99)
            valor = "Delgadez Moderada"; 
            else if(imc()>=17.00 && imc()<=18.49)
            valor = "Delgadez Severa";      
        }//fin del if de bajo de peso
        else if(imc()>=18.5 && imc()<=24.99){
            valor = "Normal"; 
        }//fin del elseif normal
        else if(imc()>=25.00){
            if(imc()>=25.00 && imc()<=29.99)
            valor = "Preobeso"; 
            
        }//fin del elseif sobrepeso
        else if(imc()>=30.00){
            if(imc()>=30.00 && imc()<=34.99)
            valor = "Obesidad Level"; 
            else if(imc()>=35.00 && imc()<=39.99)
            valor = "Obesidad Media"; 
            else if(imc()>=40.00)
            valor = "Obesidad Morbida";         
        }//fin del elseif obesidad
        
        return valor;
    }//fin del metodo estadoNutricional

    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + ", edad = " + edad + ", cedula = " + cedula + ", genero = " + genero + ", peso = " + peso + ", altura = " + altura + "estado nutricional = " + estadoNutricional() +'}';
    }
    
    
}
